package de.dfki.isem.svm;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Abstract class for Support Vector Machine parameters. Since different implementations may use a different
 * set of parameters, the concrete parameters have to be implemented too. Each parameter type should be
 * encoded as <code>Integer</code> and each parameter value has to be a <code>String</code>.
 * 
 * This class is just to enforce the use of specific parameter implementations related to a SVM.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 05-08-2009
 */
public abstract class SVMParameters extends HashMap<Integer, String> {
	
	protected static final long		serialVersionUID = 1l;
	
	protected Double				accuracy = null;
	
	/**
	 * Returns the accuracy of this setting. The accuracy indicates the quality of a parameter search after model selection.
	 * If the parameters were not determined using the model selection capability of SVM implementations, this method should
	 * return <code>null</code>.
	 * 
	 * @return Accuracy of this parameter setting.
	 */
	public Double getAccuracy() {
		return accuracy;
	}

	/**
	 * Sets the accuracy of this setting. This method should be used in model selection to remember the cross validation accurcay
	 * (for e.g. displaying it in a GUI).
	 * 
	 * @param accuracy Accuracy of this parameter setting.
	 */
	protected void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * Checks, if the parameter setting is valid. Override this to implement meaningful rules related to
	 * a specific SVM implementation.
	 * 
	 * @return <code>true</code>, iff the parameter setting is valid.
	 */
	public boolean areValid() {
		return false;
	}
	
	/**
	 * Adds the parameter settings as child node of the document element of the given XML document. 
	 * 
	 * @param document XML document to append child node containing parameters.
	 */
	public void addToXMLDocument(Document document) {
		// create element and store parameter setting type
		Element paramsElem = document.createElement("parameters");
		paramsElem.setAttribute("class", getClass().getName());
		// also add the accuracy of parameter setting determined by model selection, if available
		if(accuracy != null) {
			paramsElem.setAttribute("accuracy", accuracy.toString());
		}
		
		// append all parameters as child nodes
		for(Entry<Integer,String> entry : entrySet()) {
			Element paramElem = document.createElement("parameter");
			paramElem.setAttribute("id", entry.getKey().toString());
			paramElem.appendChild(document.createTextNode(entry.getValue()));
			paramsElem.appendChild(paramElem);
		}
		
		document.getDocumentElement().appendChild(paramsElem);
	}
	
	/**
	 * Loads a parameter setting from XML (given the "parameters" element) and creates a new set up instance
	 * for it.
	 * 
	 * @param element XM element to parse from.
	 * @return New parameters settings.
	 */
	public static SVMParameters parse(Element element) {
		Logger logger = Logger.getLogger(SVMParameters.class);
		
		try {
			logger.info("Parsing parameters of type " + element.getAttribute("class") + ".");
			SVMParameters parameters = (SVMParameters) Class.forName(element.getAttribute("class")).newInstance();
			// parse accuracy if available
			if(element.hasAttribute("accuracy")) {
				parameters.setAccuracy(Double.parseDouble(element.getAttribute("accuracy")));
			}
			
			// parse all parameter sub-nodes
			for(int i = 0; i < element.getChildNodes().getLength(); i++) {
				Element subNode = (Element) element.getChildNodes().item(i);
				parameters.put(Integer.parseInt(subNode.getAttribute("id")), subNode.getTextContent());
			}
			
			return parameters;
		}
		catch(Exception e) {
			logger.error("Unable to parse parameters.", e);
			return null;
		}
	}
}
