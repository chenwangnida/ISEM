/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import java.net.URI;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.dfki.isem.s2m2.filter.DirectCommonSubsumers;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Common Subsumers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DirectCommonSubsumersImpl extends InferenceCapabilityImpl<URI, Collection<URI>> implements DirectCommonSubsumers {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectCommonSubsumersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.DIRECT_COMMON_SUBSUMERS;
	}
	
	@Override
	public Collection<URI> reason(EList<URI> entities)
			throws InferenceException, NotSupportedException {
		if(entities.size() != 2) {
			throw new InferenceException("Invalid number of parameters.");
		}
		
		try {
			iSeMReasoner isem = (iSeMReasoner) engine;
			return isem.directCommonSubsumers(entities.get(0), entities.get(1));
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Inference capability not supported by inference engine.", e);
		}
	}

} //DirectCommonSubsumersImpl
