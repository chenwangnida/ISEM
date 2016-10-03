package de.dfki.s2m2.service;

/**
 * Exceptions related to extraction of relevant service information.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 09/22/09
 */
public class ViewGenerationException extends Exception {
	
	private static final long		serialVersionUID = 1l;

	/**
	 * Creates a default view generation exception without additional message or nested <code>Throwable</code>.
	 */
	public ViewGenerationException() {
		super();
	}

	/**
	 * Creates a view generation exception with a specific error message.
	 * 
	 * @param message Error message.
	 */
	public ViewGenerationException(String message) {
		super(message);
	}

	/**
	 * Creates a view generation exception with a nested <code>Throwable</code>.
	 * 
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public ViewGenerationException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Creates a view generation exception with a specific error message nested <code>Throwable</code>..
	 * 
	 * @param message Error message.
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public ViewGenerationException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
