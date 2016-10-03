/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.FixedValue#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getFixedValue()
 * @model
 * @generated
 */
public interface FixedValue<Domain> extends NumericalExpression<Domain> {
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
	 * @see de.dfki.s2m2.filter.FilterPackage#getFixedValue_Alpha()
	 * @model
	 * @generated
	 */
	double getAlpha();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.FixedValue#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(double value);

} // FixedValue
