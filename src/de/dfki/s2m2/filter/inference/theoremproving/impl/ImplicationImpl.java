/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;
import de.dfki.s2m2.filter.inference.theoremproving.Implication;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremProver;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImplicationImpl<T extends SpecificationExpression> extends InferenceCapabilityImpl<T, Boolean> implements Implication<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoremprovingPackage.Literals.IMPLICATION;
	}
	
	@Override
	public Boolean reason(EList<T> entities) throws InferenceException,
			NotSupportedException {

		if(entities.size() != 2) {
			throw new InferenceException("Invalid number of parameters: " + entities.size() + ".");
		}
		
		try {
			return ((TheoremProver<T>) engine).implies(entities.get(0), entities.get(1));
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Inference capability not supported by inference engine " + engine.getName() + ".", e);
		}
	}

} //ImplicationImpl
