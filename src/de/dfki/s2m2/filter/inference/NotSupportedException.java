package de.dfki.s2m2.filter.inference;

/**
 * Exceptions related to the ISeM matching process.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 10/01/09
 */
public class NotSupportedException extends Exception {
	
	private static final long		serialVersionUID = 1l;

	/**
	 * Creates a default view generation exception without additional message or nested <code>Throwable</code>.
	 */
	public NotSupportedException() {
		super();
	}

	/**
	 * Creates a view generation exception with a specific error message.
	 * 
	 * @param message Error message.
	 */
	public NotSupportedException(String message) {
		super(message);
	}

	/**
	 * Creates a view generation exception with a nested <code>Throwable</code>.
	 * 
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public NotSupportedException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Creates a view generation exception with a specific error message nested <code>Throwable</code>..
	 * 
	 * @param message Error message.
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public NotSupportedException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
