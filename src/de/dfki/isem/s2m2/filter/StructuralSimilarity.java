/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter;

import java.net.URI;

import de.dfki.s2m2.filter.NumericalExpression;
import de.dfki.s2m2.filter.inference.InferenceCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Similarity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getBeta <em>Beta</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.FilterPackage#getStructuralSimilarity()
 * @model superTypes="de.dfki.s2m2.filter.inference.InferenceCapability<de.dfki.s2m2.filter.URI, org.eclipse.emf.ecore.EDoubleObject> de.dfki.s2m2.filter.NumericalExpression<de.dfki.s2m2.filter.URI>"
 * @generated
 */
public interface StructuralSimilarity extends InferenceCapability<URI, Double>, NumericalExpression<URI> {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(double)
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getStructuralSimilarity_Alpha()
	 * @model required="true"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' attribute.
	 * @see #setBeta(double)
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getStructuralSimilarity_Beta()
	 * @model required="true"
	 * @generated
	 */
	double getBeta();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity#getBeta <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' attribute.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(double value);

} // StructuralSimilarity
