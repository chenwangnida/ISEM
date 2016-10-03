package de.dfki.isem.svm;

/**
 * Search space dimension for model selection. This defines the lower and upper bounds for one dimension of
 * a search space. The current value of the variable in this dimension is also managed.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 23-06-2009
 * @see AbstractModelSearchDimension
 */
public abstract class AbstractModelSearchDimension {

	/**
	 * Contains the variable type of this dimension. Use pre-defined constants provided in the implementations
	 * of <code>AbstractSVMParameters</code>.
	 */
	protected Integer		variable;
	
	protected String		lowerBound;
	
	protected String		upperBound;
	
	protected String		currentValue;
	
	/**
	 * Sets the variable type, lower and upper bound. The current value is automatically set to the lower
	 * bound.
	 * 
	 * @param variable Variable type. Use pre-defined constants provided in the implementations of <code>AbstractSVMParameters</code>.
	 * @param lowerBound Lower bound for this variable in the search space dimension.
	 * @param upperBound Upper bound for this variable in this search space dimension.
	 */
	public AbstractModelSearchDimension(Integer variable, String lowerBound, String upperBound) {
		this.variable = variable;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.currentValue = lowerBound;
	}
	
	/**
	 * Increments the current value in this dimension.
	 */
	public abstract void increment();
	
	/**
	 * Tests, if the current value exceeds the upper bound.
	 * 
	 * @return <code>true</code>, iff the upper bound is reached.
	 */
	public abstract boolean exceedsUpperBound();

	/**
	 * @return the currentValue
	 */
	public String getCurrentValue() {
		return currentValue;
	}

	/**
	 * @param currentValue the currentValue to set
	 */
	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}
	
	/**
	 * Resets the current value to the lower bound.
	 */
	public void resetCurrentValue() {
		currentValue = lowerBound;
	}

	/**
	 * @return the variable
	 */
	public Integer getVariable() {
		return variable;
	}
}
