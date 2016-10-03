package de.dfki.s2m2;

/**
 * Exceptions related to the ISeM matching process.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 10/01/09
 */
public class MatchingException extends Exception {
	
	private static final long		serialVersionUID = 1l;

	/**
	 * Creates a default view generation exception without additional message or nested <code>Throwable</code>.
	 */
	public MatchingException() {
		super();
	}

	/**
	 * Creates a view generation exception with a specific error message.
	 * 
	 * @param message Error message.
	 */
	public MatchingException(String message) {
		super(message);
	}

	/**
	 * Creates a view generation exception with a nested <code>Throwable</code>.
	 * 
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public MatchingException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Creates a view generation exception with a specific error message nested <code>Throwable</code>..
	 * 
	 * @param message Error message.
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public MatchingException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
