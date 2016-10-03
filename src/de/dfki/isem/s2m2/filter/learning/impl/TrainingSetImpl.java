/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl#getNumOfDimensions <em>Num Of Dimensions</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl#getSample <em>Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainingSetImpl<Domain> extends EObjectImpl implements TrainingSet<Domain> {
	/**
	 * The default value of the '{@link #getNumOfDimensions() <em>Num Of Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_OF_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSample() <em>Sample</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSample()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample<Domain>> sample;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LearningPackage.Literals.TRAINING_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample<Domain>> getSample() {
		if (sample == null) {
			sample = new EObjectResolvingEList<Sample<Domain>>(Sample.class, this, LearningPackage.TRAINING_SET__SAMPLE);
		}
		return sample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getNumOfDimensions() {
		if(getSample().isEmpty())
			return 0;
		
		return getSample().get(0).getFeature().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getSize() {
		return sample.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TrainingSet<Domain>> fold(int n, long seed) {
		// create now random number generator
		Random rnd = new Random(seed);
		
		// create n empty (sub) training sets
		EList<TrainingSet<Domain>> folds = new BasicEList<TrainingSet<Domain>>();
		for(int i = 0; i < n; i++)
			folds.add(new TrainingSetImpl<Domain>());
		
		// this set is used to draw elements at random
		Vector<Sample<Domain>> samples = new Vector<Sample<Domain>>(getSample());
		Iterator<TrainingSet<Domain>> iter = folds.iterator();
		while(!samples.isEmpty()) {
			// draw random element and put into the next subset
			Sample<Domain> sample = samples.remove(rnd.nextInt(samples.size()));
			iter.next().getSample().add(sample);
			// reset iterator to the first element
			if(!iter.hasNext())
				iter = folds.iterator();
		}
		
		return folds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LearningPackage.TRAINING_SET__NUM_OF_DIMENSIONS:
				return getNumOfDimensions();
			case LearningPackage.TRAINING_SET__SIZE:
				return getSize();
			case LearningPackage.TRAINING_SET__SAMPLE:
				return getSample();
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
			case LearningPackage.TRAINING_SET__SAMPLE:
				getSample().clear();
				getSample().addAll((Collection<? extends Sample<Domain>>)newValue);
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
			case LearningPackage.TRAINING_SET__SAMPLE:
				getSample().clear();
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
			case LearningPackage.TRAINING_SET__NUM_OF_DIMENSIONS:
				return NUM_OF_DIMENSIONS_EDEFAULT == null ? getNumOfDimensions() != null : !NUM_OF_DIMENSIONS_EDEFAULT.equals(getNumOfDimensions());
			case LearningPackage.TRAINING_SET__SIZE:
				return SIZE_EDEFAULT == null ? getSize() != null : !SIZE_EDEFAULT.equals(getSize());
			case LearningPackage.TRAINING_SET__SAMPLE:
				return sample != null && !sample.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Merges a <code>Collection</code> of training sets. This is for example used in n-fold cross validation.
	 * 
	 * @return Merged training set.
	 */
	public static <Domain> TrainingSet<Domain> merge(EList<TrainingSet<Domain>> items) {
		TrainingSet<Domain> merged = new TrainingSetImpl<Domain>();
		for(TrainingSet<Domain> item : items) {
			merged.getSample().addAll(item.getSample());
		}
		return merged;
		
	}

} //TrainingSetImpl
