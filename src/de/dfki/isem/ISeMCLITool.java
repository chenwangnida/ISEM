package de.dfki.isem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import de.dfki.s2m2.MatchingEngine;
import de.dfki.s2m2.MatchingException;
import de.dfki.s2m2.MatchingResult;
import de.dfki.isem.s2m2.filter.learning.LearningFactory;
import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingException;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewGenerationException;
import de.dfki.sme2.RelevanceSet;
import de.dfki.sme2.TestCollection;

import org.apache.log4j.Logger;

public class ISeMCLITool {
	
	private static Logger	logger = Logger.getLogger(ISeMCLITool.class);
	
	private static File		DEFAULT_MODEL = new File("default_model.xml");
	
	private static String	DEFAULT_FILTER_MODEL = "filter/isem/logic-based.filter";
	
	private static String	WELCOME = "Welcome to iSeM v1.1 (Intelligent Service Matchmaker).";
	
	private static String	COPYRIGHT = "(c) DFKI GmbH 2010";
	
	private static String	USAGE = "Usage: java -jar isem.jar";
	
	private static String	T = "-t";
	
	private static String	TRAININGSET = "<trainingset>";
		
	private static String	H = "-h";
		
	private static String	C = "-c";
	
	private static String	X = "-x";
	
	private static String	F = "-f";
	
	private static String	FILTER_MODEL = "<filtermodel>";
	
	private static String	TC = "<testcollection>";
	
	private static String	REQUESTS = "<request(s)>";
	
	private static String	OFFERS = "<offer(s)>+";
	
	private static String	M = "-m";
	
	private static String	MODEL = "<model>";
	
	private static String	V = "-v";
	
	private static String	O = "-o";
	
	private static String	OUTPUT = "<output>";
	
	private static String	REQUESTS_EXPL = "URL or path to OWL-S request document or path to directory of (multiple) OWL-S request documents.";
	
	private static String	OFFERS_EXPL = "URL or path to OWL-S offer document or path to directory of (multiple) OWL-S offer documents. Multiple occurences in arbitrary combination allowed.";
	
	private static String	H_EXPL = "Displays this help message.";
	
	private static String	C_EXPL = "Experiment setup as subsequent arguments in command line interface. " + H + ", " + X + " and " + T + " are exclusive.";
	
	private static String	X_EXPL = "Experiment setup using XML test collection from SME2. " + H + ", " + X + " and " + T + " are exclusive.";
	
	private static String	TC_EXPL = "XML format for test collection as in SME2";
	
	private static String	M_EXPL = "Sets the SVM model file to use or the create. \"" + DEFAULT_MODEL.getName() + "\" is used by default.";
	
	private static String	T_EXPL = "Sets iSeM to training mode. Provided test collection XML is used for supervised training. " + H + ", " + X + " and " + T + " are exclusive.";
	
	private static String	TRAININGSET_EXPL = "Training set to train iSeM. XML format for binary relevance as in SME2.";
	
	private static String	MODEL_EXPL = "Model XML file location.";
	
	private static String	F_EXPL = "Sets the filter model file to use. Fully-fledged iSeM as specified in \"" + DEFAULT_FILTER_MODEL + "\" is used by default.";
	
	private static String	FILTER_MODEL_EXPL = "Filter model file (.filter) used in the matching engine.";
	
	private static String	V_EXPL = "Run in verbose mode.";
	
	private static String	O_EXPL = "Write result rankings as XML to specified location. If this option is not set, output will printed to the console.";
	
	private static String	OUTPUT_EXPL = "Output XML file.";
	
	private static String	NO_REQUEST_ERROR = "Error: At least one OWL-S request must be specified.";
	
	private static String	NO_OFFER_ERROR = "Error: At least one OWL-S offer must be specified.";
	
	private static String	FILE_NOT_FOUND_ERROR = "Error: The specified file does not exist.";
	
	private static String	NO_MODEL_ERROR = "Error: Model option is set but no file is specified.";
	
	private static String	MATCHING_ERROR = "Error: Matching error. See stack trace for details.";
	
	private static String	NO_TC_ERROR = "Error: A test collection XML file must be provided for the -x option.";
	
	private static String	NO_OUTPUT_ERROR = "Error: Output option is set but no file is specified.";
	
	private static String	SAVE_ERROR = "Error: Unable to write result rankings to file.";
	
	private static String	OPTIONS_ERROR = "Error: Invalid combination of matching/training options. Exactly one of (" + T + ", " + C + ", " + X + ") is allowed.";
	
	private static String	TRAINING_ERROR = "Error: Training failed.";
	
	private static String	LOGGER_INFO = "See log file for details.";

	public static void main(String[] args) {
		
		System.out.println(WELCOME);
		System.out.println(COPYRIGHT);
		System.out.println();
		
		// no arguments
		if(args.length == 0) {
			printUsage();
			System.exit(0);
		}
				
		Vector<String> arguments = new Vector<String>();
		Collections.addAll(arguments, args);
				
		// help message
		if(arguments.contains(H)) {
			printUsage();
			System.out.println("  " + X + ":\t\t\t" + X_EXPL);
			System.out.println("  " + TC + ":\t" + TC_EXPL);
			System.out.println();
			System.out.println("  " + C + ":\t\t" + C_EXPL);
			System.out.println("  " + REQUESTS + ":\t" + REQUESTS_EXPL);
			System.out.println("  " + OFFERS + ":\t" + OFFERS_EXPL);
			System.out.println();
			System.out.println("  " + O + ":\t\t" + O_EXPL);
			System.out.println("  " + OUTPUT + ":\t" + OUTPUT_EXPL);
			System.out.println();
			System.out.println("  " + M + ":\t\t" + M_EXPL);
			System.out.println("  " + MODEL + ":\t" + MODEL_EXPL);
			System.out.println();
			System.out.println("  " + T + ":\t\t\t" + T_EXPL);
			System.out.println("  " + TRAININGSET + ":\t" + TRAININGSET_EXPL);
			System.out.println();
			System.out.println("  " + F + ":\t\t\t" + F_EXPL);
			System.out.println("  " + FILTER_MODEL + ":\t" + FILTER_MODEL_EXPL);
			System.out.println();
			System.out.println("  " + V + ":\t" + V_EXPL);
			System.out.println();
			System.out.println("  " + H + ":\t" + H_EXPL);
			System.out.println();
			System.exit(0);
		}
		
		// validate matching/training options
		int variants = 0;
		if(arguments.contains(T))
			variants++;
		if(arguments.contains(C))
			variants++;
		if(arguments.contains(X))
			variants++;
		if(variants != 1) {
			System.err.println(OPTIONS_ERROR);
			System.exit(1);
		}
		
		// verbose yes/no
		boolean verbose = false;
		if(arguments.contains(V))
			verbose = true;
		
		// model setup
		File modelFile = DEFAULT_MODEL;
		if(arguments.contains(M)) {
			// fetch model specification
			try {
				String modelString  = arguments.get(arguments.indexOf(M) + 1);
				if(modelString.startsWith("-")) {
					System.err.println(NO_MODEL_ERROR);
					System.exit(1);
				}
				modelFile = new File(modelString);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_MODEL_ERROR);
				System.exit(1);
			}
		}
		else {
			if(verbose) {
				System.out.println("Default model file location \"" + DEFAULT_MODEL + "\" is used.");
				System.out.println();
			}
		}
		
		// filtermodel setup
		String filterModel = DEFAULT_FILTER_MODEL;
		if(arguments.contains(F)) {
			// fetch model specification (.filter)
			try {
				filterModel  = arguments.get(arguments.indexOf(F) + 1);
				if(filterModel.startsWith("-")) {
					System.err.println(NO_MODEL_ERROR);
					System.exit(1);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_MODEL_ERROR);
				System.exit(1);
			}
		}
		else {
			if(verbose) {
				System.out.println("Default file model location \"" + DEFAULT_FILTER_MODEL + "\" is used.");
				System.out.println();
			}
		}
				
		// output to file?
		File outputFile = null;
		if(arguments.contains(O)) {
			// fetch output file location
			try {
				String outputString = arguments.get(arguments.indexOf(O) + 1);
				if(outputString.startsWith("-")) {
					System.err.println(NO_OUTPUT_ERROR);
					System.exit(1);
				}
				outputFile = new File(outputString);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_OUTPUT_ERROR);
				System.exit(1);
			}
		}
		
		// cmd line setup for matching
		if(arguments.contains(C)) {
			// fetch request argument
			String requestString = null;
			int requestIndex = arguments.indexOf(C) + 1;
			try {
				requestString = arguments.get(requestIndex);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_REQUEST_ERROR);
				System.exit(1);
			}
			Set<URI> requests = null;
			try {
				requests = getUris(requestString);
			}
			catch(FileNotFoundException e) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + requestString + ")");
				System.exit(1);
			}
			
			// fetch offer arguments
			HashSet<String> offerStrings = new HashSet<String>();
			for(int i = requestIndex + 1; i < arguments.size(); i++) {
				String str = arguments.get(i);
				if(str.startsWith("-"))
					break;
				offerStrings.add(str);
			}
			if(offerStrings.isEmpty()) {
				System.err.println(NO_OFFER_ERROR);
				System.exit(1);
			}
			Set<URI> offers = new HashSet<URI>();

			for(String offerString : offerStrings) {
				try {
					offers.addAll(getUris(offerString));
				}
				catch(FileNotFoundException e) {
					System.err.println(FILE_NOT_FOUND_ERROR + " (" + offerString + ")");
					System.exit(1);
				}
			}

			// check if model file exists
			if(!modelFile.exists()) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + modelFile.getName() + ")");
				System.exit(1);
			}
			
			// match
			Map<URI, Vector<MatchingResult>> matchingResult = match(requests, offers, modelFile, filterModel, verbose);
			
			// display results
			if(outputFile == null)
				printRankings(matchingResult);
			else {
				try {
					saveRankings(outputFile, matchingResult, "iSeM Intelligent Service Matchmaker", "from command line interface");
				}
				catch(IOException e) {
					System.err.println(SAVE_ERROR + " (" + outputFile.toString() + ")");
					logger.error(SAVE_ERROR + " (" + outputFile.toString() + ")", e);
					System.err.println(LOGGER_INFO);
					System.exit(1);
				}
			}
			
			System.exit(0);
		}
		
		// match using SME2 test collection
		if(arguments.contains(X)) {
			Set<URI> requests = null;
			Set<URI> offers = null;
			String tcName = null;
			try {
				String tcString = arguments.get(arguments.indexOf(X) + 1);
				TestCollection tc = TestCollection.parse(tcString);
				if(tc == null) {
					System.err.println(FILE_NOT_FOUND_ERROR + " (" + tcString + ")");
					System.exit(1);
				}
				tcName = tc.getName();
				if(verbose)
					printTCInfo(tc);
				requests = new HashSet<URI>();
				for(URI request : tc.getQueries()) {
					requests.add(request);
				}
				offers = new HashSet<URI>();
				for(URI offer : tc.getServiceOffers()) {
					offers.add(offer);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_TC_ERROR);
				System.exit(1);
			}
			
			// check if model file exists
			if(!modelFile.exists()) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + modelFile.getName() + ")");
				System.exit(1);
			}
			
			// match
			Map<URI, Vector<MatchingResult>> matchingResult = match(requests, offers, modelFile, filterModel, verbose);
			
			// display results
			if(outputFile == null)
				printRankings(matchingResult);
			else {
				try {
					saveRankings(outputFile, matchingResult, "iSeM Intelligent Service Matchmaker", tcName);
				}
				catch(IOException e) {
					System.err.println(SAVE_ERROR + " (" + outputFile.toString() + ")");
					logger.error(SAVE_ERROR + " (" + outputFile.toString() + ")", e);
					System.err.println(LOGGER_INFO);
					System.exit(1);
				}
			}
			
			System.exit(0);
		}
		
		if(arguments.contains(T)) {
			try {
				// fetch TC to be used for training
				String tcString = arguments.get(arguments.indexOf(T) + 1);
				TestCollection tc = TestCollection.parse(tcString);
				if(verbose)
					printTCInfo(tc);
				
				// train
				train(tc, modelFile, filterModel, verbose);
				
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(NO_TC_ERROR);
				System.exit(1);
			}
		}
	}
	
	private static void printUsage() {
		System.out.println(USAGE + " [" + X + " " + TC + "] [" + C + " " + REQUESTS + " " + OFFERS + "] [" + O + " " + OUTPUT + "] [" + M + " " + MODEL + "] [" + T + " " + TRAININGSET + "] [" + F + " " + FILTER_MODEL + "] [" + V + "] [" + H + "]");
		System.out.println();
	}
	
	private static Set<URI> getUris(String str) throws FileNotFoundException {		
		// is URI?
		try {
			URI uri = new URI(str);			
			if(uri.getScheme().equals("file")) {
				File file = new File(uri);
				if(!file.exists())
					throw new FileNotFoundException();
				if(file.isDirectory()) {
					return getUrisFromDirectory(file);
				}
			}
			return Collections.singleton(uri);		
		}
		catch(URISyntaxException e) {
			// no URI!
		}
		
		// is existing file?
		File file = new File(str);
		if(!file.exists())
			throw new FileNotFoundException();
		if(file.isDirectory())
			return getUrisFromDirectory(file);
		return Collections.singleton(file.toURI());
	}
	
	private static Set<URI> getUrisFromDirectory(File dir) {
		Set<URI> uris = new HashSet<URI>();	
		for(File file : dir.listFiles()) {
			if(file.isDirectory())
				uris.addAll(getUrisFromDirectory(file));
			else
				uris.add(file.toURI());
		}
		return uris;
	}
	
	private static Map<URI, Vector<MatchingResult>> match(Set<URI> requests, Set<URI> offers, File modelFile, String filterModel, boolean verbose) {
		// create iSeM matchmaker
		MatchingEngine iSeM = ISeMFactory.createMatchingEngine(org.eclipse.emf.common.util.URI.createFileURI(filterModel));
		try {
			((LibSVMAggregation) iSeM.getSetup().getFeatureSpace().iterator().next()).loadModel(modelFile.toString());
		} catch (IOException e1) {
			System.err.println(MATCHING_ERROR);
			System.exit(1);
		} catch (ClassCastException e) {
			// no libSVM, no moedl file loading required
		}
		
		ServiceRegistry registry = iSeM.getServiceRegistry();
		
		int count = 1;
		for(URI offer : offers) {
			try {
				if(verbose) {
					System.out.println("Register service offer " + count + " of " + offers.size());
				}
				registry.registerServices(offer.toURL());
				count++;
			}
			catch(IOException e) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + offer.toString() + ")");
				logger.error(FILE_NOT_FOUND_ERROR + " (" + offer.toString() + ")", e);
				System.err.println(LOGGER_INFO);
				System.exit(1);
			}
		}
		if(verbose)
			System.out.println("Service Registration completed. " + offers.size() + " in total.");
		
		count = 1;
		Map<URI, Vector<MatchingResult>> rankings = new HashMap<URI, Vector<MatchingResult>>();
		for(URI request : requests) {
			try {
				if(verbose) {
					System.out.println("Match request " + count + " of " + requests.size());
				}
				rankings.put(request, iSeM.match(request.toURL()));
				count++;
			}
			catch(MatchingException e) {
				System.err.println(MATCHING_ERROR);
				logger.error(MATCHING_ERROR, e);
				System.err.println(LOGGER_INFO);
				System.exit(1);
			}
			catch(IOException e) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + request.toString() + ")");
				System.exit(1);
			}
		}
		if(verbose)
			System.out.println("Matching completed. " + requests.size() + " in total.");
			
		return rankings;
	}
	
	private static void train(TestCollection tc, File modelFile, String filterModel, boolean verbose) {
		// create matcher for training only
		MatchingEngine iSeM = ISeMFactory.createMatchingEngine(org.eclipse.emf.common.util.URI.createFileURI(filterModel));
		
		// prepare training set from test collection
		TrainingSet<ServiceView> trainingSet = LearningFactory.eINSTANCE.createTrainingSet();
		for(URI request : tc.getQueries()) {
			URI requestService = null;
			try {
				requestService = iSeM.getServiceRegistry().registerServices(request.toURL()).iterator().next();
			} catch (IOException e) {
				System.err.println(FILE_NOT_FOUND_ERROR + " (" + request.toString() + ")");
				System.exit(1);
			}
			RelevanceSet relSet = tc.getRelevanceSet(request);
			for(URI offer : tc.getServiceOffers()) {
				URI offerService = null;
				try {
					offerService = iSeM.getServiceRegistry().registerServices(offer.toURL()).iterator().next();
				} catch (IOException e) {
					System.err.println(FILE_NOT_FOUND_ERROR + " (" + offer.toString() + ")");
					System.exit(1);
				}
				Sample<ServiceView> sample = LearningFactory.eINSTANCE.createSample();					
				try {
					sample.setRequest(iSeM.getServiceRegistry().getViewOnService(requestService, iSeM.getSetup().getViewExtractor()));
				} catch (ViewGenerationException e) {
					System.err.println(TRAINING_ERROR);
					System.err.println(LOGGER_INFO);
					logger.error(TRAINING_ERROR, e);
					System.exit(1);
				}
				try {
					sample.setCandidate(iSeM.getServiceRegistry().getViewOnService(offerService, iSeM.getSetup().getViewExtractor()));
				} catch (ViewGenerationException e) {
					System.err.println(TRAINING_ERROR);
					System.err.println(LOGGER_INFO);
					logger.error(TRAINING_ERROR, e);
					System.exit(1);
				}
				sample.setRelevant(relSet.isBinaryRelevant(offer));
				trainingSet.getSample().add(sample);
			}
		}
		
		if(verbose) {
			System.out.println(trainingSet.getSize() + " samples available. Training started...");
		}

		try {
			LibSVMAggregation libSVM = (LibSVMAggregation) iSeM.getSetup().getFeatureSpace().iterator().next();
			libSVM.train(trainingSet);
			libSVM.saveModel(modelFile.toString());
		} catch (TrainingException e) {
			System.err.println(TRAINING_ERROR);
			System.err.println(LOGGER_INFO);
			logger.error(TRAINING_ERROR, e);
			System.exit(1);
		} catch (IOException e) {
			System.err.println(TRAINING_ERROR);
			System.err.println(LOGGER_INFO);
			logger.error(TRAINING_ERROR, e);
			System.exit(1);
		} catch (ClassCastException e) {
			System.err.println(TRAINING_ERROR);
			System.err.println(LOGGER_INFO);
			logger.error(TRAINING_ERROR, e);
			System.exit(1);			
		}
		
		if(verbose) {
			System.out.println("Training finised. Model saved to \"" + modelFile.toString() + "\".");
		}
	}
	
	private static void printTCInfo(TestCollection tc) {
		System.out.println("Test collection information:");
		System.out.println("Name:\t\t" + tc.getName());
		System.out.println("Authors:\t" + tc.getAuthors());
		System.out.println("Type:\t\t" + tc.getType());
		System.out.println("Desc:\t\t" + tc.getDescription());
		System.out.println();
	}
	
	private static void printRankings(Map<URI, Vector<MatchingResult>> rankings) {
		for(URI request : rankings.keySet()) {
			System.out.println(request.toString() + ":");
			for(int i = 0; i < request.toString().length(); i++)
				System.out.print("-");
			System.out.println();
			
			Vector<MatchingResult> ranking = rankings.get(request);
			for(int i = 0; i < ranking.size(); i++) {
				MatchingResult result = ranking.get(i);
				try {
					System.out.println("  " + (i + 1) + ": " + result.getServiceOffer() + " - " + result.getFeatures().values().iterator().next());
				}
				catch (NoSuchElementException e) {
					System.out.println("  " + (i + 1) + ": " + result.getServiceOffer() + " - no result");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void saveRankings(File file, Map<URI, Vector<MatchingResult>> rankings, String matchmakerName, String tcName) throws IOException {
		try {
			Document xml = null;
			Element eval = null;
			
			// create
			xml = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			eval = xml.createElement("evaluation");
			xml.appendChild(eval);
			
			// <result>
			Element resultElem = xml.createElement("result");
			resultElem.setAttribute("matchmaker", matchmakerName);
			
			// <environment>
			Element environment = xml.createElement("environment");
			
			Element timeStamp = xml.createElement("timestamp");
			timeStamp.setTextContent(new Long((new Date()).getTime()).toString());
			environment.appendChild(timeStamp);
			
			Element testCollection = xml.createElement("testcollection");
			testCollection.setTextContent(tcName);
			environment.appendChild(testCollection);
			
			Element java = xml.createElement("java");
			java.setTextContent(System.getProperty("java.version"));
			environment.appendChild(java);
			
			Element system = xml.createElement("system");
			system.setTextContent(System.getProperty("os.name"));
			system.setAttribute("version", System.getProperty("os.version"));
			system.setAttribute("architecture", System.getProperty("os.arch"));
			environment.appendChild(system);
			
			resultElem.appendChild(environment);
			
			// <rankings>
			Element rankingsElem = xml.createElement("rankings");
			
			for(URI query : rankings.keySet()) {
				Vector<MatchingResult> rankedResult = rankings.get(query);
				Element ranking = xml.createElement("ranking");
				ranking.setAttribute("query", query.toString());
				
				int rankId = 1;
				for(MatchingResult result : rankedResult) {
					Element rank = xml.createElement("rank");
					rank.setTextContent(result.getServiceOffer().toString());
					rank.setAttribute("id", new Integer(rankId++).toString());
					try {
						rank.setAttribute("match", "" + result.getFeatures().values().iterator().next());
					}
					catch(Exception e) {
						rank.setAttribute("match", "error");
					}
					
					ranking.appendChild(rank);
				}
				
				rankingsElem.appendChild(ranking);
			}
			
			resultElem.appendChild(rankingsElem);
			
			eval.appendChild(resultElem);
			
			// save the XML document to the defined file
			try {
				Transformer transformer = TransformerFactory.newInstance().newTransformer();
				DOMSource source = new DOMSource(xml);
				FileOutputStream os = new FileOutputStream(file);
				StreamResult streamResult = new StreamResult(os);
				transformer.transform(source, streamResult);
			}
			catch(TransformerConfigurationException e) {
				throw new IOException("Unable to save results.", e);
			}
			catch(FileNotFoundException e) {
				throw new IOException("Unable to save results.", e);
			}
			catch(TransformerException e) {
				throw new IOException("Unable to save results.", e);
			}
		}
		catch(ParserConfigurationException e) {
			throw new IOException("Unable to save results.", e);
		}
	}
}
