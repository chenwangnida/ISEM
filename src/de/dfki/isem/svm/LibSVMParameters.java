package de.dfki.isem.svm;

/**
 * Parameter map for libSVM implementation of <code>ISVM</code>. All variants interesting in context of
 * SAWSDL-MX2 have constants defined to simplify map manipulations.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 22-06-2009
 */
public class LibSVMParameters extends SVMParameters {

	public static final long	serialVersionUID = 1l;
	
	// constants related to the SVC type
	public static final Integer TYPE = 1;
	public static final String	C_SVC = "0";
	public static final String	NU_SVC = "1";
	
	// constants related to kernel selection
	public static final Integer	KERNEL = 2;
	public static final String	LINEAR = "0";
	public static final String	POLYNOMIAL = "1";
	public static final String	RBF = "2";
	public static final String	SIGMOID = "3";
	
	// parameters related to a specific SVC type
	public static final Integer	C = 3;
	public static final Integer NU = 4;
	
	// parameters related to a specific kernel
	public static final Integer	GAMMA = 5;	
	public static final Integer	COEF0 = 6;
	public static final Integer	DEGREE = 7;
	
	// termination criterion parameter
	public static final Integer	EPSILON = 8;
	
	// cache size
	public static final Integer	CACHESIZE = 9;
	
	// shrinking
	public static final Integer	SHRINKING = 10;
	public static final String	SHRINKING_ENABLED = "true";
	public static final String	SHRINKING_DISABLED = "true";
	
	/**
	 * Checks, if the parameter setting is valid for libSVM. For example, when using the nu-SVC, the parameter
	 * nu should be set.
	 * 
	 * @return <code>true</code>, iff the parameter setting is valid.
	 */
	public boolean areValid() {
		// check for missing entries
		if(!containsKey(TYPE) || !containsKey(KERNEL) || !containsKey(EPSILON) || !containsKey(CACHESIZE)
			|| !containsKey(SHRINKING))
			return false;
		
		// check for required parameters for different types of SVM/kernels
		if(get(TYPE).equals(C_SVC) && !containsKey(C))
			return false;
		if(get(TYPE).equals(NU_SVC) && !containsKey(NU))
			return false;
		
		if(get(KERNEL).equals(POLYNOMIAL) 
			&& (!containsKey(GAMMA) || !containsKey(DEGREE) || !containsKey(COEF0)))
			return false;
		if(get(KERNEL).equals(RBF) && !containsKey(GAMMA))
			return false;
		if(get(KERNEL).equals(SIGMOID)&& (!containsKey(GAMMA) || !containsKey(COEF0)))
			return false;
		
		// No configuration problem detected.
		return true;
	}
	
	public static LibSVMParameters createDefault() {
		LibSVMParameters svmParameters = new LibSVMParameters();
		svmParameters.put(LibSVMParameters.TYPE, LibSVMParameters.C_SVC);
		svmParameters.put(LibSVMParameters.KERNEL, LibSVMParameters.RBF);
		svmParameters.put(LibSVMParameters.CACHESIZE, Double.toString(1000));
		svmParameters.put(LibSVMParameters.EPSILON, Double.toString(0.01));
		svmParameters.put(LibSVMParameters.SHRINKING, LibSVMParameters.SHRINKING_ENABLED);
		
		return svmParameters;
	}
	
	public static LibSVMParameters createDefault(double C, double gamma) {
		LibSVMParameters svmParameters = new LibSVMParameters();
		svmParameters.put(LibSVMParameters.TYPE, LibSVMParameters.C_SVC);
		svmParameters.put(LibSVMParameters.KERNEL, LibSVMParameters.RBF);
		svmParameters.put(LibSVMParameters.CACHESIZE, Double.toString(1000));
		svmParameters.put(LibSVMParameters.EPSILON, Double.toString(0.01));
		svmParameters.put(LibSVMParameters.SHRINKING, LibSVMParameters.SHRINKING_ENABLED);
		svmParameters.put(LibSVMParameters.GAMMA, Double.toString(gamma));
		svmParameters.put(LibSVMParameters.C, Double.toString(C));
		
		return svmParameters;
	}
}
