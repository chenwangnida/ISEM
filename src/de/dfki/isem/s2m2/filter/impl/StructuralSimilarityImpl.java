/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import java.net.URI;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.StructuralSimilarity;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Similarity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.StructuralSimilarityImpl#getBeta <em>Beta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralSimilarityImpl extends InferenceCapabilityImpl<URI, Double> implements StructuralSimilarity {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final double ALPHA_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected double alpha = ALPHA_EDEFAULT;
	/**
	 * The default value of the '{@link #getBeta() <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected static final double BETA_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getBeta() <em>Beta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeta()
	 * @generated
	 * @ordered
	 */
	protected double beta = BETA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralSimilarityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.STRUCTURAL_SIMILARITY;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(double newAlpha) {
		double oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.STRUCTURAL_SIMILARITY__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBeta() {
		return beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeta(double newBeta) {
		double oldBeta = beta;
		beta = newBeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.STRUCTURAL_SIMILARITY__BETA, oldBeta, beta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilterPackage.STRUCTURAL_SIMILARITY__ALPHA:
				return getAlpha();
			case FilterPackage.STRUCTURAL_SIMILARITY__BETA:
				return getBeta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilterPackage.STRUCTURAL_SIMILARITY__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FilterPackage.STRUCTURAL_SIMILARITY__BETA:
				setBeta((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FilterPackage.STRUCTURAL_SIMILARITY__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FilterPackage.STRUCTURAL_SIMILARITY__BETA:
				setBeta(BETA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilterPackage.STRUCTURAL_SIMILARITY__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case FilterPackage.STRUCTURAL_SIMILARITY__BETA:
				return beta != BETA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", beta: ");
		result.append(beta);
		result.append(')');
		return result.toString();
	}

	@Override
	public Double reason(EList<URI> entities) throws InferenceException,
			NotSupportedException {
		if(entities.size() != 2) {
			throw new InferenceException("Number of parameters not supported.");
		}
		
		try {
			iSeMReasoner isem = (iSeMReasoner) engine;
			
			Set<URI> dcs = isem.directCommonSubsumers(entities.get(0), entities.get(1));
			
			URI minDcs = null;
			int h = Integer.MAX_VALUE;
			for(URI oneDcs : dcs) {
				int depth = isem.depth(oneDcs);
				if(depth < h) {
					minDcs = oneDcs;
					h = depth;
				}
			}
			
			int l = isem.distanceToAncestor(entities.get(0), minDcs) + isem.distanceToAncestor(entities.get(1), minDcs);
			double betah = beta*h;
			double expbetah = Math.exp(betah);
			double expminusbetah = 1.0/expbetah;
			double result = Math.exp(-alpha*l)*((expbetah - expminusbetah)/(expbetah + expminusbetah));
			
			return result;
		}
		catch(InferenceException e) {
			throw new InferenceException("Unable to compute structural similarity.", e);
		}
		catch(ClassCastException e) {
			throw new NotSupportedException("Structural similarity inference capability not supported by inference engine.", e);
		}
	}

} //StructuralSimilarityImpl
