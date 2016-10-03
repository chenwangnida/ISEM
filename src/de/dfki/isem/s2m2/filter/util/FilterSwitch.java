/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.dfki.isem.s2m2.filter.ApproximatedSubsumption;
import de.dfki.isem.s2m2.filter.DirectCommonSubsumers;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.StructuralSimilarity;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.NumericalExpression;
import de.dfki.s2m2.filter.Resource;
import de.dfki.s2m2.filter.inference.InferenceCapability;
import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.dl.DLReasoner;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.isem.s2m2.filter.FilterPackage
 * @generated
 */
public class FilterSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterSwitch() {
		if (modelPackage == null) {
			modelPackage = FilterPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FilterPackage.ISE_MREASONER: {
				iSeMReasoner iSeMReasoner = (iSeMReasoner)theEObject;
				T result = caseiSeMReasoner(iSeMReasoner);
				if (result == null) result = casePelletReasoner(iSeMReasoner);
				if (result == null) result = caseDLReasoner(iSeMReasoner);
				if (result == null) result = caseInferenceEngine(iSeMReasoner);
				if (result == null) result = caseResource(iSeMReasoner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.APPROXIMATED_SUBSUMPTION: {
				ApproximatedSubsumption approximatedSubsumption = (ApproximatedSubsumption)theEObject;
				T result = caseApproximatedSubsumption(approximatedSubsumption);
				if (result == null) result = caseInferenceCapability(approximatedSubsumption);
				if (result == null) result = caseNumericalExpression(approximatedSubsumption);
				if (result == null) result = caseExpression(approximatedSubsumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.DIRECT_COMMON_SUBSUMERS: {
				DirectCommonSubsumers directCommonSubsumers = (DirectCommonSubsumers)theEObject;
				T result = caseDirectCommonSubsumers(directCommonSubsumers);
				if (result == null) result = caseInferenceCapability(directCommonSubsumers);
				if (result == null) result = caseExpression(directCommonSubsumers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.STRUCTURAL_SIMILARITY: {
				StructuralSimilarity structuralSimilarity = (StructuralSimilarity)theEObject;
				T result = caseStructuralSimilarity(structuralSimilarity);
				if (result == null) result = caseInferenceCapability(structuralSimilarity);
				if (result == null) result = caseNumericalExpression(structuralSimilarity);
				if (result == null) result = caseExpression(structuralSimilarity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>iSe MReasoner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>iSe MReasoner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseiSeMReasoner(iSeMReasoner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approximated Subsumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approximated Subsumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproximatedSubsumption(ApproximatedSubsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Common Subsumers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Common Subsumers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectCommonSubsumers(DirectCommonSubsumers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Similarity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Similarity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralSimilarity(StructuralSimilarity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T caseInferenceEngine(InferenceEngine<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DL Reasoner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DL Reasoner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLReasoner(DLReasoner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePelletReasoner(PelletReasoner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain, Range> T caseExpression(Expression<Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain, Range> T caseInferenceCapability(InferenceCapability<Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T caseNumericalExpression(NumericalExpression<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //FilterSwitch
