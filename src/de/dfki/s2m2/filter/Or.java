/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.Or#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getOr()
 * @model
 * @generated
 */
public interface Or<Domain> extends BooleanExpression<Domain> {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.Expression}&lt;Domain, java.lang.Boolean>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see de.dfki.s2m2.filter.FilterPackage#getOr_Operands()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EBooleanObject>" containment="true" lower="2"
	 * @generated
	 */
	EList<Expression<Domain, Boolean>> getOperands();

} // Or
