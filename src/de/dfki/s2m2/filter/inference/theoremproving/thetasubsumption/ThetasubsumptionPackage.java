/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;

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
 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionFactory
 * @model kind="package"
 * @generated
 */
public interface ThetasubsumptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thetasubsumption";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/inference/theoremproving/theta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "theta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThetasubsumptionPackage eINSTANCE = de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl <em>Theta Subsumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getThetaSubsumption()
	 * @generated
	 */
	int THETA_SUBSUMPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THETA_SUBSUMPTION__NAME = TheoremprovingPackage.THEOREM_PROVER__NAME;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THETA_SUBSUMPTION__PREPROCESSING = TheoremprovingPackage.THEOREM_PROVER__PREPROCESSING;

	/**
	 * The feature id for the '<em><b>Prolog Theory Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION = TheoremprovingPackage.THEOREM_PROVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prolog Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THETA_SUBSUMPTION__PROLOG_ENGINE = TheoremprovingPackage.THEOREM_PROVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Theta Subsumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THETA_SUBSUMPTION_FEATURE_COUNT = TheoremprovingPackage.THEOREM_PROVER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>PDDL Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.pddl.PDDLExpression
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getPDDLExpression()
	 * @generated
	 */
	int PDDL_EXPRESSION = 1;

	/**
	 * The meta object id for the '<em>Prolog</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alice.tuprolog.Prolog
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getProlog()
	 * @generated
	 */
	int PROLOG = 2;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption <em>Theta Subsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theta Subsumption</em>'.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption
	 * @generated
	 */
	EClass getThetaSubsumption();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologTheoryLocation <em>Prolog Theory Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prolog Theory Location</em>'.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologTheoryLocation()
	 * @see #getThetaSubsumption()
	 * @generated
	 */
	EAttribute getThetaSubsumption_PrologTheoryLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologEngine <em>Prolog Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prolog Engine</em>'.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologEngine()
	 * @see #getThetaSubsumption()
	 * @generated
	 */
	EAttribute getThetaSubsumption_PrologEngine();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.pddl.PDDLExpression <em>PDDL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PDDL Expression</em>'.
	 * @see de.dfki.s2m2.service.pddl.PDDLExpression
	 * @model instanceClass="de.dfki.s2m2.service.pddl.PDDLExpression"
	 * @generated
	 */
	EDataType getPDDLExpression();

	/**
	 * Returns the meta object for data type '{@link alice.tuprolog.Prolog <em>Prolog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prolog</em>'.
	 * @see alice.tuprolog.Prolog
	 * @model instanceClass="alice.tuprolog.Prolog" serializeable="false"
	 * @generated
	 */
	EDataType getProlog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThetasubsumptionFactory getThetasubsumptionFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl <em>Theta Subsumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl
		 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getThetaSubsumption()
		 * @generated
		 */
		EClass THETA_SUBSUMPTION = eINSTANCE.getThetaSubsumption();

		/**
		 * The meta object literal for the '<em><b>Prolog Theory Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION = eINSTANCE.getThetaSubsumption_PrologTheoryLocation();

		/**
		 * The meta object literal for the '<em><b>Prolog Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THETA_SUBSUMPTION__PROLOG_ENGINE = eINSTANCE.getThetaSubsumption_PrologEngine();

		/**
		 * The meta object literal for the '<em>PDDL Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.pddl.PDDLExpression
		 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getPDDLExpression()
		 * @generated
		 */
		EDataType PDDL_EXPRESSION = eINSTANCE.getPDDLExpression();

		/**
		 * The meta object literal for the '<em>Prolog</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alice.tuprolog.Prolog
		 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionPackageImpl#getProlog()
		 * @generated
		 */
		EDataType PROLOG = eINSTANCE.getProlog();

	}

} //ThetasubsumptionPackage
