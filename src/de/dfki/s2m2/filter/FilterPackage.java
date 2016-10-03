/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.FilterFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface FilterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dfki.de/s2m2/2011/s2m2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilterPackage eINSTANCE = de.dfki.s2m2.filter.impl.FilterPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.Expression
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.NumericalExpression <em>Numerical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.NumericalExpression
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getNumericalExpression()
	 * @generated
	 */
	int NUMERICAL_EXPRESSION = 12;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.TextSimilarityMeasure <em>Text Similarity Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.TextSimilarityMeasure
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getTextSimilarityMeasure()
	 * @generated
	 */
	int TEXT_SIMILARITY_MEASURE = 2;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.FixedValueImpl <em>Fixed Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.FixedValueImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getFixedValue()
	 * @generated
	 */
	int FIXED_VALUE = 3;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.AverageImpl <em>Average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.AverageImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getAverage()
	 * @generated
	 */
	int AVERAGE = 4;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.InverseImpl <em>Inverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.InverseImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getInverse()
	 * @generated
	 */
	int INVERSE = 5;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.BooleanExpression <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.BooleanExpression
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 11;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.AndImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 6;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.OrImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getOr()
	 * @generated
	 */
	int OR = 7;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.GreaterEqualsImpl <em>Greater Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.GreaterEqualsImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getGreaterEquals()
	 * @generated
	 */
	int GREATER_EQUALS = 8;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.ForallExistsImpl <em>Forall Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.ForallExistsImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getForallExists()
	 * @generated
	 */
	int FORALL_EXISTS = 9;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.ConceptRelation <em>Concept Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.ConceptRelation
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConceptRelation()
	 * @generated
	 */
	int CONCEPT_RELATION = 10;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.ConditionalImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 13;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.EntityExtractionImpl <em>Entity Extraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.EntityExtractionImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getEntityExtraction()
	 * @generated
	 */
	int ENTITY_EXTRACTION = 14;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.SemanticAnnotationEvaluationImpl <em>Semantic Annotation Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.SemanticAnnotationEvaluationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSemanticAnnotationEvaluation()
	 * @generated
	 */
	int SEMANTIC_ANNOTATION_EVALUATION = 15;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.ServiceLiteralEvaluationImpl <em>Service Literal Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.ServiceLiteralEvaluationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getServiceLiteralEvaluation()
	 * @generated
	 */
	int SERVICE_LITERAL_EVALUATION = 16;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.NegationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 17;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.MaximumImpl <em>Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.MaximumImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getMaximum()
	 * @generated
	 */
	int MAXIMUM = 18;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.TrueImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 19;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.ConcatenationImpl <em>Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.ConcatenationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConcatenation()
	 * @generated
	 */
	int CONCATENATION = 20;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.BooleanAsDoubleImpl <em>Boolean As Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.BooleanAsDoubleImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBooleanAsDouble()
	 * @generated
	 */
	int BOOLEAN_AS_DOUBLE = 21;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.SpecificationAvailableImpl <em>Specification Available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.SpecificationAvailableImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationAvailable()
	 * @generated
	 */
	int SPECIFICATION_AVAILABLE = 22;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.SpecificationEvaluationImpl <em>Specification Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.SpecificationEvaluationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationEvaluation()
	 * @generated
	 */
	int SPECIFICATION_EVALUATION = 23;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl <em>Bipartite Graph Matching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBipartiteGraphMatching()
	 * @generated
	 */
	int BIPARTITE_GRAPH_MATCHING = 24;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.impl.FilterConfigurationImpl
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getFilterConfiguration()
	 * @generated
	 */
	int FILTER_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Used Parameter Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION__USED_PARAMETER_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Used Literal Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION__USED_LITERAL_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Used Specification Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES = 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Numerical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERICAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SIMILARITY_MEASURE__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Text Similarity Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_SIMILARITY_MEASURE_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE__ALPHA = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_VALUE_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE__OPERANDS = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERANDS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERANDS = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS__LEFT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS__RIGHT_OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUALS_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXISTS__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXISTS__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forall Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_EXISTS_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_RELATION__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Concept Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_RELATION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__IF = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXTRACTION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXTRACTION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Extraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_EXTRACTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ANNOTATION_EVALUATION__NAME = ENTITY_EXTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ANNOTATION_EVALUATION__OPERAND = ENTITY_EXTRACTION__OPERAND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ANNOTATION_EVALUATION__TYPE = ENTITY_EXTRACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semantic Annotation Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ANNOTATION_EVALUATION_FEATURE_COUNT = ENTITY_EXTRACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LITERAL_EVALUATION__NAME = ENTITY_EXTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LITERAL_EVALUATION__OPERAND = ENTITY_EXTRACTION__OPERAND;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LITERAL_EVALUATION__TYPES = ENTITY_EXTRACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Literal Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LITERAL_EVALUATION_FEATURE_COUNT = ENTITY_EXTRACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM__OPERANDS = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AS_DOUBLE__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AS_DOUBLE__OPERAND = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean As Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AS_DOUBLE_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_AVAILABLE__NAME = BOOLEAN_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_AVAILABLE__TYPE = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specification Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_AVAILABLE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_EVALUATION__NAME = ENTITY_EXTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_EVALUATION__OPERAND = ENTITY_EXTRACTION__OPERAND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_EVALUATION__TYPE = ENTITY_EXTRACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specification Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_EVALUATION_FEATURE_COUNT = ENTITY_EXTRACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIPARTITE_GRAPH_MATCHING__NAME = NUMERICAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIPARTITE_GRAPH_MATCHING__VALUATION = NUMERICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bipartite Graph Matching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIPARTITE_GRAPH_MATCHING_FEATURE_COUNT = NUMERICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.Resource
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 25;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.ParameterType
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 26;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.LiteralType <em>Literal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.LiteralType
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 27;

	/**
	 * The meta object id for the '{@link de.dfki.s2m2.filter.SpecificationType <em>Specification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.SpecificationType
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationType()
	 * @generated
	 */
	int SPECIFICATION_TYPE = 28;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getURI()
	 * @generated
	 */
	int URI = 29;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 30;

	/**
	 * The meta object id for the '<em>Service</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.ServiceView
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 31;

	/**
	 * The meta object id for the '<em>Comparable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 32;

	/**
	 * The meta object id for the '<em>Specification Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.SpecificationExpression
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationExpression()
	 * @generated
	 */
	int SPECIFICATION_EXPRESSION = 33;

	/**
	 * The meta object id for the '<em>Specification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.service.Specification
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 34;

	/**
	 * The meta object id for the '<em>Evaluation Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dfki.s2m2.filter.ExpressionEvaluationException
	 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getEvaluationException()
	 * @generated
	 */
	int EVALUATION_EXCEPTION = 35;


	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.dfki.s2m2.filter.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dfki.s2m2.filter.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.TextSimilarityMeasure <em>Text Similarity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Similarity Measure</em>'.
	 * @see de.dfki.s2m2.filter.TextSimilarityMeasure
	 * @generated
	 */
	EClass getTextSimilarityMeasure();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.FixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Value</em>'.
	 * @see de.dfki.s2m2.filter.FixedValue
	 * @generated
	 */
	EClass getFixedValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.FixedValue#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see de.dfki.s2m2.filter.FixedValue#getAlpha()
	 * @see #getFixedValue()
	 * @generated
	 */
	EAttribute getFixedValue_Alpha();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Average</em>'.
	 * @see de.dfki.s2m2.filter.Average
	 * @generated
	 */
	EClass getAverage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.Average#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see de.dfki.s2m2.filter.Average#getOperands()
	 * @see #getAverage()
	 * @generated
	 */
	EReference getAverage_Operands();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse</em>'.
	 * @see de.dfki.s2m2.filter.Inverse
	 * @generated
	 */
	EClass getInverse();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Inverse#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.Inverse#getOperand()
	 * @see #getInverse()
	 * @generated
	 */
	EReference getInverse_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see de.dfki.s2m2.filter.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.And#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see de.dfki.s2m2.filter.And#getOperands()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Operands();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see de.dfki.s2m2.filter.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.Or#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see de.dfki.s2m2.filter.Or#getOperands()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Operands();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.GreaterEquals <em>Greater Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equals</em>'.
	 * @see de.dfki.s2m2.filter.GreaterEquals
	 * @generated
	 */
	EClass getGreaterEquals();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.GreaterEquals#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see de.dfki.s2m2.filter.GreaterEquals#getLeftOperand()
	 * @see #getGreaterEquals()
	 * @generated
	 */
	EReference getGreaterEquals_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.GreaterEquals#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see de.dfki.s2m2.filter.GreaterEquals#getRightOperand()
	 * @see #getGreaterEquals()
	 * @generated
	 */
	EReference getGreaterEquals_RightOperand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.ForallExists <em>Forall Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forall Exists</em>'.
	 * @see de.dfki.s2m2.filter.ForallExists
	 * @generated
	 */
	EClass getForallExists();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.ForallExists#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.ForallExists#getOperand()
	 * @see #getForallExists()
	 * @generated
	 */
	EReference getForallExists_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.ConceptRelation <em>Concept Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Relation</em>'.
	 * @see de.dfki.s2m2.filter.ConceptRelation
	 * @generated
	 */
	EClass getConceptRelation();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see de.dfki.s2m2.filter.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.NumericalExpression <em>Numerical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numerical Expression</em>'.
	 * @see de.dfki.s2m2.filter.NumericalExpression
	 * @generated
	 */
	EClass getNumericalExpression();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see de.dfki.s2m2.filter.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Conditional#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see de.dfki.s2m2.filter.Conditional#getIf()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_If();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Conditional#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see de.dfki.s2m2.filter.Conditional#getThen()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Then();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Conditional#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see de.dfki.s2m2.filter.Conditional#getElse()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Else();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.EntityExtraction <em>Entity Extraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Extraction</em>'.
	 * @see de.dfki.s2m2.filter.EntityExtraction
	 * @generated
	 */
	EClass getEntityExtraction();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.EntityExtraction#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.EntityExtraction#getOperand()
	 * @see #getEntityExtraction()
	 * @generated
	 */
	EReference getEntityExtraction_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.SemanticAnnotationEvaluation <em>Semantic Annotation Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Annotation Evaluation</em>'.
	 * @see de.dfki.s2m2.filter.SemanticAnnotationEvaluation
	 * @generated
	 */
	EClass getSemanticAnnotationEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.SemanticAnnotationEvaluation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.s2m2.filter.SemanticAnnotationEvaluation#getType()
	 * @see #getSemanticAnnotationEvaluation()
	 * @generated
	 */
	EAttribute getSemanticAnnotationEvaluation_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.ServiceLiteralEvaluation <em>Service Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Literal Evaluation</em>'.
	 * @see de.dfki.s2m2.filter.ServiceLiteralEvaluation
	 * @generated
	 */
	EClass getServiceLiteralEvaluation();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.s2m2.filter.ServiceLiteralEvaluation#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see de.dfki.s2m2.filter.ServiceLiteralEvaluation#getTypes()
	 * @see #getServiceLiteralEvaluation()
	 * @generated
	 */
	EAttribute getServiceLiteralEvaluation_Types();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see de.dfki.s2m2.filter.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Negation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.Negation#getOperand()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum</em>'.
	 * @see de.dfki.s2m2.filter.Maximum
	 * @generated
	 */
	EClass getMaximum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.Maximum#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see de.dfki.s2m2.filter.Maximum#getOperands()
	 * @see #getMaximum()
	 * @generated
	 */
	EReference getMaximum_Operands();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see de.dfki.s2m2.filter.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Concatenation <em>Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenation</em>'.
	 * @see de.dfki.s2m2.filter.Concatenation
	 * @generated
	 */
	EClass getConcatenation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.Concatenation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.Concatenation#getOperand()
	 * @see #getConcatenation()
	 * @generated
	 */
	EReference getConcatenation_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.BooleanAsDouble <em>Boolean As Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean As Double</em>'.
	 * @see de.dfki.s2m2.filter.BooleanAsDouble
	 * @generated
	 */
	EClass getBooleanAsDouble();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.BooleanAsDouble#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see de.dfki.s2m2.filter.BooleanAsDouble#getOperand()
	 * @see #getBooleanAsDouble()
	 * @generated
	 */
	EReference getBooleanAsDouble_Operand();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.SpecificationAvailable <em>Specification Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Available</em>'.
	 * @see de.dfki.s2m2.filter.SpecificationAvailable
	 * @generated
	 */
	EClass getSpecificationAvailable();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.SpecificationAvailable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.s2m2.filter.SpecificationAvailable#getType()
	 * @see #getSpecificationAvailable()
	 * @generated
	 */
	EAttribute getSpecificationAvailable_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.SpecificationEvaluation <em>Specification Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Evaluation</em>'.
	 * @see de.dfki.s2m2.filter.SpecificationEvaluation
	 * @generated
	 */
	EClass getSpecificationEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link de.dfki.s2m2.filter.SpecificationEvaluation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dfki.s2m2.filter.SpecificationEvaluation#getType()
	 * @see #getSpecificationEvaluation()
	 * @generated
	 */
	EAttribute getSpecificationEvaluation_Type();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.BipartiteGraphMatching <em>Bipartite Graph Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bipartite Graph Matching</em>'.
	 * @see de.dfki.s2m2.filter.BipartiteGraphMatching
	 * @generated
	 */
	EClass getBipartiteGraphMatching();

	/**
	 * Returns the meta object for the containment reference '{@link de.dfki.s2m2.filter.BipartiteGraphMatching#getValuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valuation</em>'.
	 * @see de.dfki.s2m2.filter.BipartiteGraphMatching#getValuation()
	 * @see #getBipartiteGraphMatching()
	 * @generated
	 */
	EReference getBipartiteGraphMatching_Valuation();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.FilterConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration
	 * @generated
	 */
	EClass getFilterConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.FilterConfiguration#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration#getResource()
	 * @see #getFilterConfiguration()
	 * @generated
	 */
	EReference getFilterConfiguration_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dfki.s2m2.filter.FilterConfiguration#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration#getFilter()
	 * @see #getFilterConfiguration()
	 * @generated
	 */
	EReference getFilterConfiguration_Filter();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedParameterTypes <em>Used Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Parameter Types</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration#getUsedParameterTypes()
	 * @see #getFilterConfiguration()
	 * @generated
	 */
	EAttribute getFilterConfiguration_UsedParameterTypes();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedLiteralTypes <em>Used Literal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Literal Types</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration#getUsedLiteralTypes()
	 * @see #getFilterConfiguration()
	 * @generated
	 */
	EAttribute getFilterConfiguration_UsedLiteralTypes();

	/**
	 * Returns the meta object for the attribute list '{@link de.dfki.s2m2.filter.FilterConfiguration#getUsedSpecificationTypes <em>Used Specification Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Specification Types</em>'.
	 * @see de.dfki.s2m2.filter.FilterConfiguration#getUsedSpecificationTypes()
	 * @see #getFilterConfiguration()
	 * @generated
	 */
	EAttribute getFilterConfiguration_UsedSpecificationTypes();

	/**
	 * Returns the meta object for class '{@link de.dfki.s2m2.filter.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see de.dfki.s2m2.filter.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for enum '{@link de.dfki.s2m2.filter.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see de.dfki.s2m2.filter.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.s2m2.filter.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Type</em>'.
	 * @see de.dfki.s2m2.filter.LiteralType
	 * @generated
	 */
	EEnum getLiteralType();

	/**
	 * Returns the meta object for enum '{@link de.dfki.s2m2.filter.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Specification Type</em>'.
	 * @see de.dfki.s2m2.filter.SpecificationType
	 * @generated
	 */
	EEnum getSpecificationType();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.ServiceView <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service</em>'.
	 * @see de.dfki.s2m2.service.ServiceView
	 * @model instanceClass="de.dfki.s2m2.service.ServiceView"
	 * @generated
	 */
	EDataType getService();

	/**
	 * Returns the meta object for data type '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable" typeParameters="Domain"
	 * @generated
	 */
	EDataType getComparable();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.SpecificationExpression <em>Specification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Specification Expression</em>'.
	 * @see de.dfki.s2m2.service.SpecificationExpression
	 * @model instanceClass="de.dfki.s2m2.service.SpecificationExpression"
	 * @generated
	 */
	EDataType getSpecificationExpression();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.service.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Specification</em>'.
	 * @see de.dfki.s2m2.service.Specification
	 * @model instanceClass="de.dfki.s2m2.service.Specification" typeParameters="T" TBounds="de.dfki.s2m2.filter.SpecificationExpression"
	 * @generated
	 */
	EDataType getSpecification();

	/**
	 * Returns the meta object for data type '{@link de.dfki.s2m2.filter.ExpressionEvaluationException <em>Evaluation Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Evaluation Exception</em>'.
	 * @see de.dfki.s2m2.filter.ExpressionEvaluationException
	 * @model instanceClass="de.dfki.s2m2.filter.ExpressionEvaluationException"
	 * @generated
	 */
	EDataType getEvaluationException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilterFactory getFilterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.Expression
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.TextSimilarityMeasure <em>Text Similarity Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.TextSimilarityMeasure
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getTextSimilarityMeasure()
		 * @generated
		 */
		EClass TEXT_SIMILARITY_MEASURE = eINSTANCE.getTextSimilarityMeasure();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.FixedValueImpl <em>Fixed Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.FixedValueImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getFixedValue()
		 * @generated
		 */
		EClass FIXED_VALUE = eINSTANCE.getFixedValue();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_VALUE__ALPHA = eINSTANCE.getFixedValue_Alpha();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.AverageImpl <em>Average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.AverageImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getAverage()
		 * @generated
		 */
		EClass AVERAGE = eINSTANCE.getAverage();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVERAGE__OPERANDS = eINSTANCE.getAverage_Operands();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.InverseImpl <em>Inverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.InverseImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getInverse()
		 * @generated
		 */
		EClass INVERSE = eINSTANCE.getInverse();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE__OPERAND = eINSTANCE.getInverse_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.AndImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OPERANDS = eINSTANCE.getAnd_Operands();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.OrImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__OPERANDS = eINSTANCE.getOr_Operands();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.GreaterEqualsImpl <em>Greater Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.GreaterEqualsImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getGreaterEquals()
		 * @generated
		 */
		EClass GREATER_EQUALS = eINSTANCE.getGreaterEquals();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_EQUALS__LEFT_OPERAND = eINSTANCE.getGreaterEquals_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREATER_EQUALS__RIGHT_OPERAND = eINSTANCE.getGreaterEquals_RightOperand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.ForallExistsImpl <em>Forall Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.ForallExistsImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getForallExists()
		 * @generated
		 */
		EClass FORALL_EXISTS = eINSTANCE.getForallExists();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORALL_EXISTS__OPERAND = eINSTANCE.getForallExists_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.ConceptRelation <em>Concept Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.ConceptRelation
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConceptRelation()
		 * @generated
		 */
		EClass CONCEPT_RELATION = eINSTANCE.getConceptRelation();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.BooleanExpression <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.BooleanExpression
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.NumericalExpression <em>Numerical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.NumericalExpression
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getNumericalExpression()
		 * @generated
		 */
		EClass NUMERICAL_EXPRESSION = eINSTANCE.getNumericalExpression();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.ConditionalImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__IF = eINSTANCE.getConditional_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__THEN = eINSTANCE.getConditional_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__ELSE = eINSTANCE.getConditional_Else();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.EntityExtractionImpl <em>Entity Extraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.EntityExtractionImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getEntityExtraction()
		 * @generated
		 */
		EClass ENTITY_EXTRACTION = eINSTANCE.getEntityExtraction();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_EXTRACTION__OPERAND = eINSTANCE.getEntityExtraction_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.SemanticAnnotationEvaluationImpl <em>Semantic Annotation Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.SemanticAnnotationEvaluationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSemanticAnnotationEvaluation()
		 * @generated
		 */
		EClass SEMANTIC_ANNOTATION_EVALUATION = eINSTANCE.getSemanticAnnotationEvaluation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_ANNOTATION_EVALUATION__TYPE = eINSTANCE.getSemanticAnnotationEvaluation_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.ServiceLiteralEvaluationImpl <em>Service Literal Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.ServiceLiteralEvaluationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getServiceLiteralEvaluation()
		 * @generated
		 */
		EClass SERVICE_LITERAL_EVALUATION = eINSTANCE.getServiceLiteralEvaluation();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LITERAL_EVALUATION__TYPES = eINSTANCE.getServiceLiteralEvaluation_Types();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.NegationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__OPERAND = eINSTANCE.getNegation_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.MaximumImpl <em>Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.MaximumImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getMaximum()
		 * @generated
		 */
		EClass MAXIMUM = eINSTANCE.getMaximum();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAXIMUM__OPERANDS = eINSTANCE.getMaximum_Operands();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.TrueImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.ConcatenationImpl <em>Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.ConcatenationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getConcatenation()
		 * @generated
		 */
		EClass CONCATENATION = eINSTANCE.getConcatenation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATION__OPERAND = eINSTANCE.getConcatenation_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.BooleanAsDoubleImpl <em>Boolean As Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.BooleanAsDoubleImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBooleanAsDouble()
		 * @generated
		 */
		EClass BOOLEAN_AS_DOUBLE = eINSTANCE.getBooleanAsDouble();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_AS_DOUBLE__OPERAND = eINSTANCE.getBooleanAsDouble_Operand();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.SpecificationAvailableImpl <em>Specification Available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.SpecificationAvailableImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationAvailable()
		 * @generated
		 */
		EClass SPECIFICATION_AVAILABLE = eINSTANCE.getSpecificationAvailable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_AVAILABLE__TYPE = eINSTANCE.getSpecificationAvailable_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.SpecificationEvaluationImpl <em>Specification Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.SpecificationEvaluationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationEvaluation()
		 * @generated
		 */
		EClass SPECIFICATION_EVALUATION = eINSTANCE.getSpecificationEvaluation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_EVALUATION__TYPE = eINSTANCE.getSpecificationEvaluation_Type();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl <em>Bipartite Graph Matching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.BipartiteGraphMatchingImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getBipartiteGraphMatching()
		 * @generated
		 */
		EClass BIPARTITE_GRAPH_MATCHING = eINSTANCE.getBipartiteGraphMatching();

		/**
		 * The meta object literal for the '<em><b>Valuation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIPARTITE_GRAPH_MATCHING__VALUATION = eINSTANCE.getBipartiteGraphMatching_Valuation();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.impl.FilterConfigurationImpl
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getFilterConfiguration()
		 * @generated
		 */
		EClass FILTER_CONFIGURATION = eINSTANCE.getFilterConfiguration();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONFIGURATION__RESOURCE = eINSTANCE.getFilterConfiguration_Resource();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CONFIGURATION__FILTER = eINSTANCE.getFilterConfiguration_Filter();

		/**
		 * The meta object literal for the '<em><b>Used Parameter Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONFIGURATION__USED_PARAMETER_TYPES = eINSTANCE.getFilterConfiguration_UsedParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Used Literal Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONFIGURATION__USED_LITERAL_TYPES = eINSTANCE.getFilterConfiguration_UsedLiteralTypes();

		/**
		 * The meta object literal for the '<em><b>Used Specification Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES = eINSTANCE.getFilterConfiguration_UsedSpecificationTypes();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.Resource <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.Resource
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.ParameterType
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.LiteralType <em>Literal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.LiteralType
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getLiteralType()
		 * @generated
		 */
		EEnum LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '{@link de.dfki.s2m2.filter.SpecificationType <em>Specification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.SpecificationType
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationType()
		 * @generated
		 */
		EEnum SPECIFICATION_TYPE = eINSTANCE.getSpecificationType();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>Service</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.ServiceView
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getService()
		 * @generated
		 */
		EDataType SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em>Comparable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getComparable()
		 * @generated
		 */
		EDataType COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '<em>Specification Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.SpecificationExpression
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecificationExpression()
		 * @generated
		 */
		EDataType SPECIFICATION_EXPRESSION = eINSTANCE.getSpecificationExpression();

		/**
		 * The meta object literal for the '<em>Specification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.service.Specification
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getSpecification()
		 * @generated
		 */
		EDataType SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em>Evaluation Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dfki.s2m2.filter.ExpressionEvaluationException
		 * @see de.dfki.s2m2.filter.impl.FilterPackageImpl#getEvaluationException()
		 * @generated
		 */
		EDataType EVALUATION_EXCEPTION = eINSTANCE.getEvaluationException();

	}

} //FilterPackage
