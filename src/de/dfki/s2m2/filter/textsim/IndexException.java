package de.dfki.s2m2.filter.textsim;

/**
 * Exception related to term index errors.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 22-06-2009
 */
public class IndexException extends Exception {

	protected static final long serialVersionUID = 1l;
	
	/**
	 * Default constructor.
	 */
	public IndexException() {
		super();
	}
	
	/**
	 * Constructor for creating a term-index-related exception containing a given message.
	 * 
	 * @param msg Message explaining the SVM problem.
	 */
	public IndexException(String msg) {
		super(msg);
	}
	
	/**
	 * Constructor for creating a term-index-related exception containing another <code>Throwable</code>.
	 * 
	 * @param t The <code>Throwable</code> causing the problem.
	 */
	public IndexException(Throwable t) {
		super(t);
	}
	
	/**
	 * Constructor for creating a term-index-related exception containing a given message and another
	 * <code>Throwable</code> causing the problem.
	 * 
	 * @param msg Message explaining the SVM problem.
	 * @param t The <code>Throwable</code> causing the problem.
	 */
	public IndexException(String msg, Throwable t) {
		super(msg, t);
	}
}
