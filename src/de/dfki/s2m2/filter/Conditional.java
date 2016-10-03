/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.Conditional#getIf <em>If</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.Conditional#getThen <em>Then</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.Conditional#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional<Domain, Range> extends Expression<Domain, Range> {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getConditional_If()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EBooleanObject>" containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Boolean> getIf();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.Conditional#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Expression<Domain, Boolean> value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getConditional_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Range> getThen();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.Conditional#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expression<Domain, Range> value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getConditional_Else()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Range> getElse();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.Conditional#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Expression<Domain, Range> value);

} // Conditional
