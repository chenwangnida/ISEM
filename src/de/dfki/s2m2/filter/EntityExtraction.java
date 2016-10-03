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
 * A representation of the model object '<em><b>Entity Extraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.EntityExtraction#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getEntityExtraction()
 * @model abstract="true"
 * @generated
 */
public interface EntityExtraction<Focus, Domain, Range> extends Expression<Domain, Range> {
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
	 * @see de.dfki.s2m2.filter.FilterPackage#getEntityExtraction_Operand()
	 * @model type="de.dfki.s2m2.filter.Expression<de.dfki.s2m2.filter.Collection<Focus>, Range>" containment="true" required="true"
	 * @generated
	 */
	Expression<Collection<Focus>, Range> getOperand();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.EntityExtraction#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression<Collection<Focus>, Range> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.s2m2.filter.Collection<Focus>" required="true" upperRequired="true"
	 * @generated
	 */
	Collection<Focus> getEntities(Domain upper);

} // EntityExtraction
