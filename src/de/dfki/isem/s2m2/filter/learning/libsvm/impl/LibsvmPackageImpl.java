/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm.impl;

import java.io.IOException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.impl.FilterPackageImpl;
import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmFactory;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage;
import de.dfki.s2m2.filter.inference.InferencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibsvmPackageImpl extends EPackageImpl implements LibsvmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libSVMAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType svmEDataType = null;

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
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibsvmPackageImpl() {
		super(eNS_URI, LibsvmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LibsvmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibsvmPackage init() {
		if (isInited) return (LibsvmPackage)EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI);

		// Obtain or create and register package
		LibsvmPackageImpl theLibsvmPackage = (LibsvmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibsvmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibsvmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InferencePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FilterPackageImpl theFilterPackage = (FilterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI) instanceof FilterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI) : FilterPackage.eINSTANCE);
		LearningPackageImpl theLearningPackage = (LearningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI) instanceof LearningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI) : LearningPackage.eINSTANCE);

		// Create package meta-data objects
		theLibsvmPackage.createPackageContents();
		theFilterPackage.createPackageContents();
		theLearningPackage.createPackageContents();

		// Initialize created meta-data
		theLibsvmPackage.initializePackageContents();
		theFilterPackage.initializePackageContents();
		theLearningPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibsvmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibsvmPackage.eNS_URI, theLibsvmPackage);
		return theLibsvmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibSVMAggregation() {
		return libSVMAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_Logger() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_CoarseGridStepSize() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_FineGridStepSize() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_Folds() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_Seed() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_Svm() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibSVMAggregation_Trained() {
		return (EAttribute)libSVMAggregationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSVM() {
		return svmEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibsvmFactory getLibsvmFactory() {
		return (LibsvmFactory)getEFactoryInstance();
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
		libSVMAggregationEClass = createEClass(LIB_SVM_AGGREGATION);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__LOGGER);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__FOLDS);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__SEED);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__SVM);
		createEAttribute(libSVMAggregationEClass, LIB_SVM_AGGREGATION__TRAINED);

		// Create data types
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		svmEDataType = createEDataType(SVM);
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
		LearningPackage theLearningPackage = (LearningPackage)EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI);
		de.dfki.s2m2.filter.FilterPackage theFilterPackage_1 = (de.dfki.s2m2.filter.FilterPackage)EPackage.Registry.INSTANCE.getEPackage(de.dfki.s2m2.filter.FilterPackage.eNS_URI);
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(svmEDataType, "Domain");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theLearningPackage.getAggregationLearner());
		EGenericType g2 = createEGenericType(theFilterPackage_1.getService());
		g1.getETypeArguments().add(g2);
		libSVMAggregationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage_1.getNumericalExpression());
		g2 = createEGenericType(theFilterPackage_1.getService());
		g1.getETypeArguments().add(g2);
		libSVMAggregationEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(libSVMAggregationEClass, LibSVMAggregation.class, "LibSVMAggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibSVMAggregation_Logger(), theFilterPackage.getLogger(), "logger", null, 1, 1, LibSVMAggregation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibSVMAggregation_CoarseGridStepSize(), ecorePackage.getEDouble(), "coarseGridStepSize", "2.0", 1, 1, LibSVMAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibSVMAggregation_FineGridStepSize(), ecorePackage.getEDouble(), "fineGridStepSize", "0.25", 1, 1, LibSVMAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibSVMAggregation_Folds(), ecorePackage.getEInt(), "folds", "6", 1, 1, LibSVMAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibSVMAggregation_Seed(), ecorePackage.getELong(), "seed", "0", 0, 1, LibSVMAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getSVM());
		g2 = createEGenericType(theFilterPackage_1.getService());
		g1.getETypeArguments().add(g2);
		initEAttribute(getLibSVMAggregation_Svm(), g1, "svm", null, 1, 1, LibSVMAggregation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibSVMAggregation_Trained(), ecorePackage.getEBoolean(), "trained", "false", 1, 1, LibSVMAggregation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(libSVMAggregationEClass, null, "saveModel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = addEOperation(libSVMAggregationEClass, null, "loadModel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		// Initialize data types
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(svmEDataType, de.dfki.isem.svm.SVM.class, "SVM", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //LibsvmPackageImpl
