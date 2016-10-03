package de.dfki.s2m2.filter.inference;

/**
 * Exceptions related to inference mechanisms.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 09/23/09
 */
public class InferenceException extends Exception {
	
	private static final long		serialVersionUID = 1l;

	/**
	 * Creates a default reasoning exception without additional message or nested <code>Throwable</code>.
	 */
	public InferenceException() {
		super();
	}

	/**
	 * Creates a reasoning exception with a specific error message.
	 * 
	 * @param message Error message.
	 */
	public InferenceException(String message) {
		super(message);
	}

	/**
	 * Creates a reasoning exception with a nested <code>Throwable</code>.
	 * 
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public InferenceException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Creates a reasoning exception with a specific error message nested <code>Throwable</code>..
	 * 
	 * @param message Error message.
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public InferenceException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
