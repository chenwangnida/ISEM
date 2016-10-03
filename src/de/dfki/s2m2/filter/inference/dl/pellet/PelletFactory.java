/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage
 * @generated
 */
public interface PelletFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PelletFactory eINSTANCE = de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reasoner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasoner</em>'.
	 * @generated
	 */
	PelletReasoner createPelletReasoner();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PelletPackage getPelletPackage();

} //PelletFactory
