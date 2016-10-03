/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl;
import de.dfki.s2m2.filter.inference.impl.InferencePackageImpl;
import de.dfki.s2m2.filter.inference.theoremproving.Implication;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremProver;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingFactory;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoremprovingPackageImpl extends EPackageImpl implements TheoremprovingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theoremProverEClass = null;

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
	 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TheoremprovingPackageImpl() {
		super(eNS_URI, TheoremprovingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TheoremprovingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TheoremprovingPackage init() {
		if (isInited) return (TheoremprovingPackage)EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI);

		// Obtain or create and register package
		TheoremprovingPackageImpl theTheoremprovingPackage = (TheoremprovingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TheoremprovingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TheoremprovingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		InferencePackageImpl theInferencePackage = (InferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) instanceof InferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) : InferencePackage.eINSTANCE);
		DlPackageImpl theDlPackage = (DlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) instanceof DlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) : DlPackage.eINSTANCE);
		PelletPackageImpl thePelletPackage = (PelletPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) instanceof PelletPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI) : PelletPackage.eINSTANCE);
		ThetasubsumptionPackageImpl theThetasubsumptionPackage = (ThetasubsumptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) instanceof ThetasubsumptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) : ThetasubsumptionPackage.eINSTANCE);

		// Create package meta-data objects
		theTheoremprovingPackage.createPackageContents();
		theInferencePackage.createPackageContents();
		theDlPackage.createPackageContents();
		thePelletPackage.createPackageContents();
		theThetasubsumptionPackage.createPackageContents();

		// Initialize created meta-data
		theTheoremprovingPackage.initializePackageContents();
		theInferencePackage.initializePackageContents();
		theDlPackage.initializePackageContents();
		thePelletPackage.initializePackageContents();
		theThetasubsumptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTheoremprovingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TheoremprovingPackage.eNS_URI, theTheoremprovingPackage);
		return theTheoremprovingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplication() {
		return implicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheoremProver() {
		return theoremProverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremprovingFactory getTheoremprovingFactory() {
		return (TheoremprovingFactory)getEFactoryInstance();
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
		implicationEClass = createEClass(IMPLICATION);

		theoremProverEClass = createEClass(THEOREM_PROVER);
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
		ThetasubsumptionPackage theThetasubsumptionPackage = (ThetasubsumptionPackage)EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI);
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);
		InferencePackage theInferencePackage = (InferencePackage)EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theThetasubsumptionPackage);

		// Create type parameters
		ETypeParameter implicationEClass_T = addETypeParameter(implicationEClass, "T");
		ETypeParameter theoremProverEClass_T = addETypeParameter(theoremProverEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theFilterPackage.getSpecificationExpression());
		implicationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theFilterPackage.getSpecificationExpression());
		theoremProverEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		EGenericType g2 = createEGenericType(implicationEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		implicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage.getBooleanExpression());
		g2 = createEGenericType(implicationEClass_T);
		g1.getETypeArguments().add(g2);
		implicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceEngine());
		g2 = createEGenericType(theoremProverEClass_T);
		g1.getETypeArguments().add(g2);
		theoremProverEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(theoremProverEClass, TheoremProver.class, "TheoremProver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(theoremProverEClass, ecorePackage.getEBoolean(), "implies", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theoremProverEClass_T);
		addEParameter(op, g1, "antecedent", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theoremProverEClass_T);
		addEParameter(op, g1, "consequent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		addEException(op, theInferencePackage.getNotSupportedException());
	}

} //TheoremprovingPackageImpl
