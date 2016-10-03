/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.RAMDirectory;

import de.dfki.s2m2.filter.textsim.Index;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getID <em>ID</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getCONTENT <em>CONTENT</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneIndex <em>Lucene Index</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneReader <em>Lucene Reader</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getRamDirectory <em>Ram Directory</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getIdTermTemplate <em>Id Term Template</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getContentTermTemplate <em>Content Term Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex()
 * @model
 * @generated
 */
public interface LuceneMemoryIndex extends Index {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"id"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_ID()
	 * @model default="id" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getID();

	/**
	 * Returns the value of the '<em><b>CONTENT</b></em>' attribute.
	 * The default value is <code>"content"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CONTENT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTENT</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_CONTENT()
	 * @model default="content" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getCONTENT();

	/**
	 * Returns the value of the '<em><b>Lucene Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lucene Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lucene Index</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_LuceneIndex()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.IndexWriter" required="true" transient="true" changeable="false"
	 * @generated
	 */
	IndexWriter getLuceneIndex();

	/**
	 * Returns the value of the '<em><b>Lucene Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lucene Reader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lucene Reader</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_LuceneReader()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.IndexReader" required="true" transient="true" changeable="false"
	 * @generated
	 */
	IndexReader getLuceneReader();

	/**
	 * Returns the value of the '<em><b>Ram Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Directory</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_RamDirectory()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.RAMDirectory" required="true" transient="true" changeable="false"
	 * @generated
	 */
	RAMDirectory getRamDirectory();

	/**
	 * Returns the value of the '<em><b>Analyzer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyzer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzer</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_Analyzer()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.Analyzer" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Analyzer getAnalyzer();

	/**
	 * Returns the value of the '<em><b>Id Term Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Term Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Term Template</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_IdTermTemplate()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.Term" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Term getIdTermTemplate();

	/**
	 * Returns the value of the '<em><b>Content Term Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Term Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Term Template</em>' attribute.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#getLuceneMemoryIndex_ContentTermTemplate()
	 * @model dataType="de.dfki.s2m2.filter.textsim.lucene.Term" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Term getContentTermTemplate();

} // LuceneMemoryIndex
