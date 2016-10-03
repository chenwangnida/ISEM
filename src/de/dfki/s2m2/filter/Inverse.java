/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.Inverse#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getInverse()
 * @model
 * @generated
 */
public interface Inverse<Domain, Range> extends Expression<Domain, Range> {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getInverse_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Range> getOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.Inverse#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression<Domain, Range> value);

} // Inverse
