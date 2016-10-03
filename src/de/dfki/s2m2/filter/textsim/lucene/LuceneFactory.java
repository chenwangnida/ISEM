/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage
 * @generated
 */
public interface LuceneFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LuceneFactory eINSTANCE = de.dfki.s2m2.filter.textsim.lucene.impl.LuceneFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Index</em>'.
	 * @generated
	 */
	LuceneMemoryIndex createLuceneMemoryIndex();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LucenePackage getLucenePackage();

} //LuceneFactory
