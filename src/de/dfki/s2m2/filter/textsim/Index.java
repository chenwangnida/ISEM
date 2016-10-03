/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim;

import java.util.Vector;

import de.dfki.s2m2.filter.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.textsim.Index#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.textsim.TextsimPackage#getIndex()
 * @model abstract="true"
 * @generated
 */
public interface Index extends Resource {
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
	 * @see de.dfki.s2m2.filter.textsim.TextsimPackage#getIndex_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.textsim.Index#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.textsim.IndexException" idRequired="true" contentRequired="true"
	 * @generated
	 */
	void addDocument(String id, String content) throws IndexException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.textsim.IndexException" idRequired="true"
	 * @generated
	 */
	boolean removeDocument(String id) throws IndexException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.textsim.IndexException" idRequired="true"
	 * @generated
	 */
	boolean containsDocument(String id) throws IndexException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.textsim.IndexException"
	 * @generated
	 */
	int getDocumentFrequency(String queryTerm) throws IndexException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="de.dfki.s2m2.filter.textsim.IndexException"
	 * @generated
	 */
	int getNumberOfDocuments() throws IndexException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.s2m2.filter.textsim.Vector<org.eclipse.emf.ecore.EString>" exceptions="de.dfki.s2m2.filter.textsim.IndexException" textRequired="true"
	 * @generated
	 */
	Vector<String> tokenize(String text) throws IndexException;

} // Index
