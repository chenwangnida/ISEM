/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.dfki.s2m2.filter.And;
import de.dfki.s2m2.filter.Average;
import de.dfki.s2m2.filter.BipartiteGraphMatching;
import de.dfki.s2m2.filter.BooleanAsDouble;
import de.dfki.s2m2.filter.BooleanExpression;
import de.dfki.s2m2.filter.Concatenation;
import de.dfki.s2m2.filter.ConceptRelation;
import de.dfki.s2m2.filter.Conditional;
import de.dfki.s2m2.filter.EntityExtraction;
import de.dfki.s2m2.filter.Expression;
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
import de.dfki.s2m2.filter.NumericalExpression;
import de.dfki.s2m2.filter.Or;
import de.dfki.s2m2.filter.ParameterType;
import de.dfki.s2m2.filter.Resource;
import de.dfki.s2m2.filter.SemanticAnnotationEvaluation;
import de.dfki.s2m2.filter.ServiceLiteralEvaluation;
import de.dfki.s2m2.filter.SpecificationAvailable;
import de.dfki.s2m2.filter.SpecificationEvaluation;
import de.dfki.s2m2.filter.SpecificationType;
import de.dfki.s2m2.filter.TextSimilarityMeasure;
import de.dfki.s2m2.filter.True;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.Specification;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterPackageImpl extends EPackageImpl implements FilterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSimilarityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallExistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityExtractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticAnnotationEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLiteralEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAsDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bipartiteGraphMatchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specificationExpressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specificationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType evaluationExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dfki.s2m2.filter.FilterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilterPackageImpl() {
		super(eNS_URI, FilterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FilterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilterPackage init() {
		if (isInited) return (FilterPackage)EPackage.Registry.INSTANCE.getEPackage(FilterPackage.eNS_URI);

		// Obtain or create and register package
		FilterPackageImpl theFilterPackage = (FilterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FilterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FilterPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFilterPackage.createPackageContents();

		// Initialize created meta-data
		theFilterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilterPackage.eNS_URI, theFilterPackage);
		return theFilterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Name() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextSimilarityMeasure() {
		return textSimilarityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedValue() {
		return fixedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedValue_Alpha() {
		return (EAttribute)fixedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAverage() {
		return averageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAverage_Operands() {
		return (EReference)averageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverse() {
		return inverseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInverse_Operand() {
		return (EReference)inverseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Operands() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Operands() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEquals() {
		return greaterEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterEquals_LeftOperand() {
		return (EReference)greaterEqualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreaterEquals_RightOperand() {
		return (EReference)greaterEqualsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForallExists() {
		return forallExistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForallExists_Operand() {
		return (EReference)forallExistsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptRelation() {
		return conceptRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericalExpression() {
		return numericalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_If() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Then() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditional_Else() {
		return (EReference)conditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityExtraction() {
		return entityExtractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityExtraction_Operand() {
		return (EReference)entityExtractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticAnnotationEvaluation() {
		return semanticAnnotationEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemanticAnnotationEvaluation_Type() {
		return (EAttribute)semanticAnnotationEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceLiteralEvaluation() {
		return serviceLiteralEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceLiteralEvaluation_Types() {
		return (EAttribute)serviceLiteralEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegation_Operand() {
		return (EReference)negationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximum() {
		return maximumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaximum_Operands() {
		return (EReference)maximumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcatenation() {
		return concatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcatenation_Operand() {
		return (EReference)concatenationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAsDouble() {
		return booleanAsDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanAsDouble_Operand() {
		return (EReference)booleanAsDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationAvailable() {
		return specificationAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationAvailable_Type() {
		return (EAttribute)specificationAvailableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationEvaluation() {
		return specificationEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationEvaluation_Type() {
		return (EAttribute)specificationEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBipartiteGraphMatching() {
		return bipartiteGraphMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBipartiteGraphMatching_Valuation() {
		return (EReference)bipartiteGraphMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterConfiguration() {
		return filterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterConfiguration_Resource() {
		return (EReference)filterConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterConfiguration_Filter() {
		return (EReference)filterConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterConfiguration_UsedParameterTypes() {
		return (EAttribute)filterConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterConfiguration_UsedLiteralTypes() {
		return (EAttribute)filterConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterConfiguration_UsedSpecificationTypes() {
		return (EAttribute)filterConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralType() {
		return literalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecificationType() {
		return specificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getService() {
		return serviceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComparable() {
		return comparableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpecificationExpression() {
		return specificationExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpecification() {
		return specificationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEvaluationException() {
		return evaluationExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterFactory getFilterFactory() {
		return (FilterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		filterConfigurationEClass = createEClass(FILTER_CONFIGURATION);
		createEReference(filterConfigurationEClass, FILTER_CONFIGURATION__RESOURCE);
		createEReference(filterConfigurationEClass, FILTER_CONFIGURATION__FILTER);
		createEAttribute(filterConfigurationEClass, FILTER_CONFIGURATION__USED_PARAMETER_TYPES);
		createEAttribute(filterConfigurationEClass, FILTER_CONFIGURATION__USED_LITERAL_TYPES);
		createEAttribute(filterConfigurationEClass, FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__NAME);

		textSimilarityMeasureEClass = createEClass(TEXT_SIMILARITY_MEASURE);

		fixedValueEClass = createEClass(FIXED_VALUE);
		createEAttribute(fixedValueEClass, FIXED_VALUE__ALPHA);

		averageEClass = createEClass(AVERAGE);
		createEReference(averageEClass, AVERAGE__OPERANDS);

		inverseEClass = createEClass(INVERSE);
		createEReference(inverseEClass, INVERSE__OPERAND);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OPERANDS);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OPERANDS);

		greaterEqualsEClass = createEClass(GREATER_EQUALS);
		createEReference(greaterEqualsEClass, GREATER_EQUALS__LEFT_OPERAND);
		createEReference(greaterEqualsEClass, GREATER_EQUALS__RIGHT_OPERAND);

		forallExistsEClass = createEClass(FORALL_EXISTS);
		createEReference(forallExistsEClass, FORALL_EXISTS__OPERAND);

		conceptRelationEClass = createEClass(CONCEPT_RELATION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

		numericalExpressionEClass = createEClass(NUMERICAL_EXPRESSION);

		conditionalEClass = createEClass(CONDITIONAL);
		createEReference(conditionalEClass, CONDITIONAL__IF);
		createEReference(conditionalEClass, CONDITIONAL__THEN);
		createEReference(conditionalEClass, CONDITIONAL__ELSE);

		entityExtractionEClass = createEClass(ENTITY_EXTRACTION);
		createEReference(entityExtractionEClass, ENTITY_EXTRACTION__OPERAND);

		semanticAnnotationEvaluationEClass = createEClass(SEMANTIC_ANNOTATION_EVALUATION);
		createEAttribute(semanticAnnotationEvaluationEClass, SEMANTIC_ANNOTATION_EVALUATION__TYPE);

		serviceLiteralEvaluationEClass = createEClass(SERVICE_LITERAL_EVALUATION);
		createEAttribute(serviceLiteralEvaluationEClass, SERVICE_LITERAL_EVALUATION__TYPES);

		negationEClass = createEClass(NEGATION);
		createEReference(negationEClass, NEGATION__OPERAND);

		maximumEClass = createEClass(MAXIMUM);
		createEReference(maximumEClass, MAXIMUM__OPERANDS);

		trueEClass = createEClass(TRUE);

		concatenationEClass = createEClass(CONCATENATION);
		createEReference(concatenationEClass, CONCATENATION__OPERAND);

		booleanAsDoubleEClass = createEClass(BOOLEAN_AS_DOUBLE);
		createEReference(booleanAsDoubleEClass, BOOLEAN_AS_DOUBLE__OPERAND);

		specificationAvailableEClass = createEClass(SPECIFICATION_AVAILABLE);
		createEAttribute(specificationAvailableEClass, SPECIFICATION_AVAILABLE__TYPE);

		specificationEvaluationEClass = createEClass(SPECIFICATION_EVALUATION);
		createEAttribute(specificationEvaluationEClass, SPECIFICATION_EVALUATION__TYPE);

		bipartiteGraphMatchingEClass = createEClass(BIPARTITE_GRAPH_MATCHING);
		createEReference(bipartiteGraphMatchingEClass, BIPARTITE_GRAPH_MATCHING__VALUATION);

		resourceEClass = createEClass(RESOURCE);

		// Create enums
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		literalTypeEEnum = createEEnum(LITERAL_TYPE);
		specificationTypeEEnum = createEEnum(SPECIFICATION_TYPE);

		// Create data types
		uriEDataType = createEDataType(URI);
		collectionEDataType = createEDataType(COLLECTION);
		serviceEDataType = createEDataType(SERVICE);
		comparableEDataType = createEDataType(COMPARABLE);
		specificationExpressionEDataType = createEDataType(SPECIFICATION_EXPRESSION);
		specificationEDataType = createEDataType(SPECIFICATION);
		evaluationExceptionEDataType = createEDataType(EVALUATION_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter expressionEClass_Domain = addETypeParameter(expressionEClass, "Domain");
		ETypeParameter expressionEClass_Range = addETypeParameter(expressionEClass, "Range");
		ETypeParameter fixedValueEClass_Domain = addETypeParameter(fixedValueEClass, "Domain");
		ETypeParameter averageEClass_Domain = addETypeParameter(averageEClass, "Domain");
		ETypeParameter inverseEClass_Domain = addETypeParameter(inverseEClass, "Domain");
		ETypeParameter inverseEClass_Range = addETypeParameter(inverseEClass, "Range");
		ETypeParameter andEClass_Domain = addETypeParameter(andEClass, "Domain");
		ETypeParameter orEClass_Domain = addETypeParameter(orEClass, "Domain");
		ETypeParameter greaterEqualsEClass_Domain = addETypeParameter(greaterEqualsEClass, "Domain");
		ETypeParameter forallExistsEClass_Domain = addETypeParameter(forallExistsEClass, "Domain");
		ETypeParameter booleanExpressionEClass_Domain = addETypeParameter(booleanExpressionEClass, "Domain");
		ETypeParameter numericalExpressionEClass_Domain = addETypeParameter(numericalExpressionEClass, "Domain");
		ETypeParameter conditionalEClass_Domain = addETypeParameter(conditionalEClass, "Domain");
		ETypeParameter conditionalEClass_Range = addETypeParameter(conditionalEClass, "Range");
		ETypeParameter entityExtractionEClass_Focus = addETypeParameter(entityExtractionEClass, "Focus");
		ETypeParameter entityExtractionEClass_Domain = addETypeParameter(entityExtractionEClass, "Domain");
		ETypeParameter entityExtractionEClass_Range = addETypeParameter(entityExtractionEClass, "Range");
		ETypeParameter semanticAnnotationEvaluationEClass_Range = addETypeParameter(semanticAnnotationEvaluationEClass, "Range");
		ETypeParameter serviceLiteralEvaluationEClass_Range = addETypeParameter(serviceLiteralEvaluationEClass, "Range");
		ETypeParameter negationEClass_Domain = addETypeParameter(negationEClass, "Domain");
		ETypeParameter maximumEClass_Domain = addETypeParameter(maximumEClass, "Domain");
		ETypeParameter trueEClass_Domain = addETypeParameter(trueEClass, "Domain");
		ETypeParameter concatenationEClass_Range = addETypeParameter(concatenationEClass, "Range");
		ETypeParameter booleanAsDoubleEClass_Domain = addETypeParameter(booleanAsDoubleEClass, "Domain");
		ETypeParameter specificationAvailableEClass_Focus = addETypeParameter(specificationAvailableEClass, "Focus");
		ETypeParameter specificationEvaluationEClass_T = addETypeParameter(specificationEvaluationEClass, "T");
		ETypeParameter specificationEvaluationEClass_Range = addETypeParameter(specificationEvaluationEClass, "Range");
		ETypeParameter bipartiteGraphMatchingEClass_Domain = addETypeParameter(bipartiteGraphMatchingEClass, "Domain");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(comparableEDataType, "Domain");
		ETypeParameter specificationEDataType_T = addETypeParameter(specificationEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificationExpression());
		specificationAvailableEClass_Focus.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificationExpression());
		specificationEvaluationEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificationExpression());
		specificationEDataType_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getNumericalExpression());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		textSimilarityMeasureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNumericalExpression());
		g2 = createEGenericType(fixedValueEClass_Domain);
		g1.getETypeArguments().add(g2);
		fixedValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNumericalExpression());
		g2 = createEGenericType(averageEClass_Domain);
		g1.getETypeArguments().add(g2);
		averageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(inverseEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(inverseEClass_Range);
		g1.getETypeArguments().add(g2);
		inverseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(andEClass_Domain);
		g1.getETypeArguments().add(g2);
		andEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(orEClass_Domain);
		g1.getETypeArguments().add(g2);
		orEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(greaterEqualsEClass_Domain);
		g1.getETypeArguments().add(g2);
		greaterEqualsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(this.getCollection());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(forallExistsEClass_Domain);
		g2.getETypeArguments().add(g3);
		forallExistsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(this.getURI());
		g1.getETypeArguments().add(g2);
		conceptRelationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(booleanExpressionEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanExpressionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(numericalExpressionEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		numericalExpressionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(conditionalEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(conditionalEClass_Range);
		g1.getETypeArguments().add(g2);
		conditionalEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(entityExtractionEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(entityExtractionEClass_Range);
		g1.getETypeArguments().add(g2);
		entityExtractionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityExtraction());
		g2 = createEGenericType(this.getURI());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(semanticAnnotationEvaluationEClass_Range);
		g1.getETypeArguments().add(g2);
		semanticAnnotationEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityExtraction());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(serviceLiteralEvaluationEClass_Range);
		g1.getETypeArguments().add(g2);
		serviceLiteralEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(negationEClass_Domain);
		g1.getETypeArguments().add(g2);
		negationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNumericalExpression());
		g2 = createEGenericType(maximumEClass_Domain);
		g1.getETypeArguments().add(g2);
		maximumEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(trueEClass_Domain);
		g1.getETypeArguments().add(g2);
		trueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(this.getCollection());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(concatenationEClass_Range);
		g1.getETypeArguments().add(g2);
		concatenationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNumericalExpression());
		g2 = createEGenericType(booleanAsDoubleEClass_Domain);
		g1.getETypeArguments().add(g2);
		booleanAsDoubleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBooleanExpression());
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		specificationAvailableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEntityExtraction());
		g2 = createEGenericType(specificationEvaluationEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(specificationEvaluationEClass_Range);
		g1.getETypeArguments().add(g2);
		specificationEvaluationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNumericalExpression());
		g2 = createEGenericType(this.getCollection());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(bipartiteGraphMatchingEClass_Domain);
		g2.getETypeArguments().add(g3);
		bipartiteGraphMatchingEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(filterConfigurationEClass, FilterConfiguration.class, "FilterConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterConfiguration_Resource(), this.getResource(), null, "resource", null, 0, -1, FilterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(this.getService());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getFilterConfiguration_Filter(), g1, null, "filter", null, 1, -1, FilterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterConfiguration_UsedParameterTypes(), this.getParameterType(), "usedParameterTypes", null, 0, -1, FilterConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterConfiguration_UsedLiteralTypes(), this.getLiteralType(), "usedLiteralTypes", null, 0, -1, FilterConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterConfiguration_UsedSpecificationTypes(), this.getSpecificationType(), "usedSpecificationTypes", null, 0, -1, FilterConfiguration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(expressionEClass, null, "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(expressionEClass_Domain);
		addEParameter(op, g1, "param1", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(expressionEClass_Domain);
		addEParameter(op, g1, "param2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getEvaluationException());
		g1 = createEGenericType(expressionEClass_Range);
		initEOperation(op, g1);

		initEClass(textSimilarityMeasureEClass, TextSimilarityMeasure.class, "TextSimilarityMeasure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedValueEClass, FixedValue.class, "FixedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedValue_Alpha(), ecorePackage.getEDouble(), "alpha", null, 0, 1, FixedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(averageEClass, Average.class, "Average", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(averageEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getAverage_Operands(), g1, null, "operands", null, 2, -1, Average.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverseEClass, Inverse.class, "Inverse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(inverseEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(inverseEClass_Range);
		g1.getETypeArguments().add(g2);
		initEReference(getInverse_Operand(), g1, null, "operand", null, 1, 1, Inverse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(andEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getAnd_Operands(), g1, null, "operands", null, 2, -1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(orEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getOr_Operands(), g1, null, "operands", null, 2, -1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterEqualsEClass, GreaterEquals.class, "GreaterEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(greaterEqualsEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getGreaterEquals_LeftOperand(), g1, null, "leftOperand", null, 1, 1, GreaterEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(greaterEqualsEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getGreaterEquals_RightOperand(), g1, null, "rightOperand", null, 1, 1, GreaterEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forallExistsEClass, ForallExists.class, "ForallExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(forallExistsEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getForallExists_Operand(), g1, null, "operand", null, 1, 1, ForallExists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptRelationEClass, ConceptRelation.class, "ConceptRelation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericalExpressionEClass, NumericalExpression.class, "NumericalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(conditionalEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getConditional_If(), g1, null, "if", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(conditionalEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(conditionalEClass_Range);
		g1.getETypeArguments().add(g2);
		initEReference(getConditional_Then(), g1, null, "then", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(conditionalEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(conditionalEClass_Range);
		g1.getETypeArguments().add(g2);
		initEReference(getConditional_Else(), g1, null, "else", null, 1, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityExtractionEClass, EntityExtraction.class, "EntityExtraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(this.getCollection());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(entityExtractionEClass_Focus);
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(entityExtractionEClass_Range);
		g1.getETypeArguments().add(g2);
		initEReference(getEntityExtraction_Operand(), g1, null, "operand", null, 1, 1, EntityExtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(entityExtractionEClass, null, "getEntities", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(entityExtractionEClass_Domain);
		addEParameter(op, g1, "upper", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(entityExtractionEClass_Focus);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(semanticAnnotationEvaluationEClass, SemanticAnnotationEvaluation.class, "SemanticAnnotationEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemanticAnnotationEvaluation_Type(), this.getParameterType(), "type", null, 1, 1, SemanticAnnotationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceLiteralEvaluationEClass, ServiceLiteralEvaluation.class, "ServiceLiteralEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLiteralEvaluation_Types(), this.getLiteralType(), "types", null, 1, -1, ServiceLiteralEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(negationEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getNegation_Operand(), g1, null, "operand", null, 1, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maximumEClass, Maximum.class, "Maximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(maximumEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getMaximum_Operands(), g1, null, "operands", null, 2, -1, Maximum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concatenationEClass, Concatenation.class, "Concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(concatenationEClass_Range);
		g1.getETypeArguments().add(g2);
		initEReference(getConcatenation_Operand(), g1, null, "operand", null, 1, 1, Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanAsDoubleEClass, BooleanAsDouble.class, "BooleanAsDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(booleanAsDoubleEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		initEReference(getBooleanAsDouble_Operand(), g1, null, "operand", null, 1, 1, BooleanAsDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationAvailableEClass, SpecificationAvailable.class, "SpecificationAvailable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificationAvailable_Type(), this.getSpecificationType(), "type", null, 1, 1, SpecificationAvailable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEvaluationEClass, SpecificationEvaluation.class, "SpecificationEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificationEvaluation_Type(), this.getSpecificationType(), "type", null, 1, 1, SpecificationEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bipartiteGraphMatchingEClass, BipartiteGraphMatching.class, "BipartiteGraphMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getExpression());
		g2 = createEGenericType(bipartiteGraphMatchingEClass_Domain);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		initEReference(getBipartiteGraphMatching_Valuation(), g1, null, "valuation", null, 1, 1, BipartiteGraphMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INPUT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.OUTPUT);

		initEEnum(literalTypeEEnum, LiteralType.class, "LiteralType");
		addEEnumLiteral(literalTypeEEnum, LiteralType.UNFOLDED_INPUT);
		addEEnumLiteral(literalTypeEEnum, LiteralType.UNFOLDED_OUTPUT);
		addEEnumLiteral(literalTypeEEnum, LiteralType.DESCRIPTION);

		initEEnum(specificationTypeEEnum, SpecificationType.class, "SpecificationType");
		addEEnumLiteral(specificationTypeEEnum, SpecificationType.PRECONDITION);
		addEEnumLiteral(specificationTypeEEnum, SpecificationType.EFFECT);

		// Initialize data types
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceEDataType, ServiceView.class, "Service", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(comparableEDataType, Comparable.class, "Comparable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(specificationExpressionEDataType, SpecificationExpression.class, "SpecificationExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(specificationEDataType, Specification.class, "Specification", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(evaluationExceptionEDataType, ExpressionEvaluationException.class, "EvaluationException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });			
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";			
		addAnnotation
		  (getFilterConfiguration_UsedParameterTypes(), 
		   source, 
		   new String[] {
			 "derivation", "filter::SemanticAnnotationEvaluation.allInstances().type -> asOrderedSet()"
		   });		
		addAnnotation
		  (getFilterConfiguration_UsedLiteralTypes(), 
		   source, 
		   new String[] {
			 "derivation", "filter::ServiceLiteralEvaluation.allInstances().types -> flatten()-> asOrderedSet()"
		   });		
		addAnnotation
		  (getFilterConfiguration_UsedSpecificationTypes(), 
		   source, 
		   new String[] {
			 "derivation", "filter::SpecificationEvaluation.allInstances().type -> asOrderedSet()"
		   });
	}

} //FilterPackageImpl
