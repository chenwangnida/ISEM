/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.impl;

import java.util.Vector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.textsim.Cosine;
import de.dfki.s2m2.filter.textsim.Index;
import de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure;
import de.dfki.s2m2.filter.textsim.IndexException;
import de.dfki.s2m2.filter.textsim.LossOfInformation;
import de.dfki.s2m2.filter.textsim.TextsimFactory;
import de.dfki.s2m2.filter.textsim.TextsimPackage;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;
import de.dfki.s2m2.filter.textsim.lucene.impl.LucenePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextsimPackageImpl extends EPackageImpl implements TextsimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lossOfInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cosineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexBasedTextSimilarityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vectorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indexExceptionEDataType = null;

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
	 * @see de.dfki.s2m2.filter.textsim.TextsimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextsimPackageImpl() {
		super(eNS_URI, TextsimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TextsimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TextsimPackage init() {
		if (isInited) return (TextsimPackage)EPackage.Registry.INSTANCE.getEPackage(TextsimPackage.eNS_URI);

		// Obtain or create and register package
		TextsimPackageImpl theTextsimPackage = (TextsimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextsimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextsimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FilterPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LucenePackageImpl theLucenePackage = (LucenePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LucenePackage.eNS_URI) instanceof LucenePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LucenePackage.eNS_URI) : LucenePackage.eINSTANCE);

		// Create package meta-data objects
		theTextsimPackage.createPackageContents();
		theLucenePackage.createPackageContents();

		// Initialize created meta-data
		theTextsimPackage.initializePackageContents();
		theLucenePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextsimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextsimPackage.eNS_URI, theTextsimPackage);
		return theTextsimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLossOfInformation() {
		return lossOfInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCosine() {
		return cosineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexBasedTextSimilarityMeasure() {
		return indexBasedTextSimilarityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexBasedTextSimilarityMeasure_Index() {
		return (EReference)indexBasedTextSimilarityMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex_Name() {
		return (EAttribute)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector() {
		return vectorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndexException() {
		return indexExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextsimFactory getTextsimFactory() {
		return (TextsimFactory)getEFactoryInstance();
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
		lossOfInformationEClass = createEClass(LOSS_OF_INFORMATION);

		cosineEClass = createEClass(COSINE);

		indexBasedTextSimilarityMeasureEClass = createEClass(INDEX_BASED_TEXT_SIMILARITY_MEASURE);
		createEReference(indexBasedTextSimilarityMeasureEClass, INDEX_BASED_TEXT_SIMILARITY_MEASURE__INDEX);

		indexEClass = createEClass(INDEX);
		createEAttribute(indexEClass, INDEX__NAME);

		// Create data types
		vectorEDataType = createEDataType(VECTOR);
		indexExceptionEDataType = createEDataType(INDEX_EXCEPTION);
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
		LucenePackage theLucenePackage = (LucenePackage)EPackage.Registry.INSTANCE.getEPackage(LucenePackage.eNS_URI);
		FilterPackage theFilterPackage = (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLucenePackage);

		// Create type parameters
		addETypeParameter(vectorEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		lossOfInformationEClass.getESuperTypes().add(theFilterPackage.getTextSimilarityMeasure());
		cosineEClass.getESuperTypes().add(this.getIndexBasedTextSimilarityMeasure());
		indexBasedTextSimilarityMeasureEClass.getESuperTypes().add(theFilterPackage.getTextSimilarityMeasure());
		indexEClass.getESuperTypes().add(theFilterPackage.getResource());

		// Initialize classes and features; add operations and parameters
		initEClass(lossOfInformationEClass, LossOfInformation.class, "LossOfInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cosineEClass, Cosine.class, "Cosine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexBasedTextSimilarityMeasureEClass, IndexBasedTextSimilarityMeasure.class, "IndexBasedTextSimilarityMeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexBasedTextSimilarityMeasure_Index(), this.getIndex(), null, "index", null, 1, 1, IndexBasedTextSimilarityMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndex_Name(), ecorePackage.getEString(), "name", null, 0, 1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(indexEClass, null, "addDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());

		op = addEOperation(indexEClass, ecorePackage.getEBoolean(), "removeDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());

		op = addEOperation(indexEClass, ecorePackage.getEBoolean(), "containsDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());

		op = addEOperation(indexEClass, ecorePackage.getEInt(), "getDocumentFrequency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "queryTerm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());

		op = addEOperation(indexEClass, ecorePackage.getEInt(), "getNumberOfDocuments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());

		op = addEOperation(indexEClass, null, "tokenize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIndexException());
		EGenericType g1 = createEGenericType(this.getVector());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(vectorEDataType, Vector.class, "Vector", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(indexExceptionEDataType, IndexException.class, "IndexException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TextsimPackageImpl
