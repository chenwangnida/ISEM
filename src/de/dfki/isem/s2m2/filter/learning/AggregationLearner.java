/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning;

import org.eclipse.emf.common.util.EList;

import de.dfki.s2m2.filter.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Learner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner#getOnline <em>Online</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.AggregationLearner#getFeatureSpace <em>Feature Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getAggregationLearner()
 * @model interface="true" abstract="true" superTypes="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EDoubleObject>"
 * @generated
 */
public interface AggregationLearner<Domain> extends Expression<Domain, Double> {
	/**
	 * Returns the value of the '<em><b>Online</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Online</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getAggregationLearner_Online()
	 * @model default="false" required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Boolean getOnline();

	/**
	 * Returns the value of the '<em><b>Feature Space</b></em>' containment reference list.
	 * The list contents are of type {@link de.dfki.s2m2.filter.Expression}&lt;Domain, java.lang.Double>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Space</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Space</em>' containment reference list.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getAggregationLearner_FeatureSpace()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EDoubleObject>" containment="true" required="true"
	 * @generated
	 */
	EList<Expression<Domain, Double>> getFeatureSpace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.isem.s2m2.filter.learning.TrainingException" trainingSetRequired="true"
	 * @generated
	 */
	void train(TrainingSet<Domain> trainingSet) throws TrainingException;

} // AggregationLearner
