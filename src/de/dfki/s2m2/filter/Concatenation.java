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
 * A representation of the model object '<em><b>Concatenation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.Concatenation#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getConcatenation()
 * @model superTypes="de.dfki.s2m2.filter.Expression<de.dfki.s2m2.filter.Collection<org.eclipse.emf.ecore.EString>, Range>"
 * @generated
 */
public interface Concatenation<Range> extends Expression<Collection<String>, Range> {
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
	 * @see de.dfki.s2m2.filter.FilterPackage#getConcatenation_Operand()
	 * @model type="de.dfki.s2m2.filter.Expression<org.eclipse.emf.ecore.EString, Range>" containment="true" required="true"
	 * @generated
	 */
	Expression<String, Range> getOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.Concatenation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression<String, Range> value);

} // Concatenation
