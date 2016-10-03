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
import de.dfki.s2m2.filter.inference.dl.Equivalence;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equivalence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EquivalenceImpl extends InferenceCapabilityImpl<URI, Boolean> implements Equivalence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DlPackage.Literals.EQUIVALENCE;
	}
	
	@Override
	public Boolean reason(EList<URI> entities) throws InferenceException,
			NotSupportedException {
		
		try {
			return ((DLReasoner) engine).equivalent(entities);
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Inference capability not supported.", e);
		}
	}

} //EquivalenceImpl
