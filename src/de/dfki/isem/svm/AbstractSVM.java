package de.dfki.isem.svm;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;
import de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl;

/**
 * Abstract class for Support Vector Machines. It implements the <code>ISVM</code> interface and also
 * provides a generic method to perform n-fold cross validation. To allow this using Java reflection API,
 * a default constructor is enforced for implementations of this.
 * 
 * @author Patrick Kapahnke
 * @version 2.0 05-08-2009
 */
public abstract class AbstractSVM<Domain> implements SVM<Domain> {
	
	/**
	 * Enforces the presence of a default constructor for every SVM building on this abstract class.
	 */
	public AbstractSVM() {		
	}

	abstract public boolean predict(Sample<Domain> sample) throws SVMException;

	abstract public void train(TrainingSet<Domain> trainingSet, SVMParameters parameters) throws SVMException;
	
	/**
	 * Performs n-fold cross validation on the given training set and using the provided parameters. The result
	 * is the average accuracy in percent indicating the quality of the parameter setting for the given problem.
	 * 
	 * @param trainingSet Training set.
	 * @param parameters Parameter setting.
	 * @param n Number of folds for evaluation.
	 * @param seed Random seed. Can be used to resemble a certain experiment using the same row of random numbers.
	 * @return Average accuracy indicating the quality of parameters for the given problem. 
	 * @throws SVMException Thrown, if an error occurs.
	 */
	@SuppressWarnings("unchecked")
	public double nFoldCrossValidation(TrainingSet<Domain> trainingSet, SVMParameters parameters, int n, long seed) throws SVMException {
		// temporary create a logger
		Logger logger = Logger.getLogger(this.getClass());
		
		try {
			// create n folds
			EList<TrainingSet<Domain>> folds = trainingSet.fold(n, seed);
			
			// loop through all folds to perform cross validation
			int count = 0;
			int correct = 0;
			for(int i = 0; i < n; i++) {
				TrainingSet<Domain> testFold = folds.remove(0);
				TrainingSet<Domain> trainFolds = TrainingSetImpl.merge(folds);
				
				try {
					// train the SVM for the n-1 folds
					SVM<Domain> svm = this.getClass().newInstance();
					svm.train(trainFolds, parameters);
				
					// perform the actual test for the current fold
					for(Sample<Domain> sample : testFold.getSample()) {
						count++;
						if(svm.predict(sample) == sample.isRelevant())
							correct++;
					}
				}
				catch(SVMException e) {
					logger.warn("Problem during cross validation test.", e);
				}
							
				// re-insert the test fold
				folds.add(testFold);
			}
			
			// return the accuracy in percent
			return ((double) correct/(double) count)*100.0;
		}
		catch(IllegalAccessException e) {
			logger.warn("Unable to perform n-fold cross validation.", e);
			throw new SVMException("Unable to perform n-fold cross validation.", e);
		}
		catch(InstantiationException e) {
			logger.warn("Unable to perform n-fold cross validation.", e);
			throw new SVMException("Unable to perform n-fold cross validation.", e);
		}
	}
	
	/**
	 * Searches for the best model (parameter setting for the SVM) given a problem (training set) and the model
	 * search space. A grid search approach is used.
	 * 
	 * @param trainingSet Training set.
	 * @param modelSearchSpace Search space for the model.
	 * @param n Number of folds for cross evaluation.
	 * @param seed Random seed. Can be used to resemble a certain experiment using the same row of random numbers.
	 * @return Parameter setting of the found best model.
	 * @throws SVMException Thrown, if an error occurs.
	 * @see AbstractSVM
	 */
	public SVMParameters searchModel(TrainingSet<Domain> trainingSet, ModelSearchSpace modelSearchSpace, int n, long seed) throws SVMException {
		// temporary create a logger
		Logger logger = Logger.getLogger(this.getClass());
		
		SVMParameters bestParameters = null;
		double bestAccuracy = Double.MIN_VALUE;
		
		while(modelSearchSpace.hasMoreModels) {
			try {
				SVMParameters tempParameters = modelSearchSpace.getNextModel();
				double accuracy = nFoldCrossValidation(trainingSet, tempParameters, n, seed);
				// remember best values
				if(accuracy > bestAccuracy) {
					bestAccuracy = accuracy;
					bestParameters = tempParameters;
				}
			}
			catch(SVMException e) {
				logger.warn("Problem with model search.", e);
			}
		}
		
		logger.info("Cross validation accuracy of found model: " + bestAccuracy);
		// also store the cross validation accuracy for the parameter setting
		bestParameters.setAccuracy(new Double(bestAccuracy));
		
		return bestParameters;
	}
}
