/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim;

import de.dfki.s2m2.filter.TextSimilarityMeasure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Based Text Similarity Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.textsim.TextsimPackage#getIndexBasedTextSimilarityMeasure()
 * @model abstract="true"
 * @generated
 */
public interface IndexBasedTextSimilarityMeasure extends TextSimilarityMeasure {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference.
	 * @see #setIndex(Index)
	 * @see de.dfki.s2m2.filter.textsim.TextsimPackage#getIndexBasedTextSimilarityMeasure_Index()
	 * @model required="true"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure#getIndex <em>Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

} // IndexBasedTextSimilarityMeasure
