package de.dfki.isem.svm;

/**
 * Implements exponential stepping in one model search dimension as proposed in "A Practical Guide to Support
 * Vector Classification" by Hsu et al. for libSVM. This variant could for example be used for the SVM parameter
 * C as well as RBF kernel gamma. It treats the <code>String</code> values of a parameter as <code>double</code>.
 * The stepsize may be adapted to perform hierarchical grid search. 
 * 
 * @author Patrick Kapahnke
 * @version 2.0 24-06-2009
 */
public class ExpIncreasingDimension extends AbstractModelSearchDimension {

	/**
	 * The step size of exponent incrementation.
	 */
	protected double	expStepSize;
	
	/**
	 * The current exponent leading to the current value.
	 */
	protected double	currentExp;
	
	/**
	 * Sets the variable type, lower and upper bound. The current value is automatically set to the lower
	 * bound.
	 * 
	 * @param variable Variable type. Use pre-defined constants provided in the implementations of <code>AbstractSVMParameters</code>.
	 * @param lowerBound Lower bound for this variable in the search space dimension.
	 * @param upperBound Upper bound for this variable in this search space dimension.
	 */
	public ExpIncreasingDimension(Integer variable, String lowerBound, String upperBound, double expStepSize)  {
		super(variable, lowerBound, upperBound);
		this.expStepSize = expStepSize;
		currentExp = Math.log(Double.parseDouble(lowerBound))/Math.log(2.0);
	}
	
	/**
	 * Tests, if the current value interpreted as <code>double</code> exceeds the upper bound.
	 * 
	 * @return <code>true</code>, iff the upper bound is reached.
	 */
	public boolean exceedsUpperBound() {
		return (Double.parseDouble(currentValue) > Double.parseDouble(upperBound));
	}

	/**
	 * Exponentially increments the current value in this dimension.
	 */
	public void increment() {
		currentExp += expStepSize;
		currentValue = Double.toString(Math.pow(2.0, currentExp));
	}
	
	/**
	 * Resets the current value to the lower bound. Also resets the exponent.
	 */
	public void resetCurrentValue() {
		currentValue = lowerBound;
		currentExp = Math.log(Double.parseDouble(lowerBound))/Math.log(2.0);
	}

}
