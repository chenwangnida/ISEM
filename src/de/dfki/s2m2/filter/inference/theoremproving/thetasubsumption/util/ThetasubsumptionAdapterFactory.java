/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.dfki.s2m2.filter.Resource;
import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremProver;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage
 * @generated
 */
public class ThetasubsumptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ThetasubsumptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThetasubsumptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ThetasubsumptionPackage.eINSTANCE;
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
	protected ThetasubsumptionSwitch<Adapter> modelSwitch =
		new ThetasubsumptionSwitch<Adapter>() {
			@Override
			public Adapter caseThetaSubsumption(ThetaSubsumption object) {
				return createThetaSubsumptionAdapter();
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
			public <T extends SpecificationExpression> Adapter caseTheoremProver(TheoremProver<T> object) {
				return createTheoremProverAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption <em>Theta Subsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption
	 * @generated
	 */
	public Adapter createThetaSubsumptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.inference.theoremproving.TheoremProver <em>Theorem Prover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.inference.theoremproving.TheoremProver
	 * @generated
	 */
	public Adapter createTheoremProverAdapter() {
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

} //ThetasubsumptionAdapterFactory
