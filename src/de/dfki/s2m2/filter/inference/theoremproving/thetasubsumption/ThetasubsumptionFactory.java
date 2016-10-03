/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage
 * @generated
 */
public interface ThetasubsumptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThetasubsumptionFactory eINSTANCE = de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetasubsumptionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Theta Subsumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theta Subsumption</em>'.
	 * @generated
	 */
	ThetaSubsumption createThetaSubsumption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThetasubsumptionPackage getThetasubsumptionPackage();

} //ThetasubsumptionFactory
