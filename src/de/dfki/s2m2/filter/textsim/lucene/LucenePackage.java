/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.s2m2.filter.textsim.TextsimPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneFactory
 * @model kind="package"
 * @generated
 */
public interface LucenePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lucene";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/textsim/lucene";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lucene";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LucenePackage eINSTANCE = de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl <em>Memory Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getLuceneMemoryIndex()
	 * @generated
	 */
	int LUCENE_MEMORY_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__NAME = TextsimPackage.INDEX__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__ID = TextsimPackage.INDEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__CONTENT = TextsimPackage.INDEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lucene Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__LUCENE_INDEX = TextsimPackage.INDEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lucene Reader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__LUCENE_READER = TextsimPackage.INDEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ram Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__RAM_DIRECTORY = TextsimPackage.INDEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Analyzer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__ANALYZER = TextsimPackage.INDEX_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id Term Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE = TextsimPackage.INDEX_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Content Term Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE = TextsimPackage.INDEX_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Memory Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUCENE_MEMORY_INDEX_FEATURE_COUNT = TextsimPackage.INDEX_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '<em>Index Writer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.lucene.index.IndexWriter
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getIndexWriter()
	 * @generated
	 */
	int INDEX_WRITER = 1;

	/**
	 * The meta object id for the '<em>Index Reader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.lucene.index.IndexReader
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getIndexReader()
	 * @generated
	 */
	int INDEX_READER = 2;

	/**
	 * The meta object id for the '<em>RAM Directory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.lucene.store.RAMDirectory
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getRAMDirectory()
	 * @generated
	 */
	int RAM_DIRECTORY = 3;

	/**
	 * The meta object id for the '<em>Analyzer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.lucene.analysis.Analyzer
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getAnalyzer()
	 * @generated
	 */
	int ANALYZER = 4;

	/**
	 * The meta object id for the '<em>Term</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.lucene.index.Term
	 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 5;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex <em>Memory Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Index</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex
	 * @generated
	 */
	EClass getLuceneMemoryIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getID()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_ID();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getCONTENT <em>CONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CONTENT</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getCONTENT()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_CONTENT();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneIndex <em>Lucene Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lucene Index</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneIndex()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_LuceneIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneReader <em>Lucene Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lucene Reader</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getLuceneReader()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_LuceneReader();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getRamDirectory <em>Ram Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Directory</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getRamDirectory()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_RamDirectory();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getAnalyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analyzer</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getAnalyzer()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_Analyzer();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getIdTermTemplate <em>Id Term Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Term Template</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getIdTermTemplate()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_IdTermTemplate();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getContentTermTemplate <em>Content Term Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Term Template</em>'.
	 * @see de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex#getContentTermTemplate()
	 * @see #getLuceneMemoryIndex()
	 * @generated
	 */
	EAttribute getLuceneMemoryIndex_ContentTermTemplate();

	/**
	 * Returns the meta object for data type '{@link org.apache.lucene.index.IndexWriter <em>Index Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Index Writer</em>'.
	 * @see org.apache.lucene.index.IndexWriter
	 * @model instanceClass="org.apache.lucene.index.IndexWriter"
	 * @generated
	 */
	EDataType getIndexWriter();

	/**
	 * Returns the meta object for data type '{@link org.apache.lucene.index.IndexReader <em>Index Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Index Reader</em>'.
	 * @see org.apache.lucene.index.IndexReader
	 * @model instanceClass="org.apache.lucene.index.IndexReader"
	 * @generated
	 */
	EDataType getIndexReader();

	/**
	 * Returns the meta object for data type '{@link org.apache.lucene.store.RAMDirectory <em>RAM Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RAM Directory</em>'.
	 * @see org.apache.lucene.store.RAMDirectory
	 * @model instanceClass="org.apache.lucene.store.RAMDirectory"
	 * @generated
	 */
	EDataType getRAMDirectory();

	/**
	 * Returns the meta object for data type '{@link org.apache.lucene.analysis.Analyzer <em>Analyzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Analyzer</em>'.
	 * @see org.apache.lucene.analysis.Analyzer
	 * @model instanceClass="org.apache.lucene.analysis.Analyzer"
	 * @generated
	 */
	EDataType getAnalyzer();

	/**
	 * Returns the meta object for data type '{@link org.apache.lucene.index.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Term</em>'.
	 * @see org.apache.lucene.index.Term
	 * @model instanceClass="org.apache.lucene.index.Term"
	 * @generated
	 */
	EDataType getTerm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LuceneFactory getLuceneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl <em>Memory Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getLuceneMemoryIndex()
		 * @generated
		 */
		EClass LUCENE_MEMORY_INDEX = eINSTANCE.getLuceneMemoryIndex();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__ID = eINSTANCE.getLuceneMemoryIndex_ID();

		/**
		 * The meta object literal for the '<em><b>CONTENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__CONTENT = eINSTANCE.getLuceneMemoryIndex_CONTENT();

		/**
		 * The meta object literal for the '<em><b>Lucene Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__LUCENE_INDEX = eINSTANCE.getLuceneMemoryIndex_LuceneIndex();

		/**
		 * The meta object literal for the '<em><b>Lucene Reader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__LUCENE_READER = eINSTANCE.getLuceneMemoryIndex_LuceneReader();

		/**
		 * The meta object literal for the '<em><b>Ram Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__RAM_DIRECTORY = eINSTANCE.getLuceneMemoryIndex_RamDirectory();

		/**
		 * The meta object literal for the '<em><b>Analyzer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__ANALYZER = eINSTANCE.getLuceneMemoryIndex_Analyzer();

		/**
		 * The meta object literal for the '<em><b>Id Term Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE = eINSTANCE.getLuceneMemoryIndex_IdTermTemplate();

		/**
		 * The meta object literal for the '<em><b>Content Term Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE = eINSTANCE.getLuceneMemoryIndex_ContentTermTemplate();

		/**
		 * The meta object literal for the '<em>Index Writer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.lucene.index.IndexWriter
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getIndexWriter()
		 * @generated
		 */
		EDataType INDEX_WRITER = eINSTANCE.getIndexWriter();

		/**
		 * The meta object literal for the '<em>Index Reader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.lucene.index.IndexReader
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getIndexReader()
		 * @generated
		 */
		EDataType INDEX_READER = eINSTANCE.getIndexReader();

		/**
		 * The meta object literal for the '<em>RAM Directory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.lucene.store.RAMDirectory
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getRAMDirectory()
		 * @generated
		 */
		EDataType RAM_DIRECTORY = eINSTANCE.getRAMDirectory();

		/**
		 * The meta object literal for the '<em>Analyzer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.lucene.analysis.Analyzer
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getAnalyzer()
		 * @generated
		 */
		EDataType ANALYZER = eINSTANCE.getAnalyzer();

		/**
		 * The meta object literal for the '<em>Term</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.lucene.index.Term
		 * @see de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl#getTerm()
		 * @generated
		 */
		EDataType TERM = eINSTANCE.getTerm();

	}

} //LucenePackage
