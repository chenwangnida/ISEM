/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import org.eclipse.emf.common.util.EList;

import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Literal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.ServiceLiteralEvaluation#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getServiceLiteralEvaluation()
 * @model superTypes="de.dfki.s2m2.filter.EntityExtraction<org.eclipse.emf.ecore.EString, de.dfki.s2m2.filter.Service, Range>"
 * @generated
 */
public interface ServiceLiteralEvaluation<Range> extends EntityExtraction<String, ServiceView, Range> {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.LiteralType}.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.LiteralType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see de.dfki.s2m2.filter.LiteralType
	 * @see de.dfki.s2m2.filter.FilterPackage#getServiceLiteralEvaluation_Types()
	 * @model required="true"
	 * @generated
	 */
	EList<LiteralType> getTypes();

} // ServiceLiteralEvaluation
