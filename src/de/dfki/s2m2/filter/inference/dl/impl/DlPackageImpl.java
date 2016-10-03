/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.DLReasoner;
import de.dfki.s2m2.filter.inference.dl.DlFactory;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.Equivalence;
import de.dfki.s2m2.filter.inference.dl.LeastGenericConcept;
import de.dfki.s2m2.filter.inference.dl.Subsumption;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl;
import de.dfki.s2m2.filter.inference.impl.InferencePackageImpl;
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
public class DlPackageImpl extends EPackageImpl implements DlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastGenericConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlReasonerEClass = null;

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
	 * @see de.dfki.s2m2.filter.inference.dl.DlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DlPackageImpl() {
		super(eNS_URI, DlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DlPackage init() {
		if (isInited) return (DlPackage)EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI);

		// Obtain or create and register package
		DlPackageImpl theDlPackage = (DlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		InferencePackageImpl theInferencePackage = (InferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) instanceof InferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) : InferencePackage.eINSTANCE);
		PelletPackageImpl thePelletPackage = (PelletPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) instanceof PelletPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) : PelletPackage.eINSTANCE);
		TheoremprovingPackageImpl theTheoremprovingPackage = (TheoremprovingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) instanceof TheoremprovingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) : TheoremprovingPackage.eINSTANCE);
		ThetasubsumptionPackageImpl theThetasubsumptionPackage = (ThetasubsumptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) instanceof ThetasubsumptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) : ThetasubsumptionPackage.eINSTANCE);

		// Create package meta-data objects
		theDlPackage.createPackageContents();
		theInferencePackage.createPackageContents();
		thePelletPackage.createPackageContents();
		theTheoremprovingPackage.createPackageContents();
		theThetasubsumptionPackage.createPackageContents();

		// Initialize created meta-data
		theDlPackage.initializePackageContents();
		theInferencePackage.initializePackageContents();
		thePelletPackage.initializePackageContents();
		theTheoremprovingPackage.initializePackageContents();
		theThetasubsumptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DlPackage.eNS_URI, theDlPackage);
		return theDlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalence() {
		return equivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsumption() {
		return subsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastGenericConcept() {
		return leastGenericConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDLReasoner() {
		return dlReasonerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DlFactory getDlFactory() {
		return (DlFactory)getEFactoryInstance();
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
		equivalenceEClass = createEClass(EQUIVALENCE);

		subsumptionEClass = createEClass(SUBSUMPTION);

		leastGenericConceptEClass = createEClass(LEAST_GENERIC_CONCEPT);

		dlReasonerEClass = createEClass(DL_REASONER);
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
		PelletPackage thePelletPackage = (PelletPackage)EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI);
		InferencePackage theInferencePackage = (InferencePackage)EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI);
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePelletPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		EGenericType g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		equivalenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage.getBooleanExpression());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		equivalenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		subsumptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage.getBooleanExpression());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		subsumptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		leastGenericConceptEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage.getBooleanExpression());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		leastGenericConceptEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceEngine());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		dlReasonerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(equivalenceEClass, Equivalence.class, "Equivalence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsumptionEClass, Subsumption.class, "Subsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastGenericConceptEClass, LeastGenericConcept.class, "LeastGenericConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dlReasonerEClass, DLReasoner.class, "DLReasoner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dlReasonerEClass, ecorePackage.getEBoolean(), "equivalent", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "concepts", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		addEException(op, theInferencePackage.getNotSupportedException());

		op = addEOperation(dlReasonerEClass, ecorePackage.getEBoolean(), "subsumes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage.getURI(), "subsumer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage.getURI(), "subsumed", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		addEException(op, theInferencePackage.getNotSupportedException());

		op = addEOperation(dlReasonerEClass, ecorePackage.getEBoolean(), "leastGeneric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage.getURI(), "parent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage.getURI(), "child", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		addEException(op, theInferencePackage.getNotSupportedException());
	}

} //DlPackageImpl
