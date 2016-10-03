/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forall Exists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.ForallExists#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getForallExists()
 * @model superTypes="de.dfki.s2m2.filter.BooleanExpression<de.dfki.s2m2.filter.Collection<Domain>>"
 * @generated
 */
public interface ForallExists<Domain> extends BooleanExpression<Collection<Domain>> {
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
	 * @see de.dfki.s2m2.filter.FilterPackage#getForallExists_Operand()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EBooleanObject>" containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Boolean> getOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.ForallExists#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression<Domain, Boolean> value);

} // ForallExists
