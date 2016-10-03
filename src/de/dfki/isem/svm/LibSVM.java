package de.dfki.isem.svm;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import libsvm.svm;
import libsvm.svm_model;
import libsvm.svm_node;
import libsvm.svm_parameter;
import libsvm.svm_problem;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;

/**
 * Wrapper class for the Java version of libSVM implementing the <code>ISVM</code> interface. This encapsulates
 * the code for accessing the libSVM package, which was derived from C++. The generic functionality of
 * <code>AbstractSVM</code> (e.g. n-fold cross validation implementation) is re-used for this SVM.
 * 
 * @author Patrick Kapahnke
 */
// TODO Implement scaling! (here or at TrainingSet)
public class LibSVM<Domain> extends AbstractSVM<Domain> {
	
	/**
	 * Filename of temp-file for model parsing.
	 */
	public static final String			MODEL_FILENAME = "svm.model";
	
	private Logger						logger = Logger.getLogger(this.getClass());
			
	/**
	 * Additional output of libSVM training. Needed for sample/hyperplane distance computation (-> bias).
	 */
	protected double					rho;
	
	/**
	 * Additional output of libSVM training. Needed for sample/hyperplane distance computation (-> |w|).
	 */
	protected double					obj;
	
	/**
	 * This is important to remember to compute distance and class membership. Internal labels in libSVM may be switched.
	 */
	protected int						firstLabel;
	
	/**
	 * Parameters, which have been used during training of the SVM.
	 */
	protected LibSVMParameters			parameters = null;
	
	/**
	 * Alpha values for each support vector.
	 */
	protected Vector<Double>			alpha = null;
	
	/**
	 * Sum of all alpha values.
	 */
	protected double					sumAlpha;
	
	/**
	 * Support vectors (first dimension: vectors, second dimension: vector entries).
	 */
	protected Vector<Vector<Double>>	sv = null;
	
	/**
	 * Default constructor, which must be available for all implementations of <code>AbstractSVM</code>.
	 */
	public LibSVM() {
		
	}
	
	/**
	 * Sets up LibSVM directly using a previously trained and saved model. This is just a shortcut for the
	 * model loading functionality provided in this class.
	 * 
	 * @param svmModel
	 * @throws IOException
	 */
	public LibSVM(File svmModel) throws IOException {
		loadTrainedModel(svmModel);
	}
	
	/**
	 * Trains the libSVM using the provided training set and the specified parameters. All training samples of
	 * the set must have a filled feature vector of dimension greater than 0.
	 * 
	 * @param trainingSet Training set.
	 * @param parameters Parameter setting.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public void train(TrainingSet<Domain> trainingSet, SVMParameters parameters) throws SVMException {
		// catch error related to incompatible or invalid parameter settings
		if(!LibSVMParameters.class.isInstance(parameters)) {
			SVMException exception = new SVMException("Incompatible parameters settings for LibSVM: " + parameters.getClass().getName());
			logger.error("Unable to train SVM.", exception);
			throw exception;
		}
		if(!parameters.areValid()) {
			SVMException exception = new SVMException("Invalid parameters settings for LibSVM.");
			logger.error("Unable to train SVM.", exception);
			throw exception;
		}
		
		try {
			// setup the problem in libSVM format
			svm_problem libSVMProb = new svm_problem();
			libSVMProb.x = new svm_node[trainingSet.getSize()][trainingSet.getNumOfDimensions()];
			libSVMProb.y = new double[trainingSet.getSize()];
			int i = 0;
			for(Sample<Domain> sample : trainingSet.getSample()) {
				// x
				EList<Double> features = sample.getFeature();
				for(int j = 0; j < features.size(); j++) {
					libSVMProb.x[i][j] = new svm_node();
					libSVMProb.x[i][j].index = j + 1;
					libSVMProb.x[i][j].value = features.get(j);
				}	
				// y
				if(sample.isRelevant())
					libSVMProb.y[i] = 1.0;
				else
					libSVMProb.y[i] = -1.0;
				
				i++;
			}		
			// Set size of the training set
			libSVMProb.l = trainingSet.getSize();
			
			// setup the parameters in libSVM format
			svm_parameter libSVMParam = new svm_parameter();
			
			// C-SVC
			if(parameters.get(LibSVMParameters.TYPE).equals(LibSVMParameters.C_SVC)) {
				libSVMParam.svm_type = svm_parameter.C_SVC;
				libSVMParam.C = new Double(parameters.get(LibSVMParameters.C));
			}
			// nu-SVC
			else if(parameters.get(LibSVMParameters.TYPE).equals(LibSVMParameters.NU_SVC)) {
				libSVMParam.svm_type = svm_parameter.NU_SVC;
				libSVMParam.nu = new Double(parameters.get(LibSVMParameters.NU));
			}
			
			// linear kernel
			if(parameters.get(LibSVMParameters.KERNEL).equals(LibSVMParameters.LINEAR)) {
				libSVMParam.kernel_type = svm_parameter.LINEAR;
			}
			// polynomial kernel
			else if(parameters.get(LibSVMParameters.KERNEL).equals(LibSVMParameters.POLYNOMIAL)) {
				libSVMParam.kernel_type = svm_parameter.POLY;
				libSVMParam.gamma = new Double(parameters.get(LibSVMParameters.GAMMA));
				libSVMParam.coef0 = new Double(parameters.get(LibSVMParameters.COEF0));
				libSVMParam.degree = new Integer(parameters.get(LibSVMParameters.DEGREE));
			}
			// RBF kernel
			else if(parameters.get(LibSVMParameters.KERNEL).equals(LibSVMParameters.RBF)) {
				libSVMParam.kernel_type = svm_parameter.RBF;
				libSVMParam.gamma = new Double(parameters.get(LibSVMParameters.GAMMA));
			}
			// sigmoid kernel
			else if(parameters.get(LibSVMParameters.KERNEL).equals(LibSVMParameters.SIGMOID)) {
				libSVMParam.kernel_type = svm_parameter.SIGMOID;
				libSVMParam.gamma = new Double(parameters.get(LibSVMParameters.GAMMA));
				libSVMParam.coef0 = new Double(parameters.get(LibSVMParameters.COEF0));
			}
			
			libSVMParam.eps = new Double(parameters.get(LibSVMParameters.EPSILON));
			libSVMParam.cache_size = new Double(parameters.get(LibSVMParameters.CACHESIZE));
			if(new Boolean(parameters.get(LibSVMParameters.SHRINKING)).booleanValue())
				libSVMParam.shrinking = 1;
			else
				libSVMParam.shrinking = 0;
			
			// train the SVM
			PrintStream outStream = System.out;
			ByteArrayOutputStream svmOutputStream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(svmOutputStream);
			// re-direct console output to byte array stream
			System.setOut(printStream);
			// train and remember model
			svm_model model = svm.svm_train(libSVMProb, libSVMParam);
			// re-direct console out back to original
			System.setOut(outStream);
			svmOutputStream.flush();
			// parse the console output of the training phase
			parseResultOutput(svmOutputStream.toString());
			// also remember parameter setting
			this.parameters = (LibSVMParameters) parameters;
			// restore alpha's and support vectors from model file
			parseModelFile(model, trainingSet.getNumOfDimensions());
			
			int[] labels = new int[2];
			svm.svm_get_labels(model, labels);
			firstLabel = labels[0];
		}
		catch(Exception e) {
			logger.error("Unable to train SVM.", e);
			// reset all entries
			this.parameters = null;
			alpha = null;
			sv = null;
			throw new SVMException("Unable to train SVM.", e);
		}
	}
	
	/**
	 * Returns the paramter setting, which was used for training the SVM. Returns <code>null</code>, if it has not
	 * been trained yet.
	 * 
	 * @return Parameter setting used for training.
	 */
	public SVMParameters getTrainingParameters() {
		return parameters;
	}
	
	/**
	 * Helper method to retrieve additional result information (like optimization objective value, rho/bias etc.)
	 * from the output of the SVM training. Unfortunately, these are not accessible from libSVM directly. 
	 * 
	 * @param str Output string of libSVM training.
	 */
	protected void parseResultOutput(String str) {
		// Output format:
		//  
		// ...
		// optimization finished, #iter = 0
		// C = 533.3365546527031
		// obj = 2.666682773263515, rho = 0.0
		// nSV = 2, nBSV = 0
		// Total nSV = 2
		
		try {
			// find the line containing relevant information
			String line = str.substring(str.indexOf("obj = "));
			line = line.split("\n")[0];
			
			String objString = line.split(",")[0].split("obj = ")[1];
			String rhoString = line.split(",")[1].split(" rho = ")[1];
		
			obj = Double.parseDouble(objString);
			rho = Double.parseDouble(rhoString);
		}
		catch(Exception e) {
			logger.error("Error while parsing SVM output:\n" + str, e);
			obj = 0.0;
			rho = 0.0;
		}
	}
	
	/**
	 * Helper method to parse additional information (alpha's and support vectors) from the model. This is only
	 * possible using a work-around (i.e. save model to file, read model and parse information), because the
	 * libSVM implementation does not grand access to these informations.
	 * 
	 * @param model Model to parse.
	 */
	protected void parseModelFile(svm_model model, int dimensions) throws IOException {
		// save model first
		svm.svm_save_model(MODEL_FILENAME, model);
		
		// parse model file again!
		BufferedReader reader = new BufferedReader(new FileReader(MODEL_FILENAME));
		
		// skip first 9 lines
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
		reader.readLine();
				
		alpha = new Vector<Double>();
		sv = new Vector<Vector<Double>>();
		sumAlpha = 0.0;
		
		String line = reader.readLine();
		while(line != null) {
			String[] tokens = line.split(" ");
			Double a = new Double(tokens[0]);
			
			Vector<Double> svVec = new Vector<Double>();
			for(int i = 0; i < dimensions; i++)
				svVec.add(0.0);
			
			for(int i = 1; i < tokens.length; i++) {
				int pos = new Integer(tokens[i].split(":")[0]) - 1;
				double v = new Double(tokens[i].split(":")[1]);
				svVec.set(pos, v);
			}
			
			alpha.add(a);
			// sum up all alpha's
			sumAlpha += a;
			sv.add(svVec);
			
			line = reader.readLine();
		}
		
		reader.close();
	}
	
	/**
	 * Predicts the relevance of a service offer to a request represented as <code>Sample</code> using
	 * distance computation. Features have to be set in the provided sample. 
	 * 
	 * @param sample Sample to test for relevance.
	 * @return <code>true</code>, iff the offer is predicted to be relevant to the request according to features.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public boolean predict(Sample<Domain> sample) throws SVMException {
		return getDistance(sample) > 0.0;
	}
	
	/**
	 * Computes the RBF kernel, given a fixed gamma. This has to be re-implemented, because it is not accessible
	 * from libSVM directly.
	 * 
	 * @param xi First vector.
	 * @param xj Second vector.
	 * @param gamma Gamma parameter.
	 * @return RBF kernel result for xi and xj.
	 */
    private static double rbfKernel(Vector<Double> xi, EList<Double> xj, double gamma) {
    	double squaredNorm = 0.0;
    	for(int i = 0; i < xi.size(); i++)
    		squaredNorm += (xi.get(i) - xj.get(i))*(xi.get(i) - xj.get(i));
    	return Math.exp(-gamma*squaredNorm);
    }
	
	/**
	 * Computes the distance of the sample (represented as feature vector) from the seperating hyperplane.
	 * By looking at the sign of the resulting distance, the binary classification capability of a SVM can
	 * be resembled.
	 * 
	 * @param sample Sample, whose distance from the seperating hyperplane will be computed.
	 * @return Distance from the seperating hyperplane.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public double getDistance(Sample<Domain> sample) throws SVMException {		
		// C-SVC with RBF kernel
		if(parameters.get(LibSVMParameters.TYPE).equals(LibSVMParameters.C_SVC) 
				&& parameters.get(LibSVMParameters.KERNEL).equals(LibSVMParameters.RBF)) {
			// extract relevant parameters
			double gamma = Double.parseDouble(parameters.get(LibSVMParameters.GAMMA));
			double bias = -rho;
			
	        // compute decision values                   
	        double dv = 0.0;
	        EList<Double> xs = sample.getFeature();
	         
	        for(int i = 0; i < sv.size(); i++) {
	        	Vector<Double> svVec = sv.get(i);
	        	dv += alpha.get(i)*rbfKernel(svVec, xs, gamma);
	        }
	        dv += bias;
	        
	        // compute the distances from the hyperplane
	        // TODO speed up computation, e.g. precompute magnitude of W
	        double magW = obj + sumAlpha < 0 ? Math.sqrt(2*-(obj + sumAlpha)) : Math.sqrt(2*(obj + sumAlpha));
	        // switch sign according to libSVM-internal labels
	        return ((double) firstLabel)*(dv/magW);
		}
		
		// not implemented!
		throw new SVMException("Distance computation for specified SVM type and used kernel not implemented.");
	}
	
	/**
	 * Saves all relevant information to restate the SVM without the need for a new training phase. 
	 * 
	 * @param file Location to save information to.
	 * @throws IOException Thrown, if the information could not be saved for some reason.
	 */
	public void saveTrainedModel(File file) throws IOException {
		try {
			Document xml = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Element modelElem = xml.createElement("model");
			xml.appendChild(modelElem);
			
			// add parameters
			parameters.addToXMLDocument(xml);
			
			// add relevant information of this object
			// rho
			Element rhoElem = xml.createElement("rho");
			rhoElem.appendChild(xml.createTextNode(Double.toString(rho)));
			modelElem.appendChild(rhoElem);
			
			// obj
			Element objElem = xml.createElement("obj");
			objElem.appendChild(xml.createTextNode(Double.toString(obj)));
			modelElem.appendChild(objElem);
			
			// firstlabel
			Element labelElem = xml.createElement("firstlabel");
			labelElem.appendChild(xml.createTextNode(Integer.toString(firstLabel)));
			modelElem.appendChild(labelElem);
			
			//alpha's & SV's
			Element svsElem = xml.createElement("svs");
			svsElem.setAttribute("dim", Integer.toString(sv.get(0).size()));
			modelElem.appendChild(svsElem);
			for(int i = 0; i < sv.size(); i++) {
				Element svElem = xml.createElement("sv");
				svElem.setAttribute("alpha", Double.toString(alpha.get(i)));
				// create vector string (seperated by whitespaces)
				String svStr = "";
				for(int j = 0; j < sv.get(i).size(); j++)
					svStr += Double.toString(sv.get(i).get(j)) + " ";
				svStr.trim();
				svElem.appendChild(xml.createTextNode(svStr));				
				svsElem.appendChild(svElem);
			}
			
			// save the XML document to the defined file
			try {
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				DOMSource source = new DOMSource(xml);
				FileOutputStream os = new FileOutputStream(file);
				StreamResult streamResult = new StreamResult(os);
				transformer.transform(source, streamResult);
			}
			catch(TransformerConfigurationException e) {
				logger.error("Unable to save SVM model to " + file.toString() + ".", e);
				throw new IOException("Unable to save SVM model to " + file.toString() + ".", e);
			}
			catch(FileNotFoundException e) {
				logger.error("Unable to save SVM model to " + file.toString() + ".", e);
				throw new IOException("Unable to save SVM model to " + file.toString() + ".", e);
			}
			catch(TransformerException e) {
				logger.error("Unable to save SVM model to " + file.toString() + ".", e);
				throw new IOException("Unable to save SVM model to " + file.toString() + ".", e);
			}
		}
		catch(ParserConfigurationException e) {
			logger.error("Unable to save SVM model to " + file.toString() + ".", e);
			throw new IOException("Unable to save SVM model to " + file.toString() + ".", e);
		}		
	}
	
	/**
	 * Loads all relevant information to restate the SVM without the need for a new training phase.
	 * 
	 * @param file Location to load information from.
	 * @throws IOException Thrown, if the information could not be loaded for some reason.
	 */
	public void loadTrainedModel(File file) throws IOException {
		// reset all entries
		alpha = new Vector<Double>();
		sv = new Vector<Vector<Double>>();
		parameters = null;
		
		// parse information
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
			for(int i = 0; i < document.getDocumentElement().getChildNodes().getLength(); i++) {
				Node subNode = document.getDocumentElement().getChildNodes().item(i);
				// skip all non-element nodes
				if(subNode.getNodeType() != Node.ELEMENT_NODE)
					continue;
				Element elem = (Element) subNode;
				
				if(elem.getNodeName().equals("rho")) {
					rho = Double.parseDouble(elem.getTextContent());
					continue;
				}
				if(elem.getNodeName().equals("obj")) {
					obj = Double.parseDouble(elem.getTextContent());
					continue;
				}
				if(elem.getNodeName().equals("firstlabel")) {
					firstLabel = Integer.parseInt(elem.getTextContent());
					continue;
				}
				if(elem.getNodeName().equals("parameters")) {
					parameters = (LibSVMParameters) SVMParameters.parse(elem);
					continue;
				}
				if(elem.getNodeName().equals("svs")) {
					sumAlpha = 0.0;
					for(int j = 0; j < elem.getChildNodes().getLength(); j++) {
						subNode = elem.getChildNodes().item(j);
						// skip all non-element nodes
						if(subNode.getNodeType() != Node.ELEMENT_NODE)
							continue;
						Element svElem = (Element) subNode;
						Double a = new Double(svElem.getAttribute("alpha"));
						// also calculate the sum of all alpha's
						sumAlpha += a;
						alpha.add(a);
						// parse features
						String[] values = svElem.getTextContent().split(" ");
						sv.add(new Vector<Double>());
						for(String value : values)
							sv.lastElement().add(new Double(value));
					}
					continue;
				}
			}
		}
		catch(SAXException e) {
			logger.warn("Parsing error while processing " + file.toString() + ".", e);
			// reset all entries
			alpha = null;
			sv = null;
			parameters = null;
			throw new IOException("Parsing error while processing " + file.toString() + ".", e);
		}
		catch(IOException e) {
			logger.warn("File " + file.toString() + " not found. Unable to parse SVM model.", e);
			// reset all entries
			alpha = null;
			sv = null;
			parameters = null;
			throw new IOException("File " + file.toString() + " not found. Unable to parse SVM model.", e);
		}
		catch(ParserConfigurationException e) {
			logger.warn("Unable to create XML parser.", e);
			// reset all entries
			alpha = null;
			sv = null;
			parameters = null;
			throw new IOException("Unable to create XML parser.", e);
		}
	}
		
	/**
	 * Simple test run.
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//		LibSVM svm = new LibSVM();
//		
//		LibSVMParameters parameters = new LibSVMParameters();
//		parameters.put(LibSVMParameters.EPSILON, "0.01");
//		parameters.put(LibSVMParameters.CACHESIZE, "1000");
//		parameters.put(LibSVMParameters.SHRINKING, LibSVMParameters.SHRINKING_DISABLED);
//		parameters.put(LibSVMParameters.TYPE, LibSVMParameters.C_SVC);
//		parameters.put(LibSVMParameters.KERNEL, LibSVMParameters.RBF);
//		parameters.put(LibSVMParameters.C, "1.0");
//		parameters.put(LibSVMParameters.GAMMA, "0.5");
//		
//		TrainingSet trainingSet = new TrainingSet();
//		
//		Sample sample = new Sample(true);
//		Vector<Double> features = new Vector<Double>();
//		features.add(1.0);
//		features.add(0.7);
//		features.add(0.0);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.0);
//		features.add(0.2);
//		features.add(0.3);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.1);
//		features.add(0.3);
//		features.add(0.4);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(true);
//		features = new Vector<Double>();
//		features.add(0.8);
//		features.add(0.9);
//		features.add(0.7);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(true);
//		features = new Vector<Double>();
//		features.add(0.7);
//		features.add(0.95);
//		features.add(0.4);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.0);
//		features.add(0.2);
//		features.add(0.5);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.1);
//		features.add(0.0);
//		features.add(0.4);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(true);
//		features = new Vector<Double>();
//		features.add(0.3);
//		features.add(1.0);
//		features.add(0.7);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(true);
//		features = new Vector<Double>();
//		features.add(1.0);
//		features.add(0.6);
//		features.add(0.3);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.0);
//		features.add(0.2);
//		features.add(0.0);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(false);
//		features = new Vector<Double>();
//		features.add(0.6);
//		features.add(0.3);
//		features.add(0.0);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		sample = new Sample(true);
//		features = new Vector<Double>();
//		features.add(0.6);
//		features.add(0.6);
//		features.add(1.0);
//		sample.setFeatures(features);
//		trainingSet.addTrainingSample(sample);
//		
//		features = new Vector<Double>();
//		features.add(0.2);
//		features.add(0.3);
//		features.add(0.4);
//		Sample toCheck = new Sample(features);
//		
//		try {
//			// test training
//			svm.train(trainingSet, parameters);
//			// test n-fold cross validation
//			System.out.println("n-fold cross validation accuracy: " + svm.nFoldCrossValidation(trainingSet, parameters, 2, 0));
//			// test prediction
//			System.out.println("sample prediction: " + svm.predict(toCheck));
//			// test distance computation
//			System.out.println("sample distance computation: " + svm.getDistance(toCheck));
//			// model selection
//			ModelSearchSpace searchSpace = new ModelSearchSpace(parameters);
//			double cLowerBound = Math.pow(2.0,-5.0);
//			double cUpperBound = Math.pow(2.0, 15.0);
//			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.C, Double.toString(cLowerBound), Double.toString(cUpperBound), 2.0));
//			double gammaLowerBound = Math.pow(2.0, -15.0);
//			double gammaUpperBound = Math.pow(2.0, 3.0);
//			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.GAMMA, Double.toString(gammaLowerBound), Double.toString(gammaUpperBound), 2.0));
//			svm.searchModel(trainingSet, searchSpace, 2, 0);
//			// model saving
//			System.out.println("Saving model...");
//			svm.saveTrainedModel(new File("SVM.xml"));
//			// model loading
//			System.out.println("Loading model...");
//			svm.loadTrainedModel(new File("SVM.xml"));
//			// test training
//			svm.train(trainingSet, parameters);
//			// test n-fold cross validation
//			System.out.println("n-fold cross validation accuracy: " + svm.nFoldCrossValidation(trainingSet, parameters, 2, 0));
//			// test prediction
//			System.out.println("sample prediction: " + svm.predict(toCheck));
//			// test distance computation
//			System.out.println("sample distance computation: " + svm.getDistance(toCheck));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}
