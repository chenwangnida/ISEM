/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.s2m2.filter.FilterPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.isem.s2m2.filter.learning.LearningFactory
 * @model kind="package"
 * @generated
 */
public interface LearningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "learning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/isem/2011/isem/learning";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "learning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LearningPackage eINSTANCE = de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner <em>Aggregation Learner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.learning.AggregationLearner
	 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getAggregationLearner()
	 * @generated
	 */
	int AGGREGATION_LEARNER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LEARNER__NAME = FilterPackage.EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LEARNER__ONLINE = FilterPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LEARNER__FEATURE_SPACE = FilterPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregation Learner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_LEARNER_FEATURE_COUNT = FilterPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl <em>Training Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl
	 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getTrainingSet()
	 * @generated
	 */
	int TRAINING_SET = 1;

	/**
	 * The feature id for the '<em><b>Num Of Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__NUM_OF_DIMENSIONS = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Sample</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__SAMPLE = 2;

	/**
	 * The number of structural features of the '<em>Training Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.learning.impl.SampleImpl
	 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__CANDIDATE = 1;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__RELEVANT = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Training Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingException
	 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getTrainingException()
	 * @generated
	 */
	int TRAINING_EXCEPTION = 3;


	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner <em>Aggregation Learner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Learner</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.AggregationLearner
	 * @generated
	 */
	EClass getAggregationLearner();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner#getOnline <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Online</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.AggregationLearner#getOnline()
	 * @see #getAggregationLearner()
	 * @generated
	 */
	EAttribute getAggregationLearner_Online();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner#getFeatureSpace <em>Feature Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Space</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.AggregationLearner#getFeatureSpace()
	 * @see #getAggregationLearner()
	 * @generated
	 */
	EReference getAggregationLearner_FeatureSpace();

	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.learning.TrainingSet <em>Training Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Set</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingSet
	 * @generated
	 */
	EClass getTrainingSet();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getNumOfDimensions <em>Num Of Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Dimensions</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingSet#getNumOfDimensions()
	 * @see #getTrainingSet()
	 * @generated
	 */
	EAttribute getTrainingSet_NumOfDimensions();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingSet#getSize()
	 * @see #getTrainingSet()
	 * @generated
	 */
	EAttribute getTrainingSet_Size();

	/**
	 * Returns the meta object for the reference list '{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getSample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sample</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingSet#getSample()
	 * @see #getTrainingSet()
	 * @generated
	 */
	EReference getTrainingSet_Sample();

	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.learning.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.Sample#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.Sample#getRequest()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Request();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.Sample#getCandidate <em>Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.Sample#getCandidate()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Candidate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.Sample#isRelevant <em>Relevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevant</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.Sample#isRelevant()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Relevant();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.isem.s2m2.filter.learning.Sample#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.Sample#getFeature()
	 * @see #getSample()
	 * @generated
	 */
	EAttribute getSample_Feature();

	/**
	 * Returns the meta object for data type '{@link de.dfki.isem.s2m2.filter.learning.TrainingException <em>Training Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Training Exception</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.TrainingException
	 * @model instanceClass="de.dfki.isem.s2m2.filter.learning.TrainingException"
	 * @generated
	 */
	EDataType getTrainingException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LearningFactory getLearningFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner <em>Aggregation Learner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.learning.AggregationLearner
		 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getAggregationLearner()
		 * @generated
		 */
		EClass AGGREGATION_LEARNER = eINSTANCE.getAggregationLearner();

		/**
		 * The meta object literal for the '<em><b>Online</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_LEARNER__ONLINE = eINSTANCE.getAggregationLearner_Online();

		/**
		 * The meta object literal for the '<em><b>Feature Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_LEARNER__FEATURE_SPACE = eINSTANCE.getAggregationLearner_FeatureSpace();

		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl <em>Training Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.learning.impl.TrainingSetImpl
		 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getTrainingSet()
		 * @generated
		 */
		EClass TRAINING_SET = eINSTANCE.getTrainingSet();

		/**
		 * The meta object literal for the '<em><b>Num Of Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_SET__NUM_OF_DIMENSIONS = eINSTANCE.getTrainingSet_NumOfDimensions();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_SET__SIZE = eINSTANCE.getTrainingSet_Size();

		/**
		 * The meta object literal for the '<em><b>Sample</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_SET__SAMPLE = eINSTANCE.getTrainingSet_Sample();

		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.learning.impl.SampleImpl
		 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getSample()
		 * @generated
		 */
		EClass SAMPLE = eINSTANCE.getSample();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__REQUEST = eINSTANCE.getSample_Request();

		/**
		 * The meta object literal for the '<em><b>Candidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__CANDIDATE = eINSTANCE.getSample_Candidate();

		/**
		 * The meta object literal for the '<em><b>Relevant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__RELEVANT = eINSTANCE.getSample_Relevant();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE__FEATURE = eINSTANCE.getSample_Feature();

		/**
		 * The meta object literal for the '<em>Training Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.learning.TrainingException
		 * @see de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl#getTrainingException()
		 * @generated
		 */
		EDataType TRAINING_EXCEPTION = eINSTANCE.getTrainingException();

	}

} //LearningPackage
