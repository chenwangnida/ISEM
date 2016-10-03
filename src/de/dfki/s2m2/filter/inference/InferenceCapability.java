/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference;

import org.eclipse.emf.common.util.EList;

import de.dfki.s2m2.filter.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.InferenceCapability#getEngine <em>Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.inference.InferencePackage#getInferenceCapability()
 * @model abstract="true"
 * @generated
 */
public interface InferenceCapability<Domain, Range> extends Expression<Domain, Range> {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(InferenceEngine)
	 * @see de.dfki.s2m2.filter.inference.InferencePackage#getInferenceCapability_Engine()
	 * @model required="true"
	 * @generated
	 */
	InferenceEngine<Domain> getEngine();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.inference.InferenceCapability#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(InferenceEngine<Domain> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.inference.InferenceException de.dfki.s2m2.filter.inference.NotSupportedException" entitiesRequired="true" entitiesMany="false"
	 * @generated
	 */
	Range reason(EList<Domain> entities) throws InferenceException, NotSupportedException;

} // InferenceCapability
