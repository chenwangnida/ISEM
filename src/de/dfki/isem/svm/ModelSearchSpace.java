package de.dfki.isem.svm;

import java.util.Vector;

import org.apache.log4j.Logger;

/**
 * Search space for model selection. This defines the lower and upper bounds for each dimension of the search
 * space. For example, the RBF kernel in combination with SVM utilizing the an error term defines two
 * parameters C and gamma, which may be optimized using grid search for a given problem.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 23-06-2009
 */
public class ModelSearchSpace {
	
	protected Logger								logger = Logger.getLogger(this.getClass());

	/**
	 * Basic parameters, which are not touched by the model search
	 */
	protected SVMParameters					basicParameters;
	
	/**
	 * Model space dimensions including the current value for iteration
	 */
	protected Vector<AbstractModelSearchDimension>	dimensions = new Vector<AbstractModelSearchDimension>();
	
	/**
	 * Indicates the availability of a next model. Once all models are traversed, this variable remains <code>false</code>
	 */
	protected boolean								hasMoreModels = true;
	
	/**
	 * Constructor, which takes the basic (i.e. fixed) parameters of a SVM, which are not part of the model
	 * selection process. These settings are used when generating new models. If parameters are defined which
	 * are part of the model search space, they are overwritten when producing new models.
	 * 
	 * @param basicParameters
	 */
	public ModelSearchSpace(SVMParameters basicParameters) {
		this.basicParameters = basicParameters;
	}
	
	/**
	 * Add a new dimension to the model search space.
	 * 
	 * @param dimension New dimension in model search space.
	 */
	public void addDimension(AbstractModelSearchDimension dimension) {
		// TODO Possibly not a good idea to allow this during model iteration!
		dimensions.add(dimension);
	}
	
	/**
	 * Allows for iteration in the model space. Everytime, this method is called, it produces a new set
	 * of SVM parameters to perform some model checking.
	 * 
	 * @return Set of parameters for model checking or <code>null</code> if no more model exists.
	 */
	public SVMParameters getNextModel() {
		try {
			// create the current parameter settings from the original ones
			SVMParameters newParameters = basicParameters.getClass().newInstance();
			newParameters.putAll(basicParameters);
			// add specific parameters of the search space
			for(AbstractModelSearchDimension dimension : dimensions)
				newParameters.put(dimension.getVariable(), dimension.getCurrentValue());
			
			// traverse to next model
			int dim = 0;
			// if while loop ends without finding a new model, the flag is false
			hasMoreModels = false;
			while(dim < dimensions.size()) {
				AbstractModelSearchDimension currentDimension = dimensions.get(dim);
				currentDimension.increment();
				if(currentDimension.exceedsUpperBound()) {
					// reset and step into next dimension
					currentDimension.resetCurrentValue();
					dim++;
				}
				else {
					hasMoreModels = true;
					break;
				}
			}
			
			return newParameters;
		}
		catch(InstantiationException e) {
			logger.warn("Unable to get next model in search space.", e);
			return null;
		}
		catch(IllegalAccessException e) {
			logger.warn("Unable to get next model in search space.", e);
			return null;
		}
	}
	
	/**
	 * Checks, if more models exist to iterate over.
	 * 
	 * @return <code>true</code>, iff more models exists, i.e. iteration is not finished.
	 */
	public boolean hasMoreModels() {
		return hasMoreModels;
	}
}
