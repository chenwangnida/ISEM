/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene.impl;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.RAMDirectory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.s2m2.filter.textsim.lucene.LuceneFactory;
import de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuceneFactoryImpl extends EFactoryImpl implements LuceneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LuceneFactory init() {
		try {
			LuceneFactory theLuceneFactory = (LuceneFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2/textsim/lucene"); 
			if (theLuceneFactory != null) {
				return theLuceneFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LuceneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuceneFactoryImpl() {
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
			case LucenePackage.LUCENE_MEMORY_INDEX: return createLuceneMemoryIndex();
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
			case LucenePackage.INDEX_WRITER:
				return createIndexWriterFromString(eDataType, initialValue);
			case LucenePackage.INDEX_READER:
				return createIndexReaderFromString(eDataType, initialValue);
			case LucenePackage.RAM_DIRECTORY:
				return createRAMDirectoryFromString(eDataType, initialValue);
			case LucenePackage.ANALYZER:
				return createAnalyzerFromString(eDataType, initialValue);
			case LucenePackage.TERM:
				return createTermFromString(eDataType, initialValue);
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
			case LucenePackage.INDEX_WRITER:
				return convertIndexWriterToString(eDataType, instanceValue);
			case LucenePackage.INDEX_READER:
				return convertIndexReaderToString(eDataType, instanceValue);
			case LucenePackage.RAM_DIRECTORY:
				return convertRAMDirectoryToString(eDataType, instanceValue);
			case LucenePackage.ANALYZER:
				return convertAnalyzerToString(eDataType, instanceValue);
			case LucenePackage.TERM:
				return convertTermToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuceneMemoryIndex createLuceneMemoryIndex() {
		LuceneMemoryIndexImpl luceneMemoryIndex = new LuceneMemoryIndexImpl();
		return luceneMemoryIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexWriter createIndexWriterFromString(EDataType eDataType, String initialValue) {
		return (IndexWriter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexWriterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexReader createIndexReaderFromString(EDataType eDataType, String initialValue) {
		return (IndexReader)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndexReaderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMDirectory createRAMDirectoryFromString(EDataType eDataType, String initialValue) {
		return (RAMDirectory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRAMDirectoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyzer createAnalyzerFromString(EDataType eDataType, String initialValue) {
		return (Analyzer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnalyzerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTermFromString(EDataType eDataType, String initialValue) {
		return (Term)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LucenePackage getLucenePackage() {
		return (LucenePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LucenePackage getPackage() {
		return LucenePackage.eINSTANCE;
	}

} //LuceneFactoryImpl
