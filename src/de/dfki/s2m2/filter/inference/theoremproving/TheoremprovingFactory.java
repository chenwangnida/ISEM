/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving;

import org.eclipse.emf.ecore.EFactory;

import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage
 * @generated
 */
public interface TheoremprovingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TheoremprovingFactory eINSTANCE = de.dfki.s2m2.filter.inference.theoremproving.impl.TheoremprovingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication</em>'.
	 * @generated
	 */
	<T extends SpecificationExpression> Implication<T> createImplication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TheoremprovingPackage getTheoremprovingPackage();

} //TheoremprovingFactory
