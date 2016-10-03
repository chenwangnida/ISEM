/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bipartite Graph Matching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.BipartiteGraphMatching#getValuation <em>Valuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getBipartiteGraphMatching()
 * @model superTypes="de.dfki.s2m2.filter.NumericalExpression<de.dfki.s2m2.filter.Collection<Domain>>"
 * @generated
 */
public interface BipartiteGraphMatching<Domain> extends NumericalExpression<Collection<Domain>> {
	/**
	 * Returns the value of the '<em><b>Valuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuation</em>' containment reference.
	 * @see #setValuation(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getBipartiteGraphMatching_Valuation()
	 * @model type="de.dfki.s2m2.filter.Expression<Domain, org.eclipse.emf.ecore.EDoubleObject>" containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Double> getValuation();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.BipartiteGraphMatching#getValuation <em>Valuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuation</em>' containment reference.
	 * @see #getValuation()
	 * @generated
	 */
	void setValuation(Expression<Domain, Double> value);

} // BipartiteGraphMatching
