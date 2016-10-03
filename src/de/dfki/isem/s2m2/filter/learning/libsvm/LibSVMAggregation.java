/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm;

import java.io.IOException;

import org.apache.log4j.Logger;

import de.dfki.isem.s2m2.filter.learning.AggregationLearner;
import de.dfki.isem.svm.SVM;
import de.dfki.s2m2.filter.NumericalExpression;
import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lib SVM Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getLogger <em>Logger</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getCoarseGridStepSize <em>Coarse Grid Step Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFineGridStepSize <em>Fine Grid Step Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFolds <em>Folds</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSeed <em>Seed</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSvm <em>Svm</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#isTrained <em>Trained</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation()
 * @model superTypes="de.dfki.isem.s2m2.filter.learning.AggregationLearner<de.dfki.s2m2.filter.Service> de.dfki.s2m2.filter.NumericalExpression<de.dfki.s2m2.filter.Service>"
 * @generated
 */
public interface LibSVMAggregation extends AggregationLearner<ServiceView>, NumericalExpression<ServiceView> {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_Logger()
	 * @model dataType="de.dfki.isem.s2m2.filter.Logger" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>Coarse Grid Step Size</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coarse Grid Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coarse Grid Step Size</em>' attribute.
	 * @see #setCoarseGridStepSize(double)
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_CoarseGridStepSize()
	 * @model default="2.0" required="true"
	 * @generated
	 */
	double getCoarseGridStepSize();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getCoarseGridStepSize <em>Coarse Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coarse Grid Step Size</em>' attribute.
	 * @see #getCoarseGridStepSize()
	 * @generated
	 */
	void setCoarseGridStepSize(double value);

	/**
	 * Returns the value of the '<em><b>Fine Grid Step Size</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fine Grid Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fine Grid Step Size</em>' attribute.
	 * @see #setFineGridStepSize(double)
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_FineGridStepSize()
	 * @model default="0.25" required="true"
	 * @generated
	 */
	double getFineGridStepSize();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFineGridStepSize <em>Fine Grid Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fine Grid Step Size</em>' attribute.
	 * @see #getFineGridStepSize()
	 * @generated
	 */
	void setFineGridStepSize(double value);

	/**
	 * Returns the value of the '<em><b>Folds</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folds</em>' attribute.
	 * @see #setFolds(int)
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_Folds()
	 * @model default="6" required="true"
	 * @generated
	 */
	int getFolds();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getFolds <em>Folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folds</em>' attribute.
	 * @see #getFolds()
	 * @generated
	 */
	void setFolds(int value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(long)
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_Seed()
	 * @model default="0"
	 * @generated
	 */
	long getSeed();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(long value);

	/**
	 * Returns the value of the '<em><b>Svm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svm</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_Svm()
	 * @model dataType="de.dfki.isem.s2m2.filter.learning.libsvm.SVM<de.dfki.s2m2.filter.Service>" required="true" transient="true" changeable="false"
	 * @generated
	 */
	SVM<ServiceView> getSvm();

	/**
	 * Returns the value of the '<em><b>Trained</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trained</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage#getLibSVMAggregation_Trained()
	 * @model default="false" required="true" transient="true" changeable="false"
	 * @generated
	 */
	boolean isTrained();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.isem.s2m2.filter.learning.libsvm.IOException" fileNameRequired="true"
	 * @generated
	 */
	void saveModel(String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.isem.s2m2.filter.learning.libsvm.IOException" fileNameRequired="true"
	 * @generated
	 */
	void loadModel(String fileName) throws IOException;

} // LibSVMAggregation
