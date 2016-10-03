/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import java.net.URI;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.semanticweb.owl.model.OWLDescription;

import de.dfki.isem.s2m2.filter.ApproximatedSubsumption;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approximated Subsumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ApproximatedSubsumptionImpl extends InferenceCapabilityImpl<URI, Double> implements ApproximatedSubsumption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApproximatedSubsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.APPROXIMATED_SUBSUMPTION;
	}
	
	@Override
	public Double reason(EList<URI> entities) throws InferenceException,
			NotSupportedException {
		if(entities.size() != 2) {
			throw new InferenceException("Number of parameters not supported.");
		}
		
		try {
			iSeMReasoner isem = (iSeMReasoner) engine;
			URI conceptC = entities.get(0);
			URI conceptD = entities.get(1);	
			
			// concept contraction
			OWLDescription conceptK = isem.contract(conceptC, conceptD);
			if(conceptK == null)
				return 0.0;
			// concept abduction
			OWLDescription conceptCPrime = isem.abduce(conceptK, conceptD);
			if(conceptCPrime == null)
				return 0.0;
			
			// valuation v based on information content
			double icC = -Math.log(isem.probability(conceptC));
			// TODO does this happen? Why? What to do?
			if(Double.isInfinite(icC))
				icC = 0.0;
			double icD = -Math.log(isem.probability(conceptD));
			if(Double.isInfinite(icD))
				icD = 0.0;
			double probCPrime = isem.probability(conceptCPrime);
			double icCPrime;
			if(probCPrime > 0)
				icCPrime = -Math.log(probCPrime);
			else
				// use lower-bound approximation for IC(C')
				icCPrime = -Math.log(isem.getProbabilityLowerBound());
			
			// siminf(C',D)
			Set <URI> dcsCPrimeD = isem.directCommonSubsumers(conceptD, conceptCPrime);
			double icMaxdcs = -1.0;
			for(URI dcs : dcsCPrimeD) {
				double ic = -Math.log(isem.probability(dcs));
				if(ic > icMaxdcs)
					icMaxdcs = ic;
			}
			double simInfCPrimeD = 2*icMaxdcs/(icCPrime + icD);
			
			// siminf(C',C)
			Set <URI> dcsCPrimeC = isem.directCommonSubsumers(conceptC, conceptCPrime);
			icMaxdcs = -1.0;
			for(URI dcs : dcsCPrimeC) {
				double ic = -Math.log(isem.probability(dcs));
				if(ic > icMaxdcs)
					icMaxdcs = ic;
			}
			double simInfCPrimeC = 2*icMaxdcs/(icCPrime + icC);
			
			return simInfCPrimeD - (1.0 - simInfCPrimeC);
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Approximated concept subsumption inference capability not supported by inference engine.", e);
		}
	}

} //ApproximatedSubsumptionImpl
