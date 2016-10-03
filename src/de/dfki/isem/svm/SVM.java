package de.dfki.isem.svm;

import java.io.File;
import java.io.IOException;

import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;

/**
 * Interface for different Support Vector Machine implementations.
 * 
 * @author Patrick Kapahnke
 */
public interface SVM<Domain> {

	/**
	 * Trains the Support Vector Machine using the provided training set and the specified parameters.
	 * All training samples of the set must have a filled feature vector of dimension greater than 0.
	 * 
	 * @param trainingSet Training set.
	 * @param parameters Parameter setting.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public void train(TrainingSet<Domain> trainingSet, SVMParameters parameters) throws SVMException;
	
	/**
	 * Returns the paramter setting, which was used for training the SVM. Returns <code>null</code>, if it has not
	 * been trained yet.
	 * 
	 * @return Parameter setting used for training.
	 */
	public SVMParameters getTrainingParameters();
	
	/**
	 * Predicts the relevance of a service offer to a request represented as <code>Sample</code>. Features
	 * have to be set in the provided sample. This method represents the binary classification capability
	 * of a SVM.
	 * 
	 * @param sample Sample to test for relevance.
	 * @return <code>true</code>, iff the offer is predicted to be relevant to the request according to features.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public boolean predict(Sample<Domain> sample) throws SVMException;
	
	/**
	 * Computes the distance of the sample (represented as feature vector) from the seperating hyperplane.
	 * By looking at the sign of the resulting distance, the binary classification capability of a SVM can
	 * be resembled.
	 * 
	 * @param sample Sample, whose distance from the seperating hyperplane will be computed.
	 * @return Distance from the seperating hyperplane.
	 * @throws SVMException Thrown, if an error occurs.
	 */
	public double getDistance(Sample<Domain> sample) throws SVMException;
	
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
	public double nFoldCrossValidation(TrainingSet<Domain> trainingSet, SVMParameters parameters, int n, long seed) throws SVMException;
	
	/**
	 * Searches for the best model (parameter setting for the SVM) given a problem (training set) and the model
	 * search space. Grid search is one possible approach to this. Parameters not affected by the model search
	 * must be given as part of the model search object.
	 * 
	 * @param trainingSet Training set.
	 * @param modelSearchSpace Search space for the model.
	 * @param n Number of folds for cross evaluation.
	 * @param seed Random seed. Can be used to resemble a certain experiment using the same row of random numbers.
	 * @return Parameter setting of the found best model.
	 * @throws SVMException Thrown, if an error occurs.
	 * @see AbstractSVM
	 */
	public SVMParameters searchModel(TrainingSet<Domain> trainingSet, ModelSearchSpace modelSearchSpace, int n, long seed) throws SVMException;
	
	/**
	 * Saves all relevant information to restate the SVM without the need for a new training phase.
	 * 
	 * @param file Location to save information to.
	 * @throws IOException Thrown, if the information could not be saved for some reason.
	 */
	public void saveTrainedModel(File file) throws IOException;
	
	/**
	 * Loads all relevant information to restate the SVM without the need for a new training phase.
	 * 
	 * @param file Location to load information from.
	 * @throws IOException Thrown, if the information could not be loaded for some reason.
	 */
	public void loadTrainedModel(File file) throws IOException;
}
