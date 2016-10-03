/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage
 * @generated
 */
public interface LibsvmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibsvmFactory eINSTANCE = de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lib SVM Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lib SVM Aggregation</em>'.
	 * @generated
	 */
	LibSVMAggregation createLibSVMAggregation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibsvmPackage getLibsvmPackage();

} //LibsvmFactory
