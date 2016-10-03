/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.SpecificationEvaluation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getSpecificationEvaluation()
 * @model superTypes="de.dfki.s2m2.filter.EntityExtraction<T, de.dfki.s2m2.filter.Service, Range>" TBounds="de.dfki.s2m2.filter.SpecificationExpression"
 * @generated
 */
public interface SpecificationEvaluation<T extends SpecificationExpression, Range> extends EntityExtraction<T, ServiceView, Range> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.SpecificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.s2m2.filter.SpecificationType
	 * @see #setType(SpecificationType)
	 * @see de.dfki.s2m2.filter.FilterPackage#getSpecificationEvaluation_Type()
	 * @model required="true"
	 * @generated
	 */
	SpecificationType getType();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.SpecificationEvaluation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.s2m2.filter.SpecificationType
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecificationType value);

} // SpecificationEvaluation
