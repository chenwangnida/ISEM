package de.dfki.s2m2.filter;

/**
 * Exceptions related to expression evaluation.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 10/22/09
 */
public class ExpressionEvaluationException extends Exception {
	
	private static final long		serialVersionUID = 1l;

	/**
	 * Creates a default evaluation exception without additional message or nested <code>Throwable</code>.
	 */
	public ExpressionEvaluationException() {
		super();
	}

	/**
	 * Creates a evaluation exception with a specific error message.
	 * 
	 * @param message Error message.
	 */
	public ExpressionEvaluationException(String message) {
		super(message);
	}

	/**
	 * Creates a evaluation exception with a nested <code>Throwable</code>.
	 * 
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public ExpressionEvaluationException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Creates a evaluation exception with a specific error message nested <code>Throwable</code>..
	 * 
	 * @param message Error message.
	 * @param throwable <code>Throwable</code> causing the problem.
	 */
	public ExpressionEvaluationException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
