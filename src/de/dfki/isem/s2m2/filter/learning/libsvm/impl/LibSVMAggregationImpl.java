/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm.impl;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.isem.s2m2.filter.learning.LearningFactory;
import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingException;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage;
import de.dfki.isem.svm.ExpIncreasingDimension;
import de.dfki.isem.svm.LibSVM;
import de.dfki.isem.svm.LibSVMParameters;
import de.dfki.isem.svm.ModelSearchSpace;
import de.dfki.isem.svm.SVM;
import de.dfki.isem.svm.SVMException;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lib SVM Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getOnline <em>Online</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getFeatureSpace <em>Feature Space</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getCoarseGridStepSize <em>Coarse Grid Step Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getFineGridStepSize <em>Fine Grid Step Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getFolds <em>Folds</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#getSvm <em>Svm</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl#isTrained <em>Trained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibSVMAggregationImpl extends EObjectImpl implements LibSVMAggregation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnline() <em>Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnline()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLINE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOnline() <em>Online</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnline()
	 * @generated
	 * @ordered
	 */
	protected Boolean online = ONLINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureSpace() <em>Feature Space</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression<ServiceView, Double>> featureSpace;

	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoarseGridStepSize() <em>Coarse Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoarseGridStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final double COARSE_GRID_STEP_SIZE_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getCoarseGridStepSize() <em>Coarse Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoarseGridStepSize()
	 * @generated
	 * @ordered
	 */
	protected double coarseGridStepSize = COARSE_GRID_STEP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFineGridStepSize() <em>Fine Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineGridStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final double FINE_GRID_STEP_SIZE_EDEFAULT = 0.25;

	/**
	 * The cached value of the '{@link #getFineGridStepSize() <em>Fine Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFineGridStepSize()
	 * @generated
	 * @ordered
	 */
	protected double fineGridStepSize = FINE_GRID_STEP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFolds() <em>Folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolds()
	 * @generated
	 * @ordered
	 */
	protected static final int FOLDS_EDEFAULT = 6;

	/**
	 * The cached value of the '{@link #getFolds() <em>Folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolds()
	 * @generated
	 * @ordered
	 */
	protected int folds = FOLDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final long SEED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected long seed = SEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSvm() <em>Svm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvm()
	 * @generated
	 * @ordered
	 */
	protected SVM<ServiceView> svm;

	/**
	 * The default value of the '{@link #isTrained() <em>Trained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrained() <em>Trained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrained()
	 * @generated
	 * @ordered
	 */
	protected boolean trained = TRAINED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LibSVMAggregationImpl() {
		super();
		
		logger = Logger.getLogger(this.getClass());
		svm = new LibSVM<ServiceView>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibsvmPackage.Literals.LIB_SVM_AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibsvmPackage.LIB_SVM_AGGREGATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOnline() {
		return online;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression<ServiceView, Double>> getFeatureSpace() {
		if (featureSpace == null) {
			featureSpace = new EObjectContainmentEList<Expression<ServiceView, Double>>(Expression.class, this, LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE);
		}
		return featureSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoarseGridStepSize() {
		return coarseGridStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoarseGridStepSize(double newCoarseGridStepSize) {
		double oldCoarseGridStepSize = coarseGridStepSize;
		coarseGridStepSize = newCoarseGridStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE, oldCoarseGridStepSize, coarseGridStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFineGridStepSize() {
		return fineGridStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFineGridStepSize(double newFineGridStepSize) {
		double oldFineGridStepSize = fineGridStepSize;
		fineGridStepSize = newFineGridStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE, oldFineGridStepSize, fineGridStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFolds() {
		return folds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolds(int newFolds) {
		int oldFolds = folds;
		folds = newFolds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS, oldFolds, folds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(long newSeed) {
		long oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibsvmPackage.LIB_SVM_AGGREGATION__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVM<ServiceView> getSvm() {
		return svm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrained() {
		return trained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void saveModel(String fileName) throws IOException {
		File modelFile = new File(fileName);
		svm.saveTrainedModel(modelFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void loadModel(String fileName) throws IOException {
		File modelFile = new File(fileName);
		svm.loadTrainedModel(modelFile);
		trained = true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void train(TrainingSet<ServiceView> trainingSet) throws TrainingException {
		// compute feature vector for each sample
		Set<Sample<ServiceView>> toRemove = new HashSet<Sample<ServiceView>>();
		for(Sample<ServiceView> sample : trainingSet.getSample()) {
			sample.getFeature().clear();
			try {
				for(Expression<ServiceView, Double> featureDim : featureSpace) {
					Double feature = featureDim.evaluate(sample.getRequest(), sample.getCandidate());
					sample.getFeature().add(feature);
				}
			}
			catch(ExpressionEvaluationException e) {
				// ignore entry because of filter evaluation error
				logger.warn("Evaluation error. Ignored sample during training: " + sample.getRequest().toString() + ", " + sample.getCandidate().toString() + ", " + sample.isRelevant());
				toRemove.add(sample);
			}
		}
		// remove samples that should be ignored
		trainingSet.getSample().removeAll(toRemove);
			
		// model selection
		try {
			// coarse grid
			ModelSearchSpace searchSpace = new ModelSearchSpace(LibSVMParameters.createDefault());
			double cLowerBound = Math.pow(2.0,-5.0);
			double cUpperBound = Math.pow(2.0, 15.0);
			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.C, Double.toString(cLowerBound), Double.toString(cUpperBound), coarseGridStepSize));
			double gammaLowerBound = Math.pow(2.0, -15.0);
			double gammaUpperBound = Math.pow(2.0, 3.0);
			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.GAMMA, Double.toString(gammaLowerBound), Double.toString(gammaUpperBound), coarseGridStepSize));
			LibSVMParameters svmParameters = (LibSVMParameters) svm.searchModel(trainingSet, searchSpace, folds, seed);
			
			// fine grid
			searchSpace = new ModelSearchSpace(svmParameters);
			// for lower: find exponent, step back one coarse set and increase to the first fine step...
			cLowerBound = Math.pow(2.0,Math.log(Double.parseDouble(svmParameters.get(LibSVMParameters.C)))/Math.log(2.0) - coarseGridStepSize + fineGridStepSize);
			cUpperBound = Math.pow(2.0,Math.log(Double.parseDouble(svmParameters.get(LibSVMParameters.C)))/Math.log(2.0) + coarseGridStepSize - fineGridStepSize);
			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.C, Double.toString(cLowerBound), Double.toString(cUpperBound), fineGridStepSize));
			gammaLowerBound = Math.pow(2.0,Math.log(Double.parseDouble(svmParameters.get(LibSVMParameters.GAMMA)))/Math.log(2.0) - coarseGridStepSize + fineGridStepSize);
			gammaUpperBound = Math.pow(2.0,Math.log(Double.parseDouble(svmParameters.get(LibSVMParameters.GAMMA)))/Math.log(2.0) + coarseGridStepSize - fineGridStepSize);
			searchSpace.addDimension(new ExpIncreasingDimension(LibSVMParameters.GAMMA, Double.toString(gammaLowerBound), Double.toString(gammaUpperBound), fineGridStepSize));
			// store the final parameter setting after model selection
			svmParameters = (LibSVMParameters) svm.searchModel(trainingSet, searchSpace, folds, seed);
			
			// train the svm
			svm.train(trainingSet, svmParameters);
			trained = true;
		}
		catch(SVMException e) {
			throw new TrainingException("Error while training SVM.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double evaluate(ServiceView param1, ServiceView param2) throws ExpressionEvaluationException {
		if(!trained) {
			throw new ExpressionEvaluationException("SVM is not trained yet.");
		}
		Vector<Double> featureVec = new Vector<Double>();
		for(Expression<ServiceView, Double> featureDim : featureSpace) {
			featureVec.add(featureDim.evaluate(param1, param2));
		}
		
		try {
			Sample<ServiceView> sample = LearningFactory.eINSTANCE.createSample();
			sample.setRequest(param1);
			sample.setCandidate(param2);
			sample.getFeature().addAll(featureVec);
			return svm.getDistance(sample);
		}
		catch(SVMException e) {
			// TODO Error handling
			throw new ExpressionEvaluationException("Unable to aggregate features using SVM.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
				return ((InternalEList<?>)getFeatureSpace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__NAME:
				return getName();
			case LibsvmPackage.LIB_SVM_AGGREGATION__ONLINE:
				return getOnline();
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
				return getFeatureSpace();
			case LibsvmPackage.LIB_SVM_AGGREGATION__LOGGER:
				return getLogger();
			case LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE:
				return getCoarseGridStepSize();
			case LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE:
				return getFineGridStepSize();
			case LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS:
				return getFolds();
			case LibsvmPackage.LIB_SVM_AGGREGATION__SEED:
				return getSeed();
			case LibsvmPackage.LIB_SVM_AGGREGATION__SVM:
				return getSvm();
			case LibsvmPackage.LIB_SVM_AGGREGATION__TRAINED:
				return isTrained();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__NAME:
				setName((String)newValue);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
				getFeatureSpace().clear();
				getFeatureSpace().addAll((Collection<? extends Expression<ServiceView, Double>>)newValue);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE:
				setCoarseGridStepSize((Double)newValue);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE:
				setFineGridStepSize((Double)newValue);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS:
				setFolds((Integer)newValue);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__SEED:
				setSeed((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
				getFeatureSpace().clear();
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE:
				setCoarseGridStepSize(COARSE_GRID_STEP_SIZE_EDEFAULT);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE:
				setFineGridStepSize(FINE_GRID_STEP_SIZE_EDEFAULT);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS:
				setFolds(FOLDS_EDEFAULT);
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__SEED:
				setSeed(SEED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibsvmPackage.LIB_SVM_AGGREGATION__ONLINE:
				return ONLINE_EDEFAULT == null ? online != null : !ONLINE_EDEFAULT.equals(online);
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
				return featureSpace != null && !featureSpace.isEmpty();
			case LibsvmPackage.LIB_SVM_AGGREGATION__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE:
				return coarseGridStepSize != COARSE_GRID_STEP_SIZE_EDEFAULT;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE:
				return fineGridStepSize != FINE_GRID_STEP_SIZE_EDEFAULT;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS:
				return folds != FOLDS_EDEFAULT;
			case LibsvmPackage.LIB_SVM_AGGREGATION__SEED:
				return seed != SEED_EDEFAULT;
			case LibsvmPackage.LIB_SVM_AGGREGATION__SVM:
				return svm != null;
			case LibsvmPackage.LIB_SVM_AGGREGATION__TRAINED:
				return trained != TRAINED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", online: ");
		result.append(online);
		result.append(", logger: ");
		result.append(logger);
		result.append(", coarseGridStepSize: ");
		result.append(coarseGridStepSize);
		result.append(", fineGridStepSize: ");
		result.append(fineGridStepSize);
		result.append(", folds: ");
		result.append(folds);
		result.append(", seed: ");
		result.append(seed);
		result.append(", svm: ");
		result.append(svm);
		result.append(", trained: ");
		result.append(trained);
		result.append(')');
		return result.toString();
	}

} //LibSVMAggregationImpl
