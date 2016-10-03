/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.Sample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl#isRelevant <em>Relevant</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.learning.impl.SampleImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SampleImpl<Domain> extends EObjectImpl implements Sample<Domain> {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Domain request;

	/**
	 * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidate()
	 * @generated
	 * @ordered
	 */
	protected Domain candidate;

	/**
	 * The default value of the '{@link #isRelevant() <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelevant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEVANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelevant() <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelevant()
	 * @generated
	 * @ordered
	 */
	protected boolean relevant = RELEVANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LearningPackage.Literals.SAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Domain newRequest) {
		Domain oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LearningPackage.SAMPLE__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getCandidate() {
		return candidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidate(Domain newCandidate) {
		Domain oldCandidate = candidate;
		candidate = newCandidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LearningPackage.SAMPLE__CANDIDATE, oldCandidate, candidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelevant() {
		return relevant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelevant(boolean newRelevant) {
		boolean oldRelevant = relevant;
		relevant = newRelevant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LearningPackage.SAMPLE__RELEVANT, oldRelevant, relevant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getFeature() {
		if (feature == null) {
			feature = new EDataTypeEList<Double>(Double.class, this, LearningPackage.SAMPLE__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LearningPackage.SAMPLE__REQUEST:
				return getRequest();
			case LearningPackage.SAMPLE__CANDIDATE:
				return getCandidate();
			case LearningPackage.SAMPLE__RELEVANT:
				return isRelevant();
			case LearningPackage.SAMPLE__FEATURE:
				return getFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LearningPackage.SAMPLE__REQUEST:
				setRequest((Domain)newValue);
				return;
			case LearningPackage.SAMPLE__CANDIDATE:
				setCandidate((Domain)newValue);
				return;
			case LearningPackage.SAMPLE__RELEVANT:
				setRelevant((Boolean)newValue);
				return;
			case LearningPackage.SAMPLE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Double>)newValue);
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
			case LearningPackage.SAMPLE__REQUEST:
				setRequest((Domain)null);
				return;
			case LearningPackage.SAMPLE__CANDIDATE:
				setCandidate((Domain)null);
				return;
			case LearningPackage.SAMPLE__RELEVANT:
				setRelevant(RELEVANT_EDEFAULT);
				return;
			case LearningPackage.SAMPLE__FEATURE:
				getFeature().clear();
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
			case LearningPackage.SAMPLE__REQUEST:
				return request != null;
			case LearningPackage.SAMPLE__CANDIDATE:
				return candidate != null;
			case LearningPackage.SAMPLE__RELEVANT:
				return relevant != RELEVANT_EDEFAULT;
			case LearningPackage.SAMPLE__FEATURE:
				return feature != null && !feature.isEmpty();
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
		result.append(" (request: ");
		result.append(request);
		result.append(", candidate: ");
		result.append(candidate);
		result.append(", relevant: ");
		result.append(relevant);
		result.append(", feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //SampleImpl
