/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getNumOfDimensions <em>Num Of Dimensions</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getSize <em>Size</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.TrainingSet#getSample <em>Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getTrainingSet()
 * @model
 * @generated
 */
public interface TrainingSet<Domain> extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Of Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Dimensions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Dimensions</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getTrainingSet_NumOfDimensions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Integer getNumOfDimensions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getTrainingSet_Size()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Returns the value of the '<em><b>Sample</b></em>' reference list.
	 * The list contents are of type {@link de.dfki.isem.s2m2.filter.learning.Sample}&lt;Domain>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample</em>' reference list.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getTrainingSet_Sample()
	 * @model required="true"
	 * @generated
	 */
	EList<Sample<Domain>> getSample();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" many="false" nRequired="true"
	 * @generated
	 */
	EList<TrainingSet<Domain>> fold(int n, long seed);

} // TrainingSet
