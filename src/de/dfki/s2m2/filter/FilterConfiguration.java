/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.FilterConfiguration#getResource <em>Resource</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.FilterConfiguration#getFilter <em>Filter</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedParameterTypes <em>Used Parameter Types</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedLiteralTypes <em>Used Literal Types</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedSpecificationTypes <em>Used Specification Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration()
 * @model
 * @generated
 */
public interface FilterConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.Expression}&lt;de.dfki.s2m2.service.ServiceView, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration_Filter()
	 * @model type="de.dfki.s2m2.filter.Expression<de.dfki.s2m2.filter.Service, ?>" containment="true" required="true"
	 * @generated
	 */
	EList<Expression<ServiceView, ?>> getFilter();

	/**
	 * Returns the value of the '<em><b>Used Parameter Types</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.ParameterType}.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Parameter Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Parameter Types</em>' attribute list.
	 * @see de.dfki.s2m2.filter.ParameterType
	 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration_UsedParameterTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='filter::SemanticAnnotationEvaluation.allInstances().type -> asOrderedSet()'"
	 * @generated
	 */
	EList<ParameterType> getUsedParameterTypes();

	/**
	 * Returns the value of the '<em><b>Used Literal Types</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.LiteralType}.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.LiteralType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Literal Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Literal Types</em>' attribute list.
	 * @see de.dfki.s2m2.filter.LiteralType
	 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration_UsedLiteralTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='filter::ServiceLiteralEvaluation.allInstances().types -> flatten()-> asOrderedSet()'"
	 * @generated
	 */
	EList<LiteralType> getUsedLiteralTypes();

	/**
	 * Returns the value of the '<em><b>Used Specification Types</b></em>' attribute list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.SpecificationType}.
	 * The literals are from the enumeration {@link de.dfki.s2m2.filter.SpecificationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Specification Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Specification Types</em>' attribute list.
	 * @see de.dfki.s2m2.filter.SpecificationType
	 * @see de.dfki.s2m2.filter.FilterPackage#getFilterConfiguration_UsedSpecificationTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='filter::SpecificationEvaluation.allInstances().type -> asOrderedSet()'"
	 * @generated
	 */
	EList<SpecificationType> getUsedSpecificationTypes();

} // FilterConfiguration
