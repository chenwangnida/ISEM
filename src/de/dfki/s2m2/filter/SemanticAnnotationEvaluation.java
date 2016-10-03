/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import java.net.URI;

import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Annotation Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.SemanticAnnotationEvaluation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getSemanticAnnotationEvaluation()
 * @model superTypes="de.dfki.s2m2.filter.EntityExtraction<de.dfki.s2m2.filter.URI, de.dfki.s2m2.filter.Service, Range>"
 * @generated
 */
public interface SemanticAnnotationEvaluation<Range> extends EntityExtraction<URI, ServiceView, Range> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dfki.s2m2.filter.ParameterType
	 * @see #setType(ParameterType)
	 * @see de.dfki.s2m2.filter.FilterPackage#getSemanticAnnotationEvaluation_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.SemanticAnnotationEvaluation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dfki.s2m2.filter.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

} // SemanticAnnotationEvaluation
