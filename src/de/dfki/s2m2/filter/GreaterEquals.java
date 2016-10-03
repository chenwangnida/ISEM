/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greater Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.GreaterEquals#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.GreaterEquals#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getGreaterEquals()
 * @model
 * @generated
 */
public interface GreaterEquals<Domain> extends BooleanExpression<Domain> {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getGreaterEquals_LeftOperand()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EDoubleObject>" containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Double> getLeftOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.GreaterEquals#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression<Domain, Double> value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getGreaterEquals_RightOperand()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EDoubleObject>" containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Double> getRightOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.GreaterEquals#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression<Domain, Double> value);

} // GreaterEquals
