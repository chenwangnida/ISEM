/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene.impl;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.RAMDirectory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.textsim.TextsimPackage;
import de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl;
import de.dfki.s2m2.filter.textsim.lucene.LuceneFactory;
import de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LucenePackageImpl extends EPackageImpl implements LucenePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luceneMemoryIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexWriterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexReaderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ramDirectoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType analyzerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType termEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.s2m2.filter.textsim.lucene.LucenePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LucenePackageImpl() {
		super(eNS_URI, LuceneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LucenePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LucenePackage init() {
		if (isInited) return (LucenePackage)EPackage.Registry.INSTANCE.getEPackage(LucenePackage.eNS_URI);

		// Obtain or create and register package
		LucenePackageImpl theLucenePackage = (LucenePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LucenePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LucenePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TextsimPackageImpl theTextsimPackage = (TextsimPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextsimPackage.eNS_URI) instanceof TextsimPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextsimPackage.eNS_URI) : TextsimPackage.eINSTANCE);

		// Create package meta-data objects
		theLucenePackage.createPackageContents();
		theTextsimPackage.createPackageContents();

		// Initialize created meta-data
		theLucenePackage.initializePackageContents();
		theTextsimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLucenePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LucenePackage.eNS_URI, theLucenePackage);
		return theLucenePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuceneMemoryIndex() {
		return luceneMemoryIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_ID() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_CONTENT() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_LuceneIndex() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_LuceneReader() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_RamDirectory() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_Analyzer() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_IdTermTemplate() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuceneMemoryIndex_ContentTermTemplate() {
		return (EAttribute)luceneMemoryIndexEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexWriter() {
		return indexWriterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexReader() {
		return indexReaderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRAMDirectory() {
		return ramDirectoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnalyzer() {
		return analyzerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTerm() {
		return termEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuceneFactory getLuceneFactory() {
		return (LuceneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		luceneMemoryIndexEClass = createEClass(LUCENE_MEMORY_INDEX);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__ID);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__CONTENT);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__LUCENE_INDEX);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__LUCENE_READER);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__RAM_DIRECTORY);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__ANALYZER);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE);
		createEAttribute(luceneMemoryIndexEClass, LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE);

		// Create data types
		indexWriterEDataType = createEDataType(INDEX_WRITER);
		indexReaderEDataType = createEDataType(INDEX_READER);
		ramDirectoryEDataType = createEDataType(RAM_DIRECTORY);
		analyzerEDataType = createEDataType(ANALYZER);
		termEDataType = createEDataType(TERM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TextsimPackage theTextsimPackage = (TextsimPackage)EPackage.Registry.INSTANCE.getEPackage(TextsimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		luceneMemoryIndexEClass.getESuperTypes().add(theTextsimPackage.getIndex());

		// Initialize classes and features; add operations and parameters
		initEClass(luceneMemoryIndexEClass, LuceneMemoryIndex.class, "LuceneMemoryIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLuceneMemoryIndex_ID(), ecorePackage.getEString(), "ID", "id", 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_CONTENT(), ecorePackage.getEString(), "CONTENT", "content", 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_LuceneIndex(), this.getIndexWriter(), "luceneIndex", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_LuceneReader(), this.getIndexReader(), "luceneReader", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_RamDirectory(), this.getRAMDirectory(), "ramDirectory", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_Analyzer(), this.getAnalyzer(), "analyzer", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_IdTermTemplate(), this.getTerm(), "idTermTemplate", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuceneMemoryIndex_ContentTermTemplate(), this.getTerm(), "contentTermTemplate", null, 1, 1, LuceneMemoryIndex.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(indexWriterEDataType, IndexWriter.class, "IndexWriter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(indexReaderEDataType, IndexReader.class, "IndexReader", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ramDirectoryEDataType, RAMDirectory.class, "RAMDirectory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(analyzerEDataType, Analyzer.class, "Analyzer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(termEDataType, Term.class, "Term", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //LucenePackageImpl
