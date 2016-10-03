/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.semanticweb.owl.model.OWLDescription;

import uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner;
import de.dfki.isem.s2m2.filter.ApproximatedSubsumption;
import de.dfki.isem.s2m2.filter.DirectCommonSubsumers;
import de.dfki.isem.s2m2.filter.FilterFactory;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.StructuralSimilarity;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.impl.LearningPackageImpl;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage;
import de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ViewExtractor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterPackageImpl extends EPackageImpl implements FilterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSeMReasonerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approximatedSubsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directCommonSubsumersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralSimilarityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType loggerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceRegistryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewExtractorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType digReasonerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType owlDescrptionEDataType = null;

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
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilterPackageImpl() {
		super(eNS_URI, FilterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FilterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilterPackage init() {
		if (isInited) return (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Obtain or create and register package
		FilterPackageImpl theFilterPackage = (FilterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FilterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FilterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InferencePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LearningPackageImpl theLearningPackage = (LearningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI) instanceof LearningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LearningPackage.eNS_URI) : LearningPackage.eINSTANCE);
		LibsvmPackageImpl theLibsvmPackage = (LibsvmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI) instanceof LibsvmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibsvmPackage.eNS_URI) : LibsvmPackage.eINSTANCE);

		// Create package meta-data objects
		theFilterPackage.createPackageContents();
		theLearningPackage.createPackageContents();
		theLibsvmPackage.createPackageContents();

		// Initialize created meta-data
		theFilterPackage.initializePackageContents();
		theLearningPackage.initializePackageContents();
		theLibsvmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilterPackage.eNS_URI, theFilterPackage);
		return theFilterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getiSeMReasoner() {
		return iSeMReasonerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_Logger() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_TEMP_CLASS_URI() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_LOCAL_ALN_ONTOLOGY() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_TEMP_ONTOLOGY() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_ServiceRegistry() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_ViewExtractor() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_MamasTng() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_AlnOntology() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_Probabilities() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getiSeMReasoner_ProbabilityLowerBound() {
		return (EAttribute)iSeMReasonerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApproximatedSubsumption() {
		return approximatedSubsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectCommonSubsumers() {
		return directCommonSubsumersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralSimilarity() {
		return structuralSimilarityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralSimilarity_Alpha() {
		return (EAttribute)structuralSimilarityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralSimilarity_Beta() {
		return (EAttribute)structuralSimilarityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogger() {
		return loggerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceRegistry() {
		return serviceRegistryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewExtractor() {
		return viewExtractorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDIGReasoner() {
		return digReasonerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOWLDescrption() {
		return owlDescrptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterFactory getFilterFactory() {
		return (FilterFactory)getEFactoryInstance();
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
		iSeMReasonerEClass = createEClass(ISE_MREASONER);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__LOGGER);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__TEMP_CLASS_URI);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__LOCAL_ALN_ONTOLOGY);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__TEMP_ONTOLOGY);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__SERVICE_REGISTRY);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__VIEW_EXTRACTOR);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__MAMAS_TNG);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__ALN_ONTOLOGY);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__PROBABILITIES);
		createEAttribute(iSeMReasonerEClass, ISE_MREASONER__PROBABILITY_LOWER_BOUND);

		approximatedSubsumptionEClass = createEClass(APPROXIMATED_SUBSUMPTION);

		directCommonSubsumersEClass = createEClass(DIRECT_COMMON_SUBSUMERS);

		structuralSimilarityEClass = createEClass(STRUCTURAL_SIMILARITY);
		createEAttribute(structuralSimilarityEClass, STRUCTURAL_SIMILARITY__ALPHA);
		createEAttribute(structuralSimilarityEClass, STRUCTURAL_SIMILARITY__BETA);

		// Create data types
		loggerEDataType = createEDataType(LOGGER);
		serviceRegistryEDataType = createEDataType(SERVICE_REGISTRY);
		viewExtractorEDataType = createEDataType(VIEW_EXTRACTOR);
		digReasonerEDataType = createEDataType(DIG_REASONER);
		owlDescrptionEDataType = createEDataType(OWL_DESCRPTION);
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
		PelletPackage thePelletPackage = (PelletPackage)EPackage.Registry.INSTANCE.getEPackage(PelletPackage.eNS_URI);
		de.dfki.s2m2.filter.FilterPackage theFilterPackage_1 = (de.dfki.s2m2.filter.FilterPackage)EPackage.Registry.INSTANCE.getEPackage(de.dfki.s2m2.filter.FilterPackage.eNS_URI);
		InferencePackage theInferencePackage = (InferencePackage)EPackage.Registry.INSTANCE.getEPackage(InferencePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLearningPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iSeMReasonerEClass.getESuperTypes().add(thePelletPackage.getPelletReasoner());
		EGenericType g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		EGenericType g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		approximatedSubsumptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage_1.getNumericalExpression());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		approximatedSubsumptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theFilterPackage_1.getCollection());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theFilterPackage_1.getURI());
		g2.getETypeArguments().add(g3);
		directCommonSubsumersEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theInferencePackage.getInferenceCapability());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		structuralSimilarityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theFilterPackage_1.getNumericalExpression());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		structuralSimilarityEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(iSeMReasonerEClass, iSeMReasoner.class, "iSeMReasoner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getiSeMReasoner_Logger(), this.getLogger(), "logger", null, 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_TEMP_CLASS_URI(), ecorePackage.getEString(), "TEMP_CLASS_URI", "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology#TempClass", 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_LOCAL_ALN_ONTOLOGY(), ecorePackage.getEString(), "LOCAL_ALN_ONTOLOGY", "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntologyALN", 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_TEMP_ONTOLOGY(), ecorePackage.getEString(), "TEMP_ONTOLOGY", "http://www-ags.dfki.uni-sb.de/ISeM/TempOntology", 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_ServiceRegistry(), this.getServiceRegistry(), "serviceRegistry", null, 0, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_ViewExtractor(), this.getViewExtractor(), "viewExtractor", null, 0, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_MamasTng(), this.getDIGReasoner(), "mamasTng", null, 0, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_AlnOntology(), thePelletPackage.getOWLOntology(), "alnOntology", null, 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEAttribute(getiSeMReasoner_Probabilities(), g1, "probabilities", null, 0, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getiSeMReasoner_ProbabilityLowerBound(), ecorePackage.getEDoubleObject(), "probabilityLowerBound", "9999999", 1, 1, iSeMReasoner.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(iSeMReasonerEClass, this.getOWLDescrption(), "contract", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "D", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		op = addEOperation(iSeMReasonerEClass, this.getOWLDescrption(), "abduce", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "D", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		op = addEOperation(iSeMReasonerEClass, this.getOWLDescrption(), "abduce", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOWLDescrption(), "K", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "D", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		op = addEOperation(iSeMReasonerEClass, ecorePackage.getEDoubleObject(), "probability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		op = addEOperation(iSeMReasonerEClass, ecorePackage.getEDoubleObject(), "probability", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOWLDescrption(), "C", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		addEOperation(iSeMReasonerEClass, null, "resetProbabilities", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iSeMReasonerEClass, null, "directCommonSubsumers", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "concept1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOWLDescrption(), "concept2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		g1 = createEGenericType(thePelletPackage.getSet());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iSeMReasonerEClass, null, "directCommonSubsumers", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "concept1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "concept2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());
		g1 = createEGenericType(thePelletPackage.getSet());
		g2 = createEGenericType(theFilterPackage_1.getURI());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iSeMReasonerEClass, ecorePackage.getEIntegerObject(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "concept", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		op = addEOperation(iSeMReasonerEClass, ecorePackage.getEIntegerObject(), "distanceToAncestor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "concept", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFilterPackage_1.getURI(), "ancestor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theInferencePackage.getInferenceException());

		initEClass(approximatedSubsumptionEClass, ApproximatedSubsumption.class, "ApproximatedSubsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directCommonSubsumersEClass, DirectCommonSubsumers.class, "DirectCommonSubsumers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralSimilarityEClass, StructuralSimilarity.class, "StructuralSimilarity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralSimilarity_Alpha(), ecorePackage.getEDouble(), "alpha", null, 1, 1, StructuralSimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuralSimilarity_Beta(), ecorePackage.getEDouble(), "beta", null, 1, 1, StructuralSimilarity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(loggerEDataType, Logger.class, "Logger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceRegistryEDataType, ServiceRegistry.class, "ServiceRegistry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewExtractorEDataType, ViewExtractor.class, "ViewExtractor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(digReasonerEDataType, DIGReasoner.class, "DIGReasoner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(owlDescrptionEDataType, OWLDescription.class, "OWLDescrption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FilterPackageImpl
