/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.net.URI;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.s2m2.filter.And;
import de.dfki.s2m2.filter.Average;
import de.dfki.s2m2.filter.BipartiteGraphMatching;
import de.dfki.s2m2.filter.BooleanAsDouble;
import de.dfki.s2m2.filter.Concatenation;
import de.dfki.s2m2.filter.Conditional;
import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.FilterConfiguration;
import de.dfki.s2m2.filter.FilterFactory;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.FixedValue;
import de.dfki.s2m2.filter.ForallExists;
import de.dfki.s2m2.filter.GreaterEquals;
import de.dfki.s2m2.filter.Inverse;
import de.dfki.s2m2.filter.LiteralType;
import de.dfki.s2m2.filter.Maximum;
import de.dfki.s2m2.filter.Negation;
import de.dfki.s2m2.filter.Or;
import de.dfki.s2m2.filter.ParameterType;
import de.dfki.s2m2.filter.SemanticAnnotationEvaluation;
import de.dfki.s2m2.filter.ServiceLiteralEvaluation;
import de.dfki.s2m2.filter.SpecificationAvailable;
import de.dfki.s2m2.filter.SpecificationEvaluation;
import de.dfki.s2m2.filter.SpecificationType;
import de.dfki.s2m2.filter.True;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.Specification;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterFactoryImpl extends EFactoryImpl implements FilterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilterFactory init() {
		try {
			FilterFactory theFilterFactory = (FilterFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2"); 
			if (theFilterFactory != null) {
				return theFilterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FilterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FilterPackage.FILTER_CONFIGURATION: return createFilterConfiguration();
			case FilterPackage.FIXED_VALUE: return createFixedValue();
			case FilterPackage.AVERAGE: return createAverage();
			case FilterPackage.INVERSE: return createInverse();
			case FilterPackage.AND: return createAnd();
			case FilterPackage.OR: return createOr();
			case FilterPackage.GREATER_EQUALS: return createGreaterEquals();
			case FilterPackage.FORALL_EXISTS: return createForallExists();
			case FilterPackage.CONDITIONAL: return createConditional();
			case FilterPackage.SEMANTIC_ANNOTATION_EVALUATION: return createSemanticAnnotationEvaluation();
			case FilterPackage.SERVICE_LITERAL_EVALUATION: return createServiceLiteralEvaluation();
			case FilterPackage.NEGATION: return createNegation();
			case FilterPackage.MAXIMUM: return createMaximum();
			case FilterPackage.TRUE: return createTrue();
			case FilterPackage.CONCATENATION: return createConcatenation();
			case FilterPackage.BOOLEAN_AS_DOUBLE: return createBooleanAsDouble();
			case FilterPackage.SPECIFICATION_AVAILABLE: return createSpecificationAvailable();
			case FilterPackage.SPECIFICATION_EVALUATION: return createSpecificationEvaluation();
			case FilterPackage.BIPARTITE_GRAPH_MATCHING: return createBipartiteGraphMatching();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FilterPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case FilterPackage.LITERAL_TYPE:
				return createLiteralTypeFromString(eDataType, initialValue);
			case FilterPackage.SPECIFICATION_TYPE:
				return createSpecificationTypeFromString(eDataType, initialValue);
			case FilterPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case FilterPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case FilterPackage.SERVICE:
				return createServiceFromString(eDataType, initialValue);
			case FilterPackage.COMPARABLE:
				return createComparableFromString(eDataType, initialValue);
			case FilterPackage.SPECIFICATION_EXPRESSION:
				return createSpecificationExpressionFromString(eDataType, initialValue);
			case FilterPackage.SPECIFICATION:
				return createSpecificationFromString(eDataType, initialValue);
			case FilterPackage.EVALUATION_EXCEPTION:
				return createEvaluationExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FilterPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case FilterPackage.LITERAL_TYPE:
				return convertLiteralTypeToString(eDataType, instanceValue);
			case FilterPackage.SPECIFICATION_TYPE:
				return convertSpecificationTypeToString(eDataType, instanceValue);
			case FilterPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case FilterPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case FilterPackage.SERVICE:
				return convertServiceToString(eDataType, instanceValue);
			case FilterPackage.COMPARABLE:
				return convertComparableToString(eDataType, instanceValue);
			case FilterPackage.SPECIFICATION_EXPRESSION:
				return convertSpecificationExpressionToString(eDataType, instanceValue);
			case FilterPackage.SPECIFICATION:
				return convertSpecificationToString(eDataType, instanceValue);
			case FilterPackage.EVALUATION_EXCEPTION:
				return convertEvaluationExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> FixedValue<Domain> createFixedValue() {
		FixedValueImpl<Domain> fixedValue = new FixedValueImpl<Domain>();
		return fixedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> Average<Domain> createAverage() {
		AverageImpl<Domain> average = new AverageImpl<Domain>();
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain, Range> Inverse<Domain, Range> createInverse() {
		InverseImpl<Domain, Range> inverse = new InverseImpl<Domain, Range>();
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> And<Domain> createAnd() {
		AndImpl<Domain> and = new AndImpl<Domain>();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> Or<Domain> createOr() {
		OrImpl<Domain> or = new OrImpl<Domain>();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> GreaterEquals<Domain> createGreaterEquals() {
		GreaterEqualsImpl<Domain> greaterEquals = new GreaterEqualsImpl<Domain>();
		return greaterEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> ForallExists<Domain> createForallExists() {
		ForallExistsImpl<Domain> forallExists = new ForallExistsImpl<Domain>();
		return forallExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain, Range> Conditional<Domain, Range> createConditional() {
		ConditionalImpl<Domain, Range> conditional = new ConditionalImpl<Domain, Range>();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Range> SemanticAnnotationEvaluation<Range> createSemanticAnnotationEvaluation() {
		SemanticAnnotationEvaluationImpl<Range> semanticAnnotationEvaluation = new SemanticAnnotationEvaluationImpl<Range>();
		return semanticAnnotationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Range> ServiceLiteralEvaluation<Range> createServiceLiteralEvaluation() {
		ServiceLiteralEvaluationImpl<Range> serviceLiteralEvaluation = new ServiceLiteralEvaluationImpl<Range>();
		return serviceLiteralEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> Negation<Domain> createNegation() {
		NegationImpl<Domain> negation = new NegationImpl<Domain>();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> Maximum<Domain> createMaximum() {
		MaximumImpl<Domain> maximum = new MaximumImpl<Domain>();
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> True<Domain> createTrue() {
		TrueImpl<Domain> true_ = new TrueImpl<Domain>();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Range> Concatenation<Range> createConcatenation() {
		ConcatenationImpl<Range> concatenation = new ConcatenationImpl<Range>();
		return concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> BooleanAsDouble<Domain> createBooleanAsDouble() {
		BooleanAsDoubleImpl<Domain> booleanAsDouble = new BooleanAsDoubleImpl<Domain>();
		return booleanAsDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Focus extends SpecificationExpression> SpecificationAvailable<Focus> createSpecificationAvailable() {
		SpecificationAvailableImpl<Focus> specificationAvailable = new SpecificationAvailableImpl<Focus>();
		return specificationAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends SpecificationExpression, Range> SpecificationEvaluation<T, Range> createSpecificationEvaluation() {
		SpecificationEvaluationImpl<T, Range> specificationEvaluation = new SpecificationEvaluationImpl<T, Range>();
		return specificationEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <Domain> BipartiteGraphMatching<Domain> createBipartiteGraphMatching() {
		BipartiteGraphMatchingImpl<Domain> bipartiteGraphMatching = new BipartiteGraphMatchingImpl<Domain>();
		return bipartiteGraphMatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterConfiguration createFilterConfiguration() {
		FilterConfigurationImpl filterConfiguration = new FilterConfigurationImpl();
		return filterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralType createLiteralTypeFromString(EDataType eDataType, String initialValue) {
		LiteralType result = LiteralType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType createSpecificationTypeFromString(EDataType eDataType, String initialValue) {
		SpecificationType result = SpecificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceView createServiceFromString(EDataType eDataType, String initialValue) {
		return (ServiceView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable<?> createComparableFromString(EDataType eDataType, String initialValue) {
		return (Comparable<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationExpression createSpecificationExpressionFromString(EDataType eDataType, String initialValue) {
		return (SpecificationExpression)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification<?> createSpecificationFromString(EDataType eDataType, String initialValue) {
		return (Specification<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionEvaluationException createEvaluationExceptionFromString(EDataType eDataType, String initialValue) {
		return (ExpressionEvaluationException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterPackage getFilterPackage() {
		return (FilterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilterPackage getPackage() {
		return FilterPackage.eINSTANCE;
	}

} //FilterFactoryImpl
