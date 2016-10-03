/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.s2m2.filter.BipartiteGraphMatching;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.bpg.BestAssignmentSolver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bipartite Graph Matching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl#getValuation <em>Valuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BipartiteGraphMatchingImpl<Domain> extends EObjectImpl implements BipartiteGraphMatching<Domain> {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getValuation() <em>Valuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuation()
	 * @generated
	 * @ordered
	 */
	protected Expression<Domain, Double> valuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BipartiteGraphMatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.BIPARTITE_GRAPH_MATCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.BIPARTITE_GRAPH_MATCHING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression<Domain, Double> getValuation() {
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuation(Expression<Domain, Double> newValuation, NotificationChain msgs) {
		Expression<Domain, Double> oldValuation = valuation;
		valuation = newValuation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION, oldValuation, newValuation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuation(Expression<Domain, Double> newValuation) {
		if (newValuation != valuation) {
			NotificationChain msgs = null;
			if (valuation != null)
				msgs = ((InternalEObject)valuation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION, null, msgs);
			if (newValuation != null)
				msgs = ((InternalEObject)newValuation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION, null, msgs);
			msgs = basicSetValuation(newValuation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION, newValuation, newValuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double evaluate(Collection<Domain> param1, Collection<Domain> param2) throws ExpressionEvaluationException {
		// empty set for entities1!!! (no assignment required -> DivisionByZero>
		if(param1.isEmpty())
			return 1.0;
		
		// no injective assignment possible
		if(param2.size() < param1.size())
			return 0.0;
		
		// compute input for the bipartite graph matcher (costs != values)
		double[][] valueMatrix = new double[param1.size()][param2.size()];
		double maxValue = 0.0;
		int i = 0, j = 0;
		for(Domain entity1 : param1) {
			j = 0;
			for(Domain entity2 : param2) {
				// evaluate pair and assign costs
				valueMatrix[i][j] = valuation.evaluate(entity1, entity2);
				// remember maximum value
				if(valueMatrix[i][j] > maxValue)
					maxValue = valueMatrix[i][j];
				j++;
			}
			i++;
		}
		// compute costs as (maxValue - value)
		double[][] costMatrix = new double[param1.size()][param2.size()];
		for(i = 0; i < param1.size(); i++) {
			for(j = 0; j < param2.size(); j++) {
				costMatrix[i][j] = maxValue - valueMatrix[i][j];
			}
		}
		
		// compute assignment and result value
		byte[][] solution = (new BestAssignmentSolver(costMatrix)).munkres();
		double addedValues = 0.0;
		for(i = 0; i < param1.size(); i++) {
			for(j = 0; j < param2.size(); j++) {
				if(solution[i][j] != 0) {
					addedValues += valueMatrix[i][j];
					break;
				}
			}
		}		
		// return average
		return addedValues/param1.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION:
				return basicSetValuation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__NAME:
				return getName();
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION:
				return getValuation();
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
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__NAME:
				setName((String)newValue);
				return;
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION:
				setValuation((Expression<Domain, Double>)newValue);
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
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION:
				setValuation((Expression<Domain, Double>)null);
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
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FilterPackage.BIPARTITE_GRAPH_MATCHING__VALUATION:
				return valuation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BipartiteGraphMatchingImpl
