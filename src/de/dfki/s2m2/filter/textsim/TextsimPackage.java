/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.dfki.s2m2.filter.FilterPackage;

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
 * @see de.dfki.s2m2.filter.textsim.TextsimFactory
 * @model kind="package"
 * @generated
 */
public interface TextsimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textsim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/textsim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textsim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextsimPackage eINSTANCE = de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.textsim.impl.LossOfInformationImpl <em>Loss Of Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.impl.LossOfInformationImpl
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getLossOfInformation()
	 * @generated
	 */
	int LOSS_OF_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_INFORMATION__NAME = FilterPackage.TEXT_SIMILARITY_MEASURE__NAME;

	/**
	 * The number of structural features of the '<em>Loss Of Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OF_INFORMATION_FEATURE_COUNT = FilterPackage.TEXT_SIMILARITY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.textsim.impl.IndexBasedTextSimilarityMeasureImpl <em>Index Based Text Similarity Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.impl.IndexBasedTextSimilarityMeasureImpl
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndexBasedTextSimilarityMeasure()
	 * @generated
	 */
	int INDEX_BASED_TEXT_SIMILARITY_MEASURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_TEXT_SIMILARITY_MEASURE__NAME = FilterPackage.TEXT_SIMILARITY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_TEXT_SIMILARITY_MEASURE__INDEX = FilterPackage.TEXT_SIMILARITY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Based Text Similarity Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_BASED_TEXT_SIMILARITY_MEASURE_FEATURE_COUNT = FilterPackage.TEXT_SIMILARITY_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.textsim.impl.CosineImpl <em>Cosine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.impl.CosineImpl
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getCosine()
	 * @generated
	 */
	int COSINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINE__NAME = INDEX_BASED_TEXT_SIMILARITY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINE__INDEX = INDEX_BASED_TEXT_SIMILARITY_MEASURE__INDEX;

	/**
	 * The number of structural features of the '<em>Cosine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSINE_FEATURE_COUNT = INDEX_BASED_TEXT_SIMILARITY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.textsim.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.impl.IndexImpl
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = FilterPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = FilterPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Vector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Vector
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 4;

	/**
	 * The meta object id for the '<em>Index Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.textsim.IndexException
	 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndexException()
	 * @generated
	 */
	int INDEX_EXCEPTION = 5;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.textsim.LossOfInformation <em>Loss Of Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Of Information</em>'.
	 * @see de.dfki.s2m2.filter.textsim.LossOfInformation
	 * @generated
	 */
	EClass getLossOfInformation();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.textsim.Cosine <em>Cosine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cosine</em>'.
	 * @see de.dfki.s2m2.filter.textsim.Cosine
	 * @generated
	 */
	EClass getCosine();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure <em>Index Based Text Similarity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Based Text Similarity Measure</em>'.
	 * @see de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure
	 * @generated
	 */
	EClass getIndexBasedTextSimilarityMeasure();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index</em>'.
	 * @see de.dfki.s2m2.filter.textsim.IndexBasedTextSimilarityMeasure#getIndex()
	 * @see #getIndexBasedTextSimilarityMeasure()
	 * @generated
	 */
	EReference getIndexBasedTextSimilarityMeasure_Index();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.textsim.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see de.dfki.s2m2.filter.textsim.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.textsim.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.s2m2.filter.textsim.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for data type '{@link java.util.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector</em>'.
	 * @see java.util.Vector
	 * @model instanceClass="java.util.Vector" typeParameters="T"
	 * @generated
	 */
	EDataType getVector();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.filter.textsim.IndexException <em>Index Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Index Exception</em>'.
	 * @see de.dfki.s2m2.filter.textsim.IndexException
	 * @model instanceClass="de.dfki.s2m2.filter.textsim.IndexException"
	 * @generated
	 */
	EDataType getIndexException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextsimFactory getTextsimFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.textsim.impl.LossOfInformationImpl <em>Loss Of Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.impl.LossOfInformationImpl
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getLossOfInformation()
		 * @generated
		 */
		EClass LOSS_OF_INFORMATION = eINSTANCE.getLossOfInformation();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.textsim.impl.CosineImpl <em>Cosine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.impl.CosineImpl
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getCosine()
		 * @generated
		 */
		EClass COSINE = eINSTANCE.getCosine();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.textsim.impl.IndexBasedTextSimilarityMeasureImpl <em>Index Based Text Similarity Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.impl.IndexBasedTextSimilarityMeasureImpl
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndexBasedTextSimilarityMeasure()
		 * @generated
		 */
		EClass INDEX_BASED_TEXT_SIMILARITY_MEASURE = eINSTANCE.getIndexBasedTextSimilarityMeasure();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_BASED_TEXT_SIMILARITY_MEASURE__INDEX = eINSTANCE.getIndexBasedTextSimilarityMeasure_Index();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.textsim.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.impl.IndexImpl
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__NAME = eINSTANCE.getIndex_Name();

		/**
		 * The meta object literal for the '<em>Vector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Vector
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getVector()
		 * @generated
		 */
		EDataType VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em>Index Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.textsim.IndexException
		 * @see de.dfki.s2m2.filter.textsim.impl.TextsimPackageImpl#getIndexException()
		 * @generated
		 */
		EDataType INDEX_EXCEPTION = eINSTANCE.getIndexException();

	}

} //TextsimPackage
