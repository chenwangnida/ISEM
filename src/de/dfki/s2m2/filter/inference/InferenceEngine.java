/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference;

import de.dfki.s2m2.filter.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.InferenceEngine#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.InferenceEngine#isPreprocessing <em>Preprocessing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.inference.InferencePackage#getInferenceEngine()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InferenceEngine<Domain> extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dfki.s2m2.filter.inference.InferencePackage#getInferenceEngine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.inference.InferenceEngine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Preprocessing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing</em>' attribute.
	 * @see #setPreprocessing(boolean)
	 * @see de.dfki.s2m2.filter.inference.InferencePackage#getInferenceEngine_Preprocessing()
	 * @model default="false"
	 * @generated
	 */
	boolean isPreprocessing();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.inference.InferenceEngine#isPreprocessing <em>Preprocessing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessing</em>' attribute.
	 * @see #isPreprocessing()
	 * @generated
	 */
	void setPreprocessing(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void process(Domain entity);

} // InferenceEngine
