/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.impl;

import java.net.URI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.dl.DLReasoner;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.LeastGenericConcept;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Least Generic Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LeastGenericConceptImpl extends InferenceCapabilityImpl<URI, Boolean> implements LeastGenericConcept {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeastGenericConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DlPackage.Literals.LEAST_GENERIC_CONCEPT;
	}
	
	@Override
	public Boolean reason(EList<URI> entities) throws InferenceException,
			NotSupportedException {
		
		if(entities.size() != 2) {
			throw new InferenceException("Invalid number of paramters for inference capability.");
		}
		
		try {
			return ((DLReasoner) engine).leastGeneric(entities.get(0), entities.get(1));
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Inference capability not supported.", e);
		}
	}

} //LeastGenericConceptImpl
