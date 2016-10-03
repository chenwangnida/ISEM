/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption;

import alice.tuprolog.Prolog;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremProver;
import de.dfki.s2m2.service.pddl.PDDLExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theta Subsumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologTheoryLocation <em>Prolog Theory Location</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologEngine <em>Prolog Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage#getThetaSubsumption()
 * @model superTypes="de.dfki.s2m2.filter.inference.theoremproving.TheoremProver<de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.PDDLExpression>"
 * @generated
 */
public interface ThetaSubsumption extends TheoremProver<PDDLExpression> {
	/**
	 * Returns the value of the '<em><b>Prolog Theory Location</b></em>' attribute.
	 * The default value is <code>"Prolog/plain_subsume.pl"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prolog Theory Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prolog Theory Location</em>' attribute.
	 * @see #setPrologTheoryLocation(String)
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage#getThetaSubsumption_PrologTheoryLocation()
	 * @model default="Prolog/plain_subsume.pl" required="true"
	 * @generated
	 */
	String getPrologTheoryLocation();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologTheoryLocation <em>Prolog Theory Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prolog Theory Location</em>' attribute.
	 * @see #getPrologTheoryLocation()
	 * @generated
	 */
	void setPrologTheoryLocation(String value);

	/**
	 * Returns the value of the '<em><b>Prolog Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prolog Engine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prolog Engine</em>' attribute.
	 * @see #isSetPrologEngine()
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage#getThetaSubsumption_PrologEngine()
	 * @model unsettable="true" dataType="de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.Prolog" required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	Prolog getPrologEngine();

	/**
	 * Returns whether the value of the '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption#getPrologEngine <em>Prolog Engine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prolog Engine</em>' attribute is set.
	 * @see #getPrologEngine()
	 * @generated
	 */
	boolean isSetPrologEngine();

} // ThetaSubsumption
