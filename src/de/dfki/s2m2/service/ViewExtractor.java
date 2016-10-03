package de.dfki.s2m2.service;

import java.net.URI;
import java.net.URL;


/**
 * Interface for all view extraction plug-ins. The specification is independent of a specific formalism at this point.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 09/30/09
 */
public interface ViewExtractor {

	/**
	 * Extracts the information for a specific service (specified by its URI) contained in a document.  
	 * 
	 * @param service Service URI.
	 * @param document Document URL.
	 * @return Specific view at the service given as parameter.
	 * @throws ViewGenerationException If an error occurred during view extraction.
	 */
	public ServiceView extract(URI service, URL document) throws ViewGenerationException;
}
