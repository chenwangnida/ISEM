/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.s2m2.filter.inference.InferencePackage;

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
 * @see de.dfki.s2m2.filter.inference.dl.DlFactory
 * @model kind="package"
 * @generated
 */
public interface DlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/inference/dl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DlPackage eINSTANCE = de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.dl.impl.EquivalenceImpl <em>Equivalence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.dl.impl.EquivalenceImpl
	 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getEquivalence()
	 * @generated
	 */
	int EQUIVALENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Equivalence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.dl.impl.SubsumptionImpl <em>Subsumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.dl.impl.SubsumptionImpl
	 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getSubsumption()
	 * @generated
	 */
	int SUBSUMPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUMPTION__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUMPTION__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Subsumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUMPTION_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.dl.impl.LeastGenericConceptImpl <em>Least Generic Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.dl.impl.LeastGenericConceptImpl
	 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getLeastGenericConcept()
	 * @generated
	 */
	int LEAST_GENERIC_CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_GENERIC_CONCEPT__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_GENERIC_CONCEPT__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Least Generic Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_GENERIC_CONCEPT_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.dl.DLReasoner <em>DL Reasoner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.dl.DLReasoner
	 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getDLReasoner()
	 * @generated
	 */
	int DL_REASONER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_REASONER__NAME = InferencePackage.INFERENCE_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_REASONER__PREPROCESSING = InferencePackage.INFERENCE_ENGINE__PREPROCESSING;

	/**
	 * The number of structural features of the '<em>DL Reasoner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_REASONER_FEATURE_COUNT = InferencePackage.INFERENCE_ENGINE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.dl.Equivalence <em>Equivalence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.Equivalence
	 * @generated
	 */
	EClass getEquivalence();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.dl.Subsumption <em>Subsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsumption</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.Subsumption
	 * @generated
	 */
	EClass getSubsumption();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.dl.LeastGenericConcept <em>Least Generic Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Least Generic Concept</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.LeastGenericConcept
	 * @generated
	 */
	EClass getLeastGenericConcept();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.dl.DLReasoner <em>DL Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DL Reasoner</em>'.
	 * @see de.dfki.s2m2.filter.inference.dl.DLReasoner
	 * @generated
	 */
	EClass getDLReasoner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DlFactory getDlFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.dl.impl.EquivalenceImpl <em>Equivalence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.dl.impl.EquivalenceImpl
		 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getEquivalence()
		 * @generated
		 */
		EClass EQUIVALENCE = eINSTANCE.getEquivalence();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.dl.impl.SubsumptionImpl <em>Subsumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.dl.impl.SubsumptionImpl
		 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getSubsumption()
		 * @generated
		 */
		EClass SUBSUMPTION = eINSTANCE.getSubsumption();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.dl.impl.LeastGenericConceptImpl <em>Least Generic Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.dl.impl.LeastGenericConceptImpl
		 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getLeastGenericConcept()
		 * @generated
		 */
		EClass LEAST_GENERIC_CONCEPT = eINSTANCE.getLeastGenericConcept();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.dl.DLReasoner <em>DL Reasoner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.dl.DLReasoner
		 * @see de.dfki.s2m2.filter.inference.dl.impl.DlPackageImpl#getDLReasoner()
		 * @generated
		 */
		EClass DL_REASONER = eINSTANCE.getDLReasoner();

	}

} //DlPackage
