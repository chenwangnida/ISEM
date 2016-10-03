/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.isem.s2m2.filter.FilterPackage
 * @generated
 */
public interface FilterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilterFactory eINSTANCE = de.dfki.isem.s2m2.filter.impl.FilterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>iSe MReasoner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>iSe MReasoner</em>'.
	 * @generated
	 */
	iSeMReasoner createiSeMReasoner();

	/**
	 * Returns a new object of class '<em>Approximated Subsumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approximated Subsumption</em>'.
	 * @generated
	 */
	ApproximatedSubsumption createApproximatedSubsumption();

	/**
	 * Returns a new object of class '<em>Direct Common Subsumers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Common Subsumers</em>'.
	 * @generated
	 */
	DirectCommonSubsumers createDirectCommonSubsumers();

	/**
	 * Returns a new object of class '<em>Structural Similarity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Similarity</em>'.
	 * @generated
	 */
	StructuralSimilarity createStructuralSimilarity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilterPackage getFilterPackage();

} //FilterFactory
