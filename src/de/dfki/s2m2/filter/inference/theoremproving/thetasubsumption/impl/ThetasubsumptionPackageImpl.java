/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import alice.tuprolog.Prolog;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl;
import de.dfki.s2m2.filter.inference.impl.InferencePackageImpl;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionFactory;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.service.pddl.PDDLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThetasubsumptionPackageImpl extends EPackageImpl implements ThetasubsumptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thetaSubsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pddlExpressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prologEDataType = null;

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
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThetasubsumptionPackageImpl() {
		super(eNS_URI, ThetasubsumptionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ThetasubsumptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThetasubsumptionPackage init() {
		if (isInited) return (ThetasubsumptionPackage)EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI);

		// Obtain or create and register package
		ThetasubsumptionPackageImpl theThetasubsumptionPackage = (ThetasubsumptionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThetasubsumptionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThetasubsumptionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		InferencePackageImpl theInferencePackage = (InferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) instanceof InferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) : InferencePackage.eINSTANCE);
		DlPackageImpl theDlPackage = (DlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) instanceof DlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) : DlPackage.eINSTANCE);
		PelletPackageImpl thePelletPackage = (PelletPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) instanceof PelletPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) : PelletPackage.eINSTANCE);
		TheoremprovingPackageImpl theTheoremprovingPackage = (TheoremprovingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) instanceof TheoremprovingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) : TheoremprovingPackage.eINSTANCE);

		// Create package meta-data objects
		theThetasubsumptionPackage.createPackageContents();
		theInferencePackage.createPackageContents();
		theDlPackage.createPackageContents();
		thePelletPackage.createPackageContents();
		theTheoremprovingPackage.createPackageContents();

		// Initialize created meta-data
		theThetasubsumptionPackage.initializePackageContents();
		theInferencePackage.initializePackageContents();
		theDlPackage.initializePackageContents();
		thePelletPackage.initializePackageContents();
		theTheoremprovingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThetasubsumptionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThetasubsumptionPackage.eNS_URI, theThetasubsumptionPackage);
		return theThetasubsumptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThetaSubsumption() {
		return thetaSubsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThetaSubsumption_PrologTheoryLocation() {
		return (EAttribute)thetaSubsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThetaSubsumption_PrologEngine() {
		return (EAttribute)thetaSubsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPDDLExpression() {
		return pddlExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProlog() {
		return prologEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThetasubsumptionFactory getThetasubsumptionFactory() {
		return (ThetasubsumptionFactory)getEFactoryInstance();
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
		thetaSubsumptionEClass = createEClass(THETA_SUBSUMPTION);
		createEAttribute(thetaSubsumptionEClass, THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION);
		createEAttribute(thetaSubsumptionEClass, THETA_SUBSUMPTION__PROLOG_ENGINE);

		// Create data types
		pddlExpressionEDataType = createEDataType(PDDL_EXPRESSION);
		prologEDataType = createEDataType(PROLOG);
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
		TheoremprovingPackage theTheoremprovingPackage = (TheoremprovingPackage)EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTheoremprovingPackage.getTheoremProver());
		EGenericType g2 = createEGenericType(this.getPDDLExpression());
		g1.getETypeArguments().add(g2);
		thetaSubsumptionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(thetaSubsumptionEClass, ThetaSubsumption.class, "ThetaSubsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThetaSubsumption_PrologTheoryLocation(), ecorePackage.getEString(), "prologTheoryLocation", "Prolog/plain_subsume.pl", 1, 1, ThetaSubsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThetaSubsumption_PrologEngine(), this.getProlog(), "prologEngine", null, 1, 1, ThetaSubsumption.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(pddlExpressionEDataType, PDDLExpression.class, "PDDLExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prologEDataType, Prolog.class, "Prolog", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //ThetasubsumptionPackageImpl
