/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference;

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
 * @see de.dfki.s2m2.filter.inference.InferenceFactory
 * @model kind="package"
 * @generated
 */
public interface InferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2/inference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InferencePackage eINSTANCE = de.dfki.s2m2.filter.inference.impl.InferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.InferenceEngine <em>Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.InferenceEngine
	 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceEngine()
	 * @generated
	 */
	int INFERENCE_ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_ENGINE__NAME = FilterPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_ENGINE__PREPROCESSING = FilterPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_ENGINE_FEATURE_COUNT = FilterPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl
	 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceCapability()
	 * @generated
	 */
	int INFERENCE_CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_CAPABILITY__NAME = FilterPackage.EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_CAPABILITY__ENGINE = FilterPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFERENCE_CAPABILITY_FEATURE_COUNT = FilterPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.InferenceException
	 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceException()
	 * @generated
	 */
	int INFERENCE_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Not Supported Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.inference.NotSupportedException
	 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getNotSupportedException()
	 * @generated
	 */
	int NOT_SUPPORTED_EXCEPTION = 3;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.InferenceEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceEngine
	 * @generated
	 */
	EClass getInferenceEngine();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.InferenceEngine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceEngine#getName()
	 * @see #getInferenceEngine()
	 * @generated
	 */
	EAttribute getInferenceEngine_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.inference.InferenceEngine#isPreprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preprocessing</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceEngine#isPreprocessing()
	 * @see #getInferenceEngine()
	 * @generated
	 */
	EAttribute getInferenceEngine_Preprocessing();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.inference.InferenceCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceCapability
	 * @generated
	 */
	EClass getInferenceCapability();

	/**
	 * Returns the meta object for the reference '{@link de.dfki.s2m2.filter.inference.InferenceCapability#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Engine</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceCapability#getEngine()
	 * @see #getInferenceCapability()
	 * @generated
	 */
	EReference getInferenceCapability_Engine();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.filter.inference.InferenceException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see de.dfki.s2m2.filter.inference.InferenceException
	 * @model instanceClass="de.dfki.s2m2.filter.inference.InferenceException"
	 * @generated
	 */
	EDataType getInferenceException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.filter.inference.NotSupportedException <em>Not Supported Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Not Supported Exception</em>'.
	 * @see de.dfki.s2m2.filter.inference.NotSupportedException
	 * @model instanceClass="de.dfki.s2m2.filter.inference.NotSupportedException"
	 * @generated
	 */
	EDataType getNotSupportedException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InferenceFactory getInferenceFactory();

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
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.InferenceEngine <em>Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.InferenceEngine
		 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceEngine()
		 * @generated
		 */
		EClass INFERENCE_ENGINE = eINSTANCE.getInferenceEngine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERENCE_ENGINE__NAME = eINSTANCE.getInferenceEngine_Name();

		/**
		 * The meta object literal for the '<em><b>Preprocessing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFERENCE_ENGINE__PREPROCESSING = eINSTANCE.getInferenceEngine_Preprocessing();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl
		 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceCapability()
		 * @generated
		 */
		EClass INFERENCE_CAPABILITY = eINSTANCE.getInferenceCapability();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFERENCE_CAPABILITY__ENGINE = eINSTANCE.getInferenceCapability_Engine();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.InferenceException
		 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getInferenceException()
		 * @generated
		 */
		EDataType INFERENCE_EXCEPTION = eINSTANCE.getInferenceException();

		/**
		 * The meta object literal for the '<em>Not Supported Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.inference.NotSupportedException
		 * @see de.dfki.s2m2.filter.inference.impl.InferencePackageImpl#getNotSupportedException()
		 * @generated
		 */
		EDataType NOT_SUPPORTED_EXCEPTION = eINSTANCE.getNotSupportedException();

	}

} //InferencePackage
