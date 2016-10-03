/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.textsim.TextsimPackage
 * @generated
 */
public interface TextsimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextsimFactory eINSTANCE = de.dfki.s2m2.filter.textsim.impl.TextsimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Loss Of Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loss Of Information</em>'.
	 * @generated
	 */
	LossOfInformation createLossOfInformation();

	/**
	 * Returns a new object of class '<em>Cosine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cosine</em>'.
	 * @generated
	 */
	Cosine createCosine();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TextsimPackage getTextsimPackage();

} //TextsimFactory
