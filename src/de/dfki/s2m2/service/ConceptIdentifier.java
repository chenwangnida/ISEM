package de.dfki.s2m2.service;

import java.net.URI;

/**
 * Represents a specific service component, namely a concept identifier (for example used to semantically describe inputs or outputs
 * of a service description).
 * 
 * @author Patrick Kapahnke
 * @version 1.0 09/30/09
 */
public class ConceptIdentifier extends ServiceComponent {
	
	/**
	 * The actual URI identifying the concept.
	 */
	protected URI		conceptUri;
	
	/**
	 * Constructor that initializes this concept identifier with a given type (a string as for example defined in
	 * <code>ServiceComponent</code>) and the actual URI representing the concept. A component type may be for example a service input
	 * or output.
	 * 
	 * @param componentType String representation of the concept type.
	 * @param conceptUri URI identifying the concept.
	 */
	public ConceptIdentifier(String componentType, URI conceptUri) {
		super(componentType);
		this.conceptUri = conceptUri;
	}
		
	/**
	 * Returns the URI of the concept.
	 * 
	 * @return URI of the concept.
	 */
	public URI toURI() {
		return conceptUri;
	}
	
	@Override
	public String toString() {
		return conceptUri.toString();
	}
}
