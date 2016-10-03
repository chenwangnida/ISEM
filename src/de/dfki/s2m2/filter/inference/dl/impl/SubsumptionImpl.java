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
import de.dfki.s2m2.filter.inference.dl.Subsumption;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubsumptionImpl extends InferenceCapabilityImpl<URI, Boolean> implements Subsumption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DlPackage.Literals.SUBSUMPTION;
	}
	
	@Override
	public Boolean reason(EList<URI> entities) throws InferenceException,
			NotSupportedException {
		
		if(entities.size() != 2) {
			throw new InferenceException("Invalid number of paramters for inference capability.");
		}
		
		try {
			return ((DLReasoner) engine).subsumes(entities.get(0), entities.get(1));
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Inference capability not supported.", e);
		}
	}

} //SubsumptionImpl
