/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;

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
 * @see de.dfki.isem.s2m2.filter.FilterFactory
 * @model kind="package"
 * @generated
 */
public interface FilterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/isem/2011/isem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "isem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilterPackage eINSTANCE = de.dfki.isem.s2m2.filter.impl.FilterPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl <em>iSe MReasoner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getiSeMReasoner()
	 * @generated
	 */
	int ISE_MREASONER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__NAME = PelletPackage.PELLET_REASONER__NAME;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__PREPROCESSING = PelletPackage.PELLET_REASONER__PREPROCESSING;

	/**
	 * The feature id for the '<em><b>LOCAL ONTOLOGY URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__LOCAL_ONTOLOGY_URI = PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__ONTOLOGY_MANAGER = PelletPackage.PELLET_REASONER__ONTOLOGY_MANAGER;

	/**
	 * The feature id for the '<em><b>Owl Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__OWL_FACTORY = PelletPackage.PELLET_REASONER__OWL_FACTORY;

	/**
	 * The feature id for the '<em><b>Local Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__LOCAL_ONTOLOGY = PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__CLASSIFIER = PelletPackage.PELLET_REASONER__CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Processed Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__PROCESSED_CONCEPTS = PelletPackage.PELLET_REASONER__PROCESSED_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__LOGGER = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>TEMP CLASS URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__TEMP_CLASS_URI = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LOCAL ALN ONTOLOGY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__LOCAL_ALN_ONTOLOGY = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TEMP ONTOLOGY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__TEMP_ONTOLOGY = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__SERVICE_REGISTRY = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__VIEW_EXTRACTOR = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mamas Tng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__MAMAS_TNG = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aln Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__ALN_ONTOLOGY = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__PROBABILITIES = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Probability Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER__PROBABILITY_LOWER_BOUND = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>iSe MReasoner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISE_MREASONER_FEATURE_COUNT = PelletPackage.PELLET_REASONER_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.impl.ApproximatedSubsumptionImpl <em>Approximated Subsumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.impl.ApproximatedSubsumptionImpl
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getApproximatedSubsumption()
	 * @generated
	 */
	int APPROXIMATED_SUBSUMPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATED_SUBSUMPTION__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATED_SUBSUMPTION__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Approximated Subsumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROXIMATED_SUBSUMPTION_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.impl.DirectCommonSubsumersImpl <em>Direct Common Subsumers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.impl.DirectCommonSubsumersImpl
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getDirectCommonSubsumers()
	 * @generated
	 */
	int DIRECT_COMMON_SUBSUMERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMON_SUBSUMERS__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMON_SUBSUMERS__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Direct Common Subsumers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_COMMON_SUBSUMERS_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl <em>Structural Similarity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getStructuralSimilarity()
	 * @generated
	 */
	int STRUCTURAL_SIMILARITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_SIMILARITY__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_SIMILARITY__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_SIMILARITY__ALPHA = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_SIMILARITY__BETA = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Similarity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_SIMILARITY_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Logger</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.log4j.Logger
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 4;

	/**
	 * The meta object id for the '<em>Service Registry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.ServiceRegistry
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getServiceRegistry()
	 * @generated
	 */
	int SERVICE_REGISTRY = 5;

	/**
	 * The meta object id for the '<em>View Extractor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.ViewExtractor
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getViewExtractor()
	 * @generated
	 */
	int VIEW_EXTRACTOR = 6;

	/**
	 * The meta object id for the '<em>DIG Reasoner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getDIGReasoner()
	 * @generated
	 */
	int DIG_REASONER = 7;

	/**
	 * The meta object id for the '<em>OWL Descrption</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.semanticweb.owl.model.OWLDescription
	 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getOWLDescrption()
	 * @generated
	 */
	int OWL_DESCRPTION = 8;


	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.iSeMReasoner <em>iSe MReasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>iSe MReasoner</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner
	 * @generated
	 */
	EClass getiSeMReasoner();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getLogger()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_Logger();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_CLASS_URI <em>TEMP CLASS URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TEMP CLASS URI</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_CLASS_URI()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_TEMP_CLASS_URI();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getLOCAL_ALN_ONTOLOGY <em>LOCAL ALN ONTOLOGY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOCAL ALN ONTOLOGY</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getLOCAL_ALN_ONTOLOGY()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_LOCAL_ALN_ONTOLOGY();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_ONTOLOGY <em>TEMP ONTOLOGY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TEMP ONTOLOGY</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_ONTOLOGY()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_TEMP_ONTOLOGY();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Registry</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getServiceRegistry()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_ServiceRegistry();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getViewExtractor <em>View Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Extractor</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getViewExtractor()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_ViewExtractor();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getMamasTng <em>Mamas Tng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mamas Tng</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getMamasTng()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_MamasTng();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getAlnOntology <em>Aln Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aln Ontology</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getAlnOntology()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_AlnOntology();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilities <em>Probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probabilities</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilities()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_Probabilities();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilityLowerBound <em>Probability Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability Lower Bound</em>'.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilityLowerBound()
	 * @see #getiSeMReasoner()
	 * @generated
	 */
	EAttribute getiSeMReasoner_ProbabilityLowerBound();

	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.ApproximatedSubsumption <em>Approximated Subsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approximated Subsumption</em>'.
	 * @see de.dfki.isem.s2m2.filter.ApproximatedSubsumption
	 * @generated
	 */
	EClass getApproximatedSubsumption();

	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.DirectCommonSubsumers <em>Direct Common Subsumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Common Subsumers</em>'.
	 * @see de.dfki.isem.s2m2.filter.DirectCommonSubsumers
	 * @generated
	 */
	EClass getDirectCommonSubsumers();

	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity <em>Structural Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Similarity</em>'.
	 * @see de.dfki.isem.s2m2.filter.StructuralSimilarity
	 * @generated
	 */
	EClass getStructuralSimilarity();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see de.dfki.isem.s2m2.filter.StructuralSimilarity#getAlpha()
	 * @see #getStructuralSimilarity()
	 * @generated
	 */
	EAttribute getStructuralSimilarity_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getBeta <em>Beta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beta</em>'.
	 * @see de.dfki.isem.s2m2.filter.StructuralSimilarity#getBeta()
	 * @see #getStructuralSimilarity()
	 * @generated
	 */
	EAttribute getStructuralSimilarity_Beta();

	/**
	 * Returns the meta object for data type '{@link org.apache.log4j.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Logger</em>'.
	 * @see org.apache.log4j.Logger
	 * @model instanceClass="org.apache.log4j.Logger"
	 * @generated
	 */
	EDataType getLogger();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.ServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Registry</em>'.
	 * @see de.dfki.s2m2.service.ServiceRegistry
	 * @model instanceClass="de.dfki.s2m2.service.ServiceRegistry"
	 * @generated
	 */
	EDataType getServiceRegistry();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.ViewExtractor <em>View Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Extractor</em>'.
	 * @see de.dfki.s2m2.service.ViewExtractor
	 * @model instanceClass="de.dfki.s2m2.service.ViewExtractor"
	 * @generated
	 */
	EDataType getViewExtractor();

	/**
	 * Returns the meta object for data type '{@link uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner <em>DIG Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DIG Reasoner</em>'.
	 * @see uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner
	 * @model instanceClass="uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner"
	 * @generated
	 */
	EDataType getDIGReasoner();

	/**
	 * Returns the meta object for data type '{@link org.semanticweb.owl.model.OWLDescription <em>OWL Descrption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OWL Descrption</em>'.
	 * @see org.semanticweb.owl.model.OWLDescription
	 * @model instanceClass="org.semanticweb.owl.model.OWLDescription"
	 * @generated
	 */
	EDataType getOWLDescrption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilterFactory getFilterFactory();

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
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl <em>iSe MReasoner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getiSeMReasoner()
		 * @generated
		 */
		EClass ISE_MREASONER = eINSTANCE.getiSeMReasoner();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__LOGGER = eINSTANCE.getiSeMReasoner_Logger();

		/**
		 * The meta object literal for the '<em><b>TEMP CLASS URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__TEMP_CLASS_URI = eINSTANCE.getiSeMReasoner_TEMP_CLASS_URI();

		/**
		 * The meta object literal for the '<em><b>LOCAL ALN ONTOLOGY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__LOCAL_ALN_ONTOLOGY = eINSTANCE.getiSeMReasoner_LOCAL_ALN_ONTOLOGY();

		/**
		 * The meta object literal for the '<em><b>TEMP ONTOLOGY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__TEMP_ONTOLOGY = eINSTANCE.getiSeMReasoner_TEMP_ONTOLOGY();

		/**
		 * The meta object literal for the '<em><b>Service Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__SERVICE_REGISTRY = eINSTANCE.getiSeMReasoner_ServiceRegistry();

		/**
		 * The meta object literal for the '<em><b>View Extractor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__VIEW_EXTRACTOR = eINSTANCE.getiSeMReasoner_ViewExtractor();

		/**
		 * The meta object literal for the '<em><b>Mamas Tng</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__MAMAS_TNG = eINSTANCE.getiSeMReasoner_MamasTng();

		/**
		 * The meta object literal for the '<em><b>Aln Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__ALN_ONTOLOGY = eINSTANCE.getiSeMReasoner_AlnOntology();

		/**
		 * The meta object literal for the '<em><b>Probabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__PROBABILITIES = eINSTANCE.getiSeMReasoner_Probabilities();

		/**
		 * The meta object literal for the '<em><b>Probability Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISE_MREASONER__PROBABILITY_LOWER_BOUND = eINSTANCE.getiSeMReasoner_ProbabilityLowerBound();

		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.impl.ApproximatedSubsumptionImpl <em>Approximated Subsumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.impl.ApproximatedSubsumptionImpl
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getApproximatedSubsumption()
		 * @generated
		 */
		EClass APPROXIMATED_SUBSUMPTION = eINSTANCE.getApproximatedSubsumption();

		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.impl.DirectCommonSubsumersImpl <em>Direct Common Subsumers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.impl.DirectCommonSubsumersImpl
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getDirectCommonSubsumers()
		 * @generated
		 */
		EClass DIRECT_COMMON_SUBSUMERS = eINSTANCE.getDirectCommonSubsumers();

		/**
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl <em>Structural Similarity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getStructuralSimilarity()
		 * @generated
		 */
		EClass STRUCTURAL_SIMILARITY = eINSTANCE.getStructuralSimilarity();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_SIMILARITY__ALPHA = eINSTANCE.getStructuralSimilarity_Alpha();

		/**
		 * The meta object literal for the '<em><b>Beta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_SIMILARITY__BETA = eINSTANCE.getStructuralSimilarity_Beta();

		/**
		 * The meta object literal for the '<em>Logger</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.log4j.Logger
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getLogger()
		 * @generated
		 */
		EDataType LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '<em>Service Registry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.ServiceRegistry
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getServiceRegistry()
		 * @generated
		 */
		EDataType SERVICE_REGISTRY = eINSTANCE.getServiceRegistry();

		/**
		 * The meta object literal for the '<em>View Extractor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.ViewExtractor
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getViewExtractor()
		 * @generated
		 */
		EDataType VIEW_EXTRACTOR = eINSTANCE.getViewExtractor();

		/**
		 * The meta object literal for the '<em>DIG Reasoner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getDIGReasoner()
		 * @generated
		 */
		EDataType DIG_REASONER = eINSTANCE.getDIGReasoner();

		/**
		 * The meta object literal for the '<em>OWL Descrption</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.semanticweb.owl.model.OWLDescription
		 * @see de.dfki.isem.s2m2.filter.impl.FilterPackageImpl#getOWLDescrption()
		 * @generated
		 */
		EDataType OWL_DESCRPTION = eINSTANCE.getOWLDescrption();

	}

} //FilterPackage
