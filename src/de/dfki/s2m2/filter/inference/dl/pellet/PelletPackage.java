/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.s2m2.filter.inference.dl.DlPackage;

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
 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletFactory
 * @model kind="package"
 * @generated
 */
public interface PelletPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pellet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/inference/dl/pellet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pellet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PelletPackage eINSTANCE = de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl <em>Reasoner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getPelletReasoner()
	 * @generated
	 */
	int PELLET_REASONER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__NAME = DlPackage.DL_REASONER__NAME;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__PREPROCESSING = DlPackage.DL_REASONER__PREPROCESSING;

	/**
	 * The feature id for the '<em><b>LOCAL ONTOLOGY URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__LOCAL_ONTOLOGY_URI = DlPackage.DL_REASONER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ontology Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__ONTOLOGY_MANAGER = DlPackage.DL_REASONER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owl Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__OWL_FACTORY = DlPackage.DL_REASONER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__LOCAL_ONTOLOGY = DlPackage.DL_REASONER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__CLASSIFIER = DlPackage.DL_REASONER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processed Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER__PROCESSED_CONCEPTS = DlPackage.DL_REASONER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reasoner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELLET_REASONER_FEATURE_COUNT = DlPackage.DL_REASONER_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '<em>OWL Ontology Manager</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.semanticweb.owl.model.OWLOntologyManager
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLOntologyManager()
	 * @generated
	 */
	int OWL_ONTOLOGY_MANAGER = 1;

	/**
	 * The meta object id for the '<em>OWL Data Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.semanticweb.owl.model.OWLDataFactory
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLDataFactory()
	 * @generated
	 */
	int OWL_DATA_FACTORY = 2;

	/**
	 * The meta object id for the '<em>OWL Ontology</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.semanticweb.owl.model.OWLOntology
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLOntology()
	 * @generated
	 */
	int OWL_ONTOLOGY = 3;

	/**
	 * The meta object id for the '<em>Incremental Classifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clarkparsia.modularity.IncrementalClassifier
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getIncrementalClassifier()
	 * @generated
	 */
	int INCREMENTAL_CLASSIFIER = 4;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getSet()
	 * @generated
	 */
	int SET = 5;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner <em>Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoner</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner
	 * @generated
	 */
	EClass getPelletReasoner();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLOCAL_ONTOLOGY_URI <em>LOCAL ONTOLOGY URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LOCAL ONTOLOGY URI</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLOCAL_ONTOLOGY_URI()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_LOCAL_ONTOLOGY_URI();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOntologyManager <em>Ontology Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology Manager</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOntologyManager()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_OntologyManager();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOwlFactory <em>Owl Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owl Factory</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOwlFactory()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_OwlFactory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLocalOntology <em>Local Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Ontology</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLocalOntology()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_LocalOntology();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classifier</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getClassifier()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getProcessedConcepts <em>Processed Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processed Concepts</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getProcessedConcepts()
	 * @see #getPelletReasoner()
	 * @generated
	 */
	EAttribute getPelletReasoner_ProcessedConcepts();

	/**
	 * Returns the meta object for data type '{@link org.semanticweb.owl.model.OWLOntologyManager <em>OWL Ontology Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OWL Ontology Manager</em>'.
	 * @see org.semanticweb.owl.model.OWLOntologyManager
	 * @model instanceClass="org.semanticweb.owl.model.OWLOntologyManager"
	 * @generated
	 */
	EDataType getOWLOntologyManager();

	/**
	 * Returns the meta object for data type '{@link org.semanticweb.owl.model.OWLDataFactory <em>OWL Data Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OWL Data Factory</em>'.
	 * @see org.semanticweb.owl.model.OWLDataFactory
	 * @model instanceClass="org.semanticweb.owl.model.OWLDataFactory"
	 * @generated
	 */
	EDataType getOWLDataFactory();

	/**
	 * Returns the meta object for data type '{@link org.semanticweb.owl.model.OWLOntology <em>OWL Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OWL Ontology</em>'.
	 * @see org.semanticweb.owl.model.OWLOntology
	 * @model instanceClass="org.semanticweb.owl.model.OWLOntology"
	 * @generated
	 */
	EDataType getOWLOntology();

	/**
	 * Returns the meta object for data type '{@link com.clarkparsia.modularity.IncrementalClassifier <em>Incremental Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Incremental Classifier</em>'.
	 * @see com.clarkparsia.modularity.IncrementalClassifier
	 * @model instanceClass="com.clarkparsia.modularity.IncrementalClassifier"
	 * @generated
	 */
	EDataType getIncrementalClassifier();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PelletFactory getPelletFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl <em>Reasoner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getPelletReasoner()
		 * @generated
		 */
		EClass PELLET_REASONER = eINSTANCE.getPelletReasoner();

		/**
		 * The meta object literal for the '<em><b>LOCAL ONTOLOGY URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__LOCAL_ONTOLOGY_URI = eINSTANCE.getPelletReasoner_LOCAL_ONTOLOGY_URI();

		/**
		 * The meta object literal for the '<em><b>Ontology Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__ONTOLOGY_MANAGER = eINSTANCE.getPelletReasoner_OntologyManager();

		/**
		 * The meta object literal for the '<em><b>Owl Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__OWL_FACTORY = eINSTANCE.getPelletReasoner_OwlFactory();

		/**
		 * The meta object literal for the '<em><b>Local Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__LOCAL_ONTOLOGY = eINSTANCE.getPelletReasoner_LocalOntology();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__CLASSIFIER = eINSTANCE.getPelletReasoner_Classifier();

		/**
		 * The meta object literal for the '<em><b>Processed Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELLET_REASONER__PROCESSED_CONCEPTS = eINSTANCE.getPelletReasoner_ProcessedConcepts();

		/**
		 * The meta object literal for the '<em>OWL Ontology Manager</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.semanticweb.owl.model.OWLOntologyManager
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLOntologyManager()
		 * @generated
		 */
		EDataType OWL_ONTOLOGY_MANAGER = eINSTANCE.getOWLOntologyManager();

		/**
		 * The meta object literal for the '<em>OWL Data Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.semanticweb.owl.model.OWLDataFactory
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLDataFactory()
		 * @generated
		 */
		EDataType OWL_DATA_FACTORY = eINSTANCE.getOWLDataFactory();

		/**
		 * The meta object literal for the '<em>OWL Ontology</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.semanticweb.owl.model.OWLOntology
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getOWLOntology()
		 * @generated
		 */
		EDataType OWL_ONTOLOGY = eINSTANCE.getOWLOntology();

		/**
		 * The meta object literal for the '<em>Incremental Classifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clarkparsia.modularity.IncrementalClassifier
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getIncrementalClassifier()
		 * @generated
		 */
		EDataType INCREMENTAL_CLASSIFIER = eINSTANCE.getIncrementalClassifier();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

	}

} //PelletPackage
