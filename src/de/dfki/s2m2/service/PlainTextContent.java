package de.dfki.s2m2.service;

/**
 * Represents a textual service component (for example an informal service annotation element).
 * 
 * @author Patrick Kapahnke
 * @version 1.0 09/30/09
 */
public class PlainTextContent extends ServiceComponent {
	
	/**
	 * The actual text content.
	 */
	protected String	text;
	
	/**
	 * Constructor that initializes this text component with a given type (a string as for example defined in
	 * <code>ServiceComponent</code>) and the actual text content.
	 * 
	 * @param componentType String representation of the text type.
	 * @param text Text content.
	 */
	public PlainTextContent(String componentType, String text) {
		super(componentType);
		this.text = text;
	}
		
	/**
	 * Returns the text content as <code>String</code>.
	 * 
	 * @return Text content.
	 */
	@Override
	public String toString() {
		return text;
	}
}
