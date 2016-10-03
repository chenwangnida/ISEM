/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.isem.s2m2.filter.FilterPackage
 * @generated
 */
public class FilterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FilterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterSwitch<Adapter> modelSwitch =
		new FilterSwitch<Adapter>() {
			@Override
			public Adapter caseiSeMReasoner(iSeMReasoner object) {
				return createiSeMReasonerAdapter();
			}
			@Override
			public Adapter caseApproximatedSubsumption(ApproximatedSubsumption object) {
				return createApproximatedSubsumptionAdapter();
			}
			@Override
			public Adapter caseDirectCommonSubsumers(DirectCommonSubsumers object) {
				return createDirectCommonSubsumersAdapter();
			}
			@Override
			public Adapter caseStructuralSimilarity(StructuralSimilarity object) {
				return createStructuralSimilarityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public <Domain> Adapter caseInferenceEngine(InferenceEngine<Domain> object) {
				return createInferenceEngineAdapter();
			}
			@Override
			public Adapter caseDLReasoner(DLReasoner object) {
				return createDLReasonerAdapter();
			}
			@Override
			public Adapter casePelletReasoner(PelletReasoner object) {
				return createPelletReasonerAdapter();
			}
			@Override
			public <Domain, Range> Adapter caseExpression(Expression<Domain, Range> object) {
				return createExpressionAdapter();
			}
			@Override
			public <Domain, Range> Adapter caseInferenceCapability(InferenceCapability<Domain, Range> object) {
				return createInferenceCapabilityAdapter();
			}
			@Override
			public <Domain> Adapter caseNumericalExpression(NumericalExpression<Domain> object) {
				return createNumericalExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.isem.s2m2.filter.iSeMReasoner <em>iSe MReasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.isem.s2m2.filter.iSeMReasoner
	 * @generated
	 */
	public Adapter createiSeMReasonerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.isem.s2m2.filter.ApproximatedSubsumption <em>Approximated Subsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.isem.s2m2.filter.ApproximatedSubsumption
	 * @generated
	 */
	public Adapter createApproximatedSubsumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.isem.s2m2.filter.DirectCommonSubsumers <em>Direct Common Subsumers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.isem.s2m2.filter.DirectCommonSubsumers
	 * @generated
	 */
	public Adapter createDirectCommonSubsumersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.isem.s2m2.filter.StructuralSimilarity <em>Structural Similarity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.isem.s2m2.filter.StructuralSimilarity
	 * @generated
	 */
	public Adapter createStructuralSimilarityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.InferenceEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.InferenceEngine
	 * @generated
	 */
	public Adapter createInferenceEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.dl.DLReasoner <em>DL Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.dl.DLReasoner
	 * @generated
	 */
	public Adapter createDLReasonerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner <em>Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner
	 * @generated
	 */
	public Adapter createPelletReasonerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.InferenceCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.InferenceCapability
	 * @generated
	 */
	public Adapter createInferenceCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.NumericalExpression <em>Numerical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.NumericalExpression
	 * @generated
	 */
	public Adapter createNumericalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FilterAdapterFactory
