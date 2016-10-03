/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.InferenceCapability;
import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.InferenceFactory;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InferencePackageImpl extends EPackageImpl implements InferencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferenceEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferenceCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inferenceExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType notSupportedExceptionEDataType = null;

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
	 * @see de.dfki.s2m2.filter.inference.InferencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InferencePackageImpl() {
		super(eNS_URI, InferenceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InferencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InferencePackage init() {
		if (isInited) return (InferencePackage)EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI);

		// Obtain or create and register package
		InferencePackageImpl theInferencePackage = (InferencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InferencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InferencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DlPackageImpl theDlPackage = (DlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) instanceof DlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) : DlPackage.eINSTANCE);
		PelletPackageImpl thePelletPackage = (PelletPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) instanceof PelletPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) : PelletPackage.eINSTANCE);
		TheoremprovingPackageImpl theTheoremprovingPackage = (TheoremprovingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) instanceof TheoremprovingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) : TheoremprovingPackage.eINSTANCE);
		ThetasubsumptionPackageImpl theThetasubsumptionPackage = (ThetasubsumptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) instanceof ThetasubsumptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) : ThetasubsumptionPackage.eINSTANCE);

		// Create package meta-data objects
		theInferencePackage.createPackageContents();
		theDlPackage.createPackageContents();
		thePelletPackage.createPackageContents();
		theTheoremprovingPackage.createPackageContents();
		theThetasubsumptionPackage.createPackageContents();

		// Initialize created meta-data
		theInferencePackage.initializePackageContents();
		theDlPackage.initializePackageContents();
		thePelletPackage.initializePackageContents();
		theTheoremprovingPackage.initializePackageContents();
		theThetasubsumptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInferencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InferencePackage.eNS_URI, theInferencePackage);
		return theInferencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInferenceEngine() {
		return inferenceEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInferenceEngine_Name() {
		return (EAttribute)inferenceEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInferenceEngine_Preprocessing() {
		return (EAttribute)inferenceEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInferenceCapability() {
		return inferenceCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInferenceCapability_Engine() {
		return (EReference)inferenceCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInferenceException() {
		return inferenceExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotSupportedException() {
		return notSupportedExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceFactory getInferenceFactory() {
		return (InferenceFactory)getEFactoryInstance();
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
		inferenceEngineEClass = createEClass(INFERENCE_ENGINE);
		createEAttribute(inferenceEngineEClass, INFERENCE_ENGINE__NAME);
		createEAttribute(inferenceEngineEClass, INFERENCE_ENGINE__PREPROCESSING);

		inferenceCapabilityEClass = createEClass(INFERENCE_CAPABILITY);
		createEReference(inferenceCapabilityEClass, INFERENCE_CAPABILITY__ENGINE);

		// Create data types
		inferenceExceptionEDataType = createEDataType(INFERENCE_EXCEPTION);
		notSupportedExceptionEDataType = createEDataType(NOT_SUPPORTED_EXCEPTION);
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
		DlPackage theDlPackage = (DlPackage)EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI);
		TheoremprovingPackage theTheoremprovingPackage = (TheoremprovingPackage)EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI);
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDlPackage);
		getESubpackages().add(theTheoremprovingPackage);

		// Create type parameters
		ETypeParameter inferenceEngineEClass_Domain = addETypeParameter(inferenceEngineEClass, "Domain");
		ETypeParameter inferenceCapabilityEClass_Domain = addETypeParameter(inferenceCapabilityEClass, "Domain");
		ETypeParameter inferenceCapabilityEClass_Range = addETypeParameter(inferenceCapabilityEClass, "Range");

		// Set bounds for type parameters

		// Add supertypes to classes
		inferenceEngineEClass.getESuperTypes().add(theFilterPackage.getResource());
		EGenericType g1 = createEGenericType(theFilterPackage.getExpression());
		EGenericType g2 = createEGenericType(inferenceCapabilityEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(inferenceCapabilityEClass_Range);
		g1.getETypeArguments().add(g2);
		inferenceCapabilityEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(inferenceEngineEClass, InferenceEngine.class, "InferenceEngine", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInferenceEngine_Name(), ecorePackage.getEString(), "name", null, 0, 1, InferenceEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInferenceEngine_Preprocessing(), ecorePackage.getEBoolean(), "preprocessing", "false", 0, 1, InferenceEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(inferenceEngineEClass, null, "process", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(inferenceEngineEClass_Domain);
		addEParameter(op, g1, "entity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inferenceCapabilityEClass, InferenceCapability.class, "InferenceCapability", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getInferenceEngine());
		g2 = createEGenericType(inferenceCapabilityEClass_Domain);
		g1.getETypeArguments().add(g2);
		initEReference(getInferenceCapability_Engine(), g1, null, "engine", null, 1, 1, InferenceCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(inferenceCapabilityEClass, null, "reason", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(inferenceCapabilityEClass_Domain);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "entities", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInferenceException());
		addEException(op, this.getNotSupportedException());
		g1 = createEGenericType(inferenceCapabilityEClass_Range);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(inferenceExceptionEDataType, InferenceException.class, "InferenceException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notSupportedExceptionEDataType, NotSupportedException.class, "NotSupportedException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InferencePackageImpl
