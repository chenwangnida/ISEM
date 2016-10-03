/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving;

import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theorem Prover</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage#getTheoremProver()
 * @model interface="true" abstract="true" TBounds="de.dfki.s2m2.filter.SpecificationExpression"
 * @generated
 */
public interface TheoremProver<T extends SpecificationExpression> extends InferenceEngine<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.inference.InferenceException de.dfki.s2m2.filter.inference.NotSupportedException" antecedentRequired="true" consequentRequired="true"
	 * @generated
	 */
	boolean implies(T antecedent, T consequent) throws InferenceException, NotSupportedException;

} // TheoremProver
