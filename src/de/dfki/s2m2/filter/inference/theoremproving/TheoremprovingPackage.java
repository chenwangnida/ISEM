/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving;

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
 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingFactory
 * @model kind="package"
 * @generated
 */
public interface TheoremprovingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "theoremproving";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/inference/theoremproving";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheoremprovingPackage eINSTANCE = de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.theoremproving.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.ImplicationImpl
	 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__NAME = InferencePackage.INFERENCE_CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ENGINE = InferencePackage.INFERENCE_CAPABILITY__ENGINE;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = InferencePackage.INFERENCE_CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.theoremproving.TheoremProver <em>Theorem Prover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremProver
	 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl#getTheoremProver()
	 * @generated
	 */
	int THEOREM_PROVER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM_PROVER__NAME = InferencePackage.INFERENCE_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM_PROVER__PREPROCESSING = InferencePackage.INFERENCE_ENGINE__PREPROCESSING;

	/**
	 * The number of structural features of the '<em>Theorem Prover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEOREM_PROVER_FEATURE_COUNT = InferencePackage.INFERENCE_ENGINE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.theoremproving.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.theoremproving.TheoremProver <em>Theorem Prover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theorem Prover</em>'.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremProver
	 * @generated
	 */
	EClass getTheoremProver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TheoremprovingFactory getTheoremprovingFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.theoremproving.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.ImplicationImpl
		 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.theoremproving.TheoremProver <em>Theorem Prover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremProver
		 * @see de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingPackageImpl#getTheoremProver()
		 * @generated
		 */
		EClass THEOREM_PROVER = eINSTANCE.getTheoremProver();

	}

} //TheoremprovingPackage
