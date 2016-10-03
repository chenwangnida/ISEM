/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet;

import java.net.URI;
import java.util.Set;

import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.clarkparsia.modularity.IncrementalClassifier;

import de.dfki.s2m2.filter.inference.dl.DLReasoner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLOCAL_ONTOLOGY_URI <em>LOCAL ONTOLOGY URI</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOntologyManager <em>Ontology Manager</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getOwlFactory <em>Owl Factory</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getLocalOntology <em>Local Ontology</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner#getProcessedConcepts <em>Processed Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner()
 * @model
 * @generated
 */
public interface PelletReasoner extends DLReasoner {
	/**
	 * Returns the value of the '<em><b>LOCAL ONTOLOGY URI</b></em>' attribute.
	 * The default value is <code>"http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOCAL ONTOLOGY URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOCAL ONTOLOGY URI</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_LOCAL_ONTOLOGY_URI()
	 * @model default="http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology" required="true" transient="true" changeable="false"
	 * @generated
	 */
	String getLOCAL_ONTOLOGY_URI();

	/**
	 * Returns the value of the '<em><b>Ontology Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology Manager</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_OntologyManager()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.OWLOntologyManager" required="true" transient="true" changeable="false"
	 * @generated
	 */
	OWLOntologyManager getOntologyManager();

	/**
	 * Returns the value of the '<em><b>Owl Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owl Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owl Factory</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_OwlFactory()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.OWLDataFactory" required="true" transient="true" changeable="false"
	 * @generated
	 */
	OWLDataFactory getOwlFactory();

	/**
	 * Returns the value of the '<em><b>Local Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Ontology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Ontology</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_LocalOntology()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.OWLOntology" required="true" transient="true" changeable="false"
	 * @generated
	 */
	OWLOntology getLocalOntology();

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_Classifier()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.IncrementalClassifier" required="true" transient="true" changeable="false"
	 * @generated
	 */
	IncrementalClassifier getClassifier();

	/**
	 * Returns the value of the '<em><b>Processed Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processed Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processed Concepts</em>' attribute.
	 * @see de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage#getPelletReasoner_ProcessedConcepts()
	 * @model dataType="de.dfki.s2m2.filter.inference.dl.pellet.Set<de.dfki.s2m2.filter.URI>" transient="true" changeable="false"
	 * @generated
	 */
	Set<URI> getProcessedConcepts();

} // PelletReasoner
