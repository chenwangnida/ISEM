package de.dfki.isem.svm;

/**
 * Exception related to SVM errors.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 22-06-2009
 */
public class SVMException extends Exception {

	protected static final long serialVersionUID = 1l;
	
	/**
	 * Default constructor.
	 */
	public SVMException() {
		super();
	}
	
	/**
	 * Constructor for creating a SVM-related exception containing a given message.
	 * 
	 * @param msg Message explaining the SVM problem.
	 */
	public SVMException(String msg) {
		super(msg);
	}
	
	/**
	 * Constructor for creating a SVM-related exception containing another <code>Throwable</code>.
	 * 
	 * @param t The <code>Throwable</code> causing the problem.
	 */
	public SVMException(Throwable t) {
		super(t);
	}
	
	/**
	 * Constructor for creating a SVM-related exception containing a given message and another
	 * <code>Throwable</code> causing the problem.
	 * 
	 * @param msg Message explaining the SVM problem.
	 * @param t The <code>Throwable</code> causing the problem.
	 */
	public SVMException(String msg, Throwable t) {
		super(msg, t);
	}
}
