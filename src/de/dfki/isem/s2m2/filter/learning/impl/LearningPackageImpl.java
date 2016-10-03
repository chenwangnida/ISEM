/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.impl.FilterPackageImpl;
import de.dfki.isem.s2m2.filter.learning.AggregationLearner;
import de.dfki.isem.s2m2.filter.learning.LearningFactory;
import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.Sample;
import de.dfki.isem.s2m2.filter.learning.TrainingException;
import de.dfki.isem.s2m2.filter.learning.TrainingSet;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage;
import de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl;
import de.dfki.s2m2.filter.inference.InferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LearningPackageImpl extends EPackageImpl implements LearningPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationLearnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trainingExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LearningPackageImpl() {
		super(eNS_URI, LearningFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LearningPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LearningPackage init() {
		if (isInited) return (LearningPackage)EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI);

		// Obtain or create and register package
		LearningPackageImpl theLearningPackage = (LearningPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LearningPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LearningPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InferencePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FilterPackageImpl theFilterPackage = (FilterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI) instanceof FilterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI) : FilterPackage.eINSTANCE);
		LibsvmPackageImpl theLibsvmPackage = (LibsvmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI) instanceof LibsvmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI) : LibsvmPackage.eINSTANCE);

		// Create package meta-data objects
		theLearningPackage.createPackageContents();
		theFilterPackage.createPackageContents();
		theLibsvmPackage.createPackageContents();

		// Initialize created meta-data
		theLearningPackage.initializePackageContents();
		theFilterPackage.initializePackageContents();
		theLibsvmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLearningPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LearningPackage.eNS_URI, theLearningPackage);
		return theLearningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationLearner() {
		return aggregationLearnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationLearner_Online() {
		return (EAttribute)aggregationLearnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationLearner_FeatureSpace() {
		return (EReference)aggregationLearnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainingSet() {
		return trainingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainingSet_Sample() {
		return (EReference)trainingSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainingSet_NumOfDimensions() {
		return (EAttribute)trainingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainingSet_Size() {
		return (EAttribute)trainingSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Request() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Candidate() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Relevant() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSample_Feature() {
		return (EAttribute)sampleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrainingException() {
		return trainingExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningFactory getLearningFactory() {
		return (LearningFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aggregationLearnerEClass = createEClass(AGGREGATION_LEARNER);
		createEAttribute(aggregationLearnerEClass, AGGREGATION_LEARNER__ONLINE);
		createEReference(aggregationLearnerEClass, AGGREGATION_LEARNER__FEATURE_SPACE);

		trainingSetEClass = createEClass(TRAINING_SET);
		createEAttribute(trainingSetEClass, TRAINING_SET__NUM_OF_DIMENSIONS);
		createEAttribute(trainingSetEClass, TRAINING_SET__SIZE);
		createEReference(trainingSetEClass, TRAINING_SET__SAMPLE);

		sampleEClass = createEClass(SAMPLE);
		createEAttribute(sampleEClass, SAMPLE__REQUEST);
		createEAttribute(sampleEClass, SAMPLE__CANDIDATE);
		createEAttribute(sampleEClass, SAMPLE__RELEVANT);
		createEAttribute(sampleEClass, SAMPLE__FEATURE);

		// Create data types
		trainingExceptionEDataType = createEDataType(TRAINING_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LibsvmPackage theLibsvmPackage = (LibsvmPackage)EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI);
		de.dfki.s2m2.filter.FilterPackage theFilterPackage_1 = (de.dfki.s2m2.filter.FilterPackage)EPackage.Registry.INSTANCE.getEPackage(de.dfki.s2m2.filter.FilterPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLibsvmPackage);

		// Create type parameters
		ETypeParameter aggregationLearnerEClass_Domain = addETypeParameter(aggregationLearnerEClass, "Domain");
		ETypeParameter trainingSetEClass_Domain = addETypeParameter(trainingSetEClass, "Domain");
		ETypeParameter sampleEClass_Domain = addETypeParameter(sampleEClass, "Domain");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theFilterPackage_1.getExpression());
		EGenericType g2 = createEGenericType(aggregationLearnerEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		aggregationLearnerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(aggregationLearnerEClass, AggregationLearner.class, "AggregationLearner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationLearner_Online(), ecorePackage.getEBooleanObject(), "online", "false", 1, 1, AggregationLearner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theFilterPackage_1.getExpression());
		g2 = createEGenericType(aggregationLearnerEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getAggregationLearner_FeatureSpace(), g1, null, "featureSpace", null, 1, -1, AggregationLearner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(aggregationLearnerEClass, null, "train", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTrainingSet());
		g2 = createEGenericType(aggregationLearnerEClass_Domain);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "trainingSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getTrainingException());

		initEClass(trainingSetEClass, TrainingSet.class, "TrainingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainingSet_NumOfDimensions(), ecorePackage.getEIntegerObject(), "numOfDimensions", null, 1, 1, TrainingSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainingSet_Size(), ecorePackage.getEIntegerObject(), "size", null, 1, 1, TrainingSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSample());
		g2 = createEGenericType(trainingSetEClass_Domain);
		g1.getETypeArguments().add(g2);
		initEReference(getTrainingSet_Sample(), g1, null, "sample", null, 1, -1, TrainingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(trainingSetEClass, null, "fold", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "n", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "seed", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(this.getTrainingSet());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(trainingSetEClass_Domain);
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(sampleEClass_Domain);
		initEAttribute(getSample_Request(), g1, "request", null, 1, 1, Sample.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(sampleEClass_Domain);
		initEAttribute(getSample_Candidate(), g1, "candidate", null, 1, 1, Sample.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Relevant(), ecorePackage.getEBoolean(), "relevant", "false", 1, 1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSample_Feature(), ecorePackage.getEDoubleObject(), "feature", null, 1, -1, Sample.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(trainingExceptionEDataType, TrainingException.class, "TrainingException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //LearningPackageImpl
