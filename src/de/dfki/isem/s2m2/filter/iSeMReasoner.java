/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter;

import java.net.URI;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLOntology;

import uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ViewExtractor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>iSe MReasoner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getLogger <em>Logger</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_CLASS_URI <em>TEMP CLASS URI</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getLOCAL_ALN_ONTOLOGY <em>LOCAL ALN ONTOLOGY</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getTEMP_ONTOLOGY <em>TEMP ONTOLOGY</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getServiceRegistry <em>Service Registry</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getViewExtractor <em>View Extractor</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getMamasTng <em>Mamas Tng</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getAlnOntology <em>Aln Ontology</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilities <em>Probabilities</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilityLowerBound <em>Probability Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner()
 * @model
 * @generated
 */
public interface iSeMReasoner extends PelletReasoner {
	/**
	 * Returns the value of the '<em><b>Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logger</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_Logger()
	 * @model dataType="de.dfki.isem.s2m2.filter.Logger" required="true" transient="true" changeable="false"
	 * @generated
	 */
	Logger getLogger();

	/**
	 * Returns the value of the '<em><b>TEMP CLASS URI</b></em>' attribute.
	 * The default value is <code>"http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology#TempClass"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TEMP CLASS URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TEMP CLASS URI</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_TEMP_CLASS_URI()
	 * @model default="http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology#TempClass" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getTEMP_CLASS_URI();

	/**
	 * Returns the value of the '<em><b>LOCAL ALN ONTOLOGY</b></em>' attribute.
	 * The default value is <code>"http://www-ags.dfki.uni-sb.de/ISeM/LocalOntologyALN"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOCAL ALN ONTOLOGY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOCAL ALN ONTOLOGY</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_LOCAL_ALN_ONTOLOGY()
	 * @model default="http://www-ags.dfki.uni-sb.de/ISeM/LocalOntologyALN" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getLOCAL_ALN_ONTOLOGY();

	/**
	 * Returns the value of the '<em><b>TEMP ONTOLOGY</b></em>' attribute.
	 * The default value is <code>"http://www-ags.dfki.uni-sb.de/ISeM/TempOntology"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TEMP ONTOLOGY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TEMP ONTOLOGY</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_TEMP_ONTOLOGY()
	 * @model default="http://www-ags.dfki.uni-sb.de/ISeM/TempOntology" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getTEMP_ONTOLOGY();

	/**
	 * Returns the value of the '<em><b>Service Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Registry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Registry</em>' attribute.
	 * @see #setServiceRegistry(ServiceRegistry)
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_ServiceRegistry()
	 * @model dataType="de.dfki.isem.s2m2.filter.ServiceRegistry" transient="true"
	 * @generated
	 */
	ServiceRegistry getServiceRegistry();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getServiceRegistry <em>Service Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Registry</em>' attribute.
	 * @see #getServiceRegistry()
	 * @generated
	 */
	void setServiceRegistry(ServiceRegistry value);

	/**
	 * Returns the value of the '<em><b>View Extractor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Extractor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Extractor</em>' attribute.
	 * @see #setViewExtractor(ViewExtractor)
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_ViewExtractor()
	 * @model dataType="de.dfki.isem.s2m2.filter.ViewExtractor" transient="true"
	 * @generated
	 */
	ViewExtractor getViewExtractor();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getViewExtractor <em>View Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Extractor</em>' attribute.
	 * @see #getViewExtractor()
	 * @generated
	 */
	void setViewExtractor(ViewExtractor value);

	/**
	 * Returns the value of the '<em><b>Mamas Tng</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mamas Tng</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mamas Tng</em>' attribute.
	 * @see #isSetMamasTng()
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_MamasTng()
	 * @model unsettable="true" dataType="de.dfki.isem.s2m2.filter.DIGReasoner" transient="true" changeable="false"
	 * @generated
	 */
	DIGReasoner getMamasTng();

	/**
	 * Returns whether the value of the '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getMamasTng <em>Mamas Tng</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mamas Tng</em>' attribute is set.
	 * @see #getMamasTng()
	 * @generated
	 */
	boolean isSetMamasTng();

	/**
	 * Returns the value of the '<em><b>Aln Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aln Ontology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aln Ontology</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_AlnOntology()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.OWLOntology" required="true" transient="true" changeable="false"
	 * @generated
	 */
	OWLOntology getAlnOntology();

	/**
	 * Returns the value of the '<em><b>Probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilities</em>' attribute.
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_Probabilities()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	Map<URI, Double> getProbabilities();

	/**
	 * Returns the value of the '<em><b>Probability Lower Bound</b></em>' attribute.
	 * The default value is <code>"9999999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Lower Bound</em>' attribute.
	 * @see #setProbabilityLowerBound(Double)
	 * @see de.dfki.isem.s2m2.filter.FilterPackage#getiSeMReasoner_ProbabilityLowerBound()
	 * @model default="9999999" required="true" transient="true"
	 * @generated
	 */
	Double getProbabilityLowerBound();

	/**
	 * Sets the value of the '{@link de.dfki.isem.s2m2.filter.iSeMReasoner#getProbabilityLowerBound <em>Probability Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Lower Bound</em>' attribute.
	 * @see #getProbabilityLowerBound()
	 * @generated
	 */
	void setProbabilityLowerBound(Double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.isem.s2m2.filter.OWLDescrption" required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" CDataType="de.dfki.s2m2.filter.URI" CRequired="true" DDataType="de.dfki.s2m2.filter.URI" DRequired="true"
	 * @generated
	 */
	OWLDescription contract(URI C, URI D) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.isem.s2m2.filter.OWLDescrption" required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" CDataType="de.dfki.s2m2.filter.URI" CRequired="true" DDataType="de.dfki.s2m2.filter.URI" DRequired="true"
	 * @generated
	 */
	OWLDescription abduce(URI C, URI D) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.isem.s2m2.filter.OWLDescrption" required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" KDataType="de.dfki.isem.s2m2.filter.OWLDescrption" KRequired="true" DDataType="de.dfki.s2m2.filter.URI" DRequired="true"
	 * @generated
	 */
	OWLDescription abduce(OWLDescription K, URI D) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" CDataType="de.dfki.s2m2.filter.URI" CRequired="true"
	 * @generated
	 */
	Double probability(URI C) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" CDataType="de.dfki.isem.s2m2.filter.OWLDescrption" CRequired="true"
	 * @generated
	 */
	Double probability(OWLDescription C) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetProbabilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.Set<de.dfki.s2m2.filter.URI>" required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" concept1DataType="de.dfki.s2m2.filter.URI" concept1Required="true" concept2DataType="de.dfki.isem.s2m2.filter.OWLDescrption" concept2Required="true"
	 * @generated
	 */
	Set<URI> directCommonSubsumers(URI concept1, OWLDescription concept2) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.Set<de.dfki.s2m2.filter.URI>" required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" concept1DataType="de.dfki.s2m2.filter.URI" concept1Required="true" concept2DataType="de.dfki.s2m2.filter.URI" concept2Required="true"
	 * @generated
	 */
	Set<URI> directCommonSubsumers(URI concept1, URI concept2) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" conceptDataType="de.dfki.s2m2.filter.URI" conceptRequired="true"
	 * @generated
	 */
	Integer depth(URI concept) throws InferenceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="de.dfki.s2m2.filter.inference.InferenceException" conceptDataType="de.dfki.s2m2.filter.URI" conceptRequired="true" ancestorDataType="de.dfki.s2m2.filter.URI" ancestorRequired="true"
	 * @generated
	 */
	Integer distanceToAncestor(URI concept, URI ancestor) throws InferenceException;

} // iSeMReasoner
