/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.clarkparsia.modularity.IncrementalClassifier;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletFactory;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner;
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
public class PelletPackageImpl extends EPackageImpl implements PelletPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pelletReasonerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType owlOntologyManagerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType owlDataFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType owlOntologyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType incrementalClassifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

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
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PelletPackageImpl() {
		super(eNS_URI, PelletFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PelletPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PelletPackage init() {
		if (isInited) return (PelletPackage)EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI);

		// Obtain or create and register package
		PelletPackageImpl thePelletPackage = (PelletPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PelletPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PelletPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		InferencePackageImpl theInferencePackage = (InferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) instanceof InferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI) : InferencePackage.eINSTANCE);
		DlPackageImpl theDlPackage = (DlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) instanceof DlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DlPackage.eNS_URI) : DlPackage.eINSTANCE);
		TheoremprovingPackageImpl theTheoremprovingPackage = (TheoremprovingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) instanceof TheoremprovingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TheoremprovingPackage.eNS_URI) : TheoremprovingPackage.eINSTANCE);
		ThetasubsumptionPackageImpl theThetasubsumptionPackage = (ThetasubsumptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) instanceof ThetasubsumptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThetasubsumptionPackage.eNS_URI) : ThetasubsumptionPackage.eINSTANCE);

		// Create package meta-data objects
		thePelletPackage.createPackageContents();
		theInferencePackage.createPackageContents();
		theDlPackage.createPackageContents();
		theTheoremprovingPackage.createPackageContents();
		theThetasubsumptionPackage.createPackageContents();

		// Initialize created meta-data
		thePelletPackage.initializePackageContents();
		theInferencePackage.initializePackageContents();
		theDlPackage.initializePackageContents();
		theTheoremprovingPackage.initializePackageContents();
		theThetasubsumptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePelletPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PelletPackage.eNS_URI, thePelletPackage);
		return thePelletPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPelletReasoner() {
		return pelletReasonerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_LOCAL_ONTOLOGY_URI() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_OntologyManager() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_OwlFactory() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_LocalOntology() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_Classifier() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPelletReasoner_ProcessedConcepts() {
		return (EAttribute)pelletReasonerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOWLOntologyManager() {
		return owlOntologyManagerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOWLDataFactory() {
		return owlDataFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOWLOntology() {
		return owlOntologyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIncrementalClassifier() {
		return incrementalClassifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletFactory getPelletFactory() {
		return (PelletFactory)getEFactoryInstance();
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
		pelletReasonerEClass = createEClass(PELLET_REASONER);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__LOCAL_ONTOLOGY_URI);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__ONTOLOGY_MANAGER);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__OWL_FACTORY);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__LOCAL_ONTOLOGY);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__CLASSIFIER);
		createEAttribute(pelletReasonerEClass, PELLET_REASONER__PROCESSED_CONCEPTS);

		// Create data types
		owlOntologyManagerEDataType = createEDataType(OWL_ONTOLOGY_MANAGER);
		owlDataFactoryEDataType = createEDataType(OWL_DATA_FACTORY);
		owlOntologyEDataType = createEDataType(OWL_ONTOLOGY);
		incrementalClassifierEDataType = createEDataType(INCREMENTAL_CLASSIFIER);
		setEDataType = createEDataType(SET);
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
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(setEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		pelletReasonerEClass.getESuperTypes().add(theDlPackage.getDLReasoner());

		// Initialize classes and features; add operations and parameters
		initEClass(pelletReasonerEClass, PelletReasoner.class, "PelletReasoner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPelletReasoner_LOCAL_ONTOLOGY_URI(), ecorePackage.getEString(), "LOCAL_ONTOLOGY_URI", "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology", 1, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPelletReasoner_OntologyManager(), this.getOWLOntologyManager(), "ontologyManager", null, 1, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPelletReasoner_OwlFactory(), this.getOWLDataFactory(), "owlFactory", null, 1, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPelletReasoner_LocalOntology(), this.getOWLOntology(), "localOntology", null, 1, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPelletReasoner_Classifier(), this.getIncrementalClassifier(), "classifier", null, 1, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getSet());
		EGenericType g2 = createEGenericType(theFilterPackage.getURI());
		g1.getETypeArguments().add(g2);
		initEAttribute(getPelletReasoner_ProcessedConcepts(), g1, "processedConcepts", null, 0, 1, PelletReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(owlOntologyManagerEDataType, OWLOntologyManager.class, "OWLOntologyManager", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(owlDataFactoryEDataType, OWLDataFactory.class, "OWLDataFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(owlOntologyEDataType, OWLOntology.class, "OWLOntology", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(incrementalClassifierEDataType, IncrementalClassifier.class, "IncrementalClassifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //PelletPackageImpl
