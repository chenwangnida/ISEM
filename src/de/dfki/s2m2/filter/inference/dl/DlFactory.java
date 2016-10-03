/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.inference.dl.DlPackage
 * @generated
 */
public interface DlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DlFactory eINSTANCE = de.dfki.s2m2.filter.inference.dl.impl.DlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence</em>'.
	 * @generated
	 */
	Equivalence createEquivalence();

	/**
	 * Returns a new object of class '<em>Subsumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsumption</em>'.
	 * @generated
	 */
	Subsumption createSubsumption();

	/**
	 * Returns a new object of class '<em>Least Generic Concept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Least Generic Concept</em>'.
	 * @generated
	 */
	LeastGenericConcept createLeastGenericConcept();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DlPackage getDlPackage();

} //DlFactory
