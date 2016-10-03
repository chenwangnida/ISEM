/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import de.dfki.isem.s2m2.filter.learning.LearningPackage;

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
 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmFactory
 * @model kind="package"
 * @generated
 */
public interface LibsvmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "libsvm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/isem/2011/isem/learning/libsvm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "libsvm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibsvmPackage eINSTANCE = de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl <em>Lib SVM Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getLibSVMAggregation()
	 * @generated
	 */
	int LIB_SVM_AGGREGATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__NAME = LearningPackage.AGGREGATION_LEARNER__NAME;

	/**
	 * The feature id for the '<em><b>Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__ONLINE = LearningPackage.AGGREGATION_LEARNER__ONLINE;

	/**
	 * The feature id for the '<em><b>Feature Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__FEATURE_SPACE = LearningPackage.AGGREGATION_LEARNER__FEATURE_SPACE;

	/**
	 * The feature id for the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__LOGGER = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coarse Grid Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fine Grid Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Folds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__FOLDS = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__SEED = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Svm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__SVM = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION__TRAINED = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Lib SVM Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIB_SVM_AGGREGATION_FEATURE_COUNT = LearningPackage.AGGREGATION_LEARNER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>SVM</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.isem.svm.SVM
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getSVM()
	 * @generated
	 */
	int SVM = 2;


	/**
	 * Returns the meta object for class '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation <em>Lib SVM Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lib SVM Aggregation</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation
	 * @generated
	 */
	EClass getLibSVMAggregation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getLogger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logger</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getLogger()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_Logger();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getCoarseGridStepSize <em>Coarse Grid Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coarse Grid Step Size</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getCoarseGridStepSize()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_CoarseGridStepSize();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFineGridStepSize <em>Fine Grid Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine Grid Step Size</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFineGridStepSize()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_FineGridStepSize();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFolds <em>Folds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folds</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFolds()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_Folds();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSeed()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_Seed();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSvm <em>Svm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svm</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSvm()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_Svm();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#isTrained <em>Trained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trained</em>'.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#isTrained()
	 * @see #getLibSVMAggregation()
	 * @generated
	 */
	EAttribute getLibSVMAggregation_Trained();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link de.dfki.isem.svm.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SVM</em>'.
	 * @see de.dfki.isem.svm.SVM
	 * @model instanceClass="de.dfki.isem.svm.SVM" serializeable="false" typeParameters="Domain"
	 * @generated
	 */
	EDataType getSVM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibsvmFactory getLibsvmFactory();

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
		 * The meta object literal for the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl <em>Lib SVM Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibSVMAggregationImpl
		 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getLibSVMAggregation()
		 * @generated
		 */
		EClass LIB_SVM_AGGREGATION = eINSTANCE.getLibSVMAggregation();

		/**
		 * The meta object literal for the '<em><b>Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__LOGGER = eINSTANCE.getLibSVMAggregation_Logger();

		/**
		 * The meta object literal for the '<em><b>Coarse Grid Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE = eINSTANCE.getLibSVMAggregation_CoarseGridStepSize();

		/**
		 * The meta object literal for the '<em><b>Fine Grid Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE = eINSTANCE.getLibSVMAggregation_FineGridStepSize();

		/**
		 * The meta object literal for the '<em><b>Folds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__FOLDS = eINSTANCE.getLibSVMAggregation_Folds();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__SEED = eINSTANCE.getLibSVMAggregation_Seed();

		/**
		 * The meta object literal for the '<em><b>Svm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__SVM = eINSTANCE.getLibSVMAggregation_Svm();

		/**
		 * The meta object literal for the '<em><b>Trained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIB_SVM_AGGREGATION__TRAINED = eINSTANCE.getLibSVMAggregation_Trained();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>SVM</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.isem.svm.SVM
		 * @see de.dfki.isem.s2m2.filter.learning.libsvm.impl.LibsvmPackageImpl#getSVM()
		 * @generated
		 */
		EDataType SVM = eINSTANCE.getSVM();

	}

} //LibsvmPackage
