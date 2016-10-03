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
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.Sample#getRequest <em>Request</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.Sample#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.Sample#isRelevant <em>Relevant</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.Sample#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getSample()
 * @model
 * @generated
 */
public interface Sample<Domain> extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(Object)
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getSample_Request()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Domain getRequest();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.Sample#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Domain value);

	/**
	 * Returns the value of the '<em><b>Candidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate</em>' attribute.
	 * @see #setCandidate(Object)
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getSample_Candidate()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Domain getCandidate();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.Sample#getCandidate <em>Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Candidate</em>' attribute.
	 * @see #getCandidate()
	 * @generated
	 */
	void setCandidate(Domain value);

	/**
	 * Returns the value of the '<em><b>Relevant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant</em>' attribute.
	 * @see #setRelevant(boolean)
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getSample_Relevant()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRelevant();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.learning.Sample#isRelevant <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant</em>' attribute.
	 * @see #isRelevant()
	 * @generated
	 */
	void setRelevant(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute list.
	 * @see de.dfki.isem.s2m2.filter.learning.LearningPackage#getSample_Feature()
	 * @model unique="false" required="true" transient="true"
	 * @generated
	 */
	EList<Double> getFeature();

} // Sample
