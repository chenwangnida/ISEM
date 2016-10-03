/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Vector;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.store.RAMDirectory;
import org.eclipse.emf.ecore.EClass;

import de.dfki.s2m2.filter.textsim.IndexException;
import de.dfki.s2m2.filter.textsim.impl.IndexImpl;
import de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getID <em>ID</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getCONTENT <em>CONTENT</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getLuceneIndex <em>Lucene Index</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getLuceneReader <em>Lucene Reader</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getRamDirectory <em>Ram Directory</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getIdTermTemplate <em>Id Term Template</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.textsim.lucene.impl.LuceneMemoryIndexImpl#getContentTermTemplate <em>Content Term Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LuceneMemoryIndexImpl extends IndexImpl implements LuceneMemoryIndex {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "id";

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCONTENT() <em>CONTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTENT()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = "content";

	/**
	 * The cached value of the '{@link #getCONTENT() <em>CONTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTENT()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuceneIndex() <em>Lucene Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuceneIndex()
	 * @generated
	 * @ordered
	 */
	protected static final IndexWriter LUCENE_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuceneIndex() <em>Lucene Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuceneIndex()
	 * @generated
	 * @ordered
	 */
	protected IndexWriter luceneIndex = LUCENE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuceneReader() <em>Lucene Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuceneReader()
	 * @generated
	 * @ordered
	 */
	protected static final IndexReader LUCENE_READER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuceneReader() <em>Lucene Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuceneReader()
	 * @generated
	 * @ordered
	 */
	protected IndexReader luceneReader = LUCENE_READER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamDirectory() <em>Ram Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final RAMDirectory RAM_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamDirectory() <em>Ram Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamDirectory()
	 * @generated
	 * @ordered
	 */
	protected RAMDirectory ramDirectory = RAM_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalyzer() <em>Analyzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzer()
	 * @generated
	 * @ordered
	 */
	protected static final Analyzer ANALYZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzer()
	 * @generated
	 * @ordered
	 */
	protected Analyzer analyzer = ANALYZER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdTermTemplate() <em>Id Term Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTermTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final Term ID_TERM_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTermTemplate() <em>Id Term Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTermTemplate()
	 * @generated
	 * @ordered
	 */
	protected Term idTermTemplate = ID_TERM_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentTermTemplate() <em>Content Term Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTermTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final Term CONTENT_TERM_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTermTemplate() <em>Content Term Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTermTemplate()
	 * @generated
	 * @ordered
	 */
	protected Term contentTermTemplate = CONTENT_TERM_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LuceneMemoryIndexImpl() {
		super();
		
		try {		
			ramDirectory	= new RAMDirectory();
			
			// create standard analyzer with additional stopwords for OWL syntax
			Vector<String> stopwords = new Vector<String>(Arrays.asList(StandardAnalyzer.STOP_WORDS));
			stopwords.add("subclassof");
			stopwords.add("objectallvaluesfrom");
			stopwords.add("dataallvaluesfrom");
			stopwords.add("objectsomevaluesfrom");
			stopwords.add("datasomevaluesfrom");
			stopwords.add("objectintersectionof");
			stopwords.add("objectunionof");
			stopwords.add("equivalentclasses");
			stopwords.add("disjointclasses");		
			stopwords.add("inverseobjectproperties");
			stopwords.add("transitiveobjectproperty");
			stopwords.add("objectpropertyrange");
			stopwords.add("objectpropertydomain");
			stopwords.add("datapropertydomain");
			stopwords.add("datapropertyrange");
			stopwords.add("objecthasvalue");	
			stopwords.add("datamaxcardinality");
			stopwords.add("datamincardinality");
			stopwords.add("objectmincardinality");
			stopwords.add("objectmaxcardinality");
			stopwords.add("differentindividuals");
			stopwords.add("objectoneof");
			stopwords.add("objectexactcardinality");
			stopwords.add("dataexactcardinality");
			
			// TODO add all relevant stopwords
			analyzer 		= new StandardAnalyzer(stopwords.toArray(new String[0]));	
						
			luceneIndex		= new IndexWriter(ramDirectory, analyzer, true);
			luceneReader	= IndexReader.open(ramDirectory);
			
			// these are re-used to create new terms from the same field to avoid overhead (see Lucene Javadocs)
			idTermTemplate		= new Term(this.id, "");
			contentTermTemplate = new Term(this.content, "");
		}
		catch (CorruptIndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to create term index.", e);
		}
		catch (LockObtainFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to create term index.", e);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unable to create term index.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LucenePackage.Literals.LUCENE_MEMORY_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCONTENT() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexWriter getLuceneIndex() {
		return luceneIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexReader getLuceneReader() {
		return luceneReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RAMDirectory getRamDirectory() {
		return ramDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyzer getAnalyzer() {
		return analyzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getIdTermTemplate() {
		return idTermTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getContentTermTemplate() {
		return contentTermTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDocument(String id, String content) throws IndexException {
		// ignore already known documents
		if(containsDocument(id)) {
			return;
		}
		
		Document document = new Document();
		document.add(new Field(this.id, id, Field.Store.YES, Field.Index.UN_TOKENIZED));
		document.add(new Field(this.content, content, Field.Store.YES, Field.Index.TOKENIZED));
		try {
			luceneIndex.addDocument(document);
			refreshReader();
		}
		catch (CorruptIndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Could not add document " + id + " to term index.", e);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Could not add document " + id + " to term index.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeDocument(String id) throws IndexException {
		try {
			Term term = idTermTemplate.createTerm(id);
			luceneIndex.deleteDocuments(term);
			refreshReader();
			
			// TODO How to check, if a document has been removed from Lucene index?
			return true;
		}
		catch(CorruptIndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Unable to remove document " + id + " from index.", e);
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Unable to remove document " + id + " from index.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean containsDocument(String id) throws IndexException {
		Term term = idTermTemplate.createTerm(id);
		try {
			return (luceneReader.termDocs(term).next());
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Unable to check document containment.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getDocumentFrequency(String queryTerm) throws IndexException {
		try {
			Term term = contentTermTemplate.createTerm(queryTerm);
			return luceneReader.docFreq(term);
		}
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IndexException("Unable to get df for term " + queryTerm + ".", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumberOfDocuments() throws IndexException {
		return luceneReader.numDocs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vector<String> tokenize(String text) throws IndexException {
		try {
			StringReader reader = new StringReader(text);
		
			Vector<String> result = new Vector<String>();
			TokenStream tokenStream = analyzer.reusableTokenStream(this.content, reader);
			
			Token token = tokenStream.next();
			while(token != null) {
				result.add(new String(token.termBuffer(), 0, token.termLength()));
				token = tokenStream.next();
			}
			
			return result;
		}
		catch(IOException e) {
			throw new IndexException("Unable to tokenize text.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LucenePackage.LUCENE_MEMORY_INDEX__ID:
				return getID();
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT:
				return getCONTENT();
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_INDEX:
				return getLuceneIndex();
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_READER:
				return getLuceneReader();
			case LucenePackage.LUCENE_MEMORY_INDEX__RAM_DIRECTORY:
				return getRamDirectory();
			case LucenePackage.LUCENE_MEMORY_INDEX__ANALYZER:
				return getAnalyzer();
			case LucenePackage.LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE:
				return getIdTermTemplate();
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE:
				return getContentTermTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LucenePackage.LUCENE_MEMORY_INDEX__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_INDEX:
				return LUCENE_INDEX_EDEFAULT == null ? luceneIndex != null : !LUCENE_INDEX_EDEFAULT.equals(luceneIndex);
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_READER:
				return LUCENE_READER_EDEFAULT == null ? luceneReader != null : !LUCENE_READER_EDEFAULT.equals(luceneReader);
			case LucenePackage.LUCENE_MEMORY_INDEX__RAM_DIRECTORY:
				return RAM_DIRECTORY_EDEFAULT == null ? ramDirectory != null : !RAM_DIRECTORY_EDEFAULT.equals(ramDirectory);
			case LucenePackage.LUCENE_MEMORY_INDEX__ANALYZER:
				return ANALYZER_EDEFAULT == null ? analyzer != null : !ANALYZER_EDEFAULT.equals(analyzer);
			case LucenePackage.LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE:
				return ID_TERM_TEMPLATE_EDEFAULT == null ? idTermTemplate != null : !ID_TERM_TEMPLATE_EDEFAULT.equals(idTermTemplate);
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE:
				return CONTENT_TERM_TEMPLATE_EDEFAULT == null ? contentTermTemplate != null : !CONTENT_TERM_TEMPLATE_EDEFAULT.equals(contentTermTemplate);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", CONTENT: ");
		result.append(content);
		result.append(", luceneIndex: ");
		result.append(luceneIndex);
		result.append(", luceneReader: ");
		result.append(luceneReader);
		result.append(", ramDirectory: ");
		result.append(ramDirectory);
		result.append(", analyzer: ");
		result.append(analyzer);
		result.append(", idTermTemplate: ");
		result.append(idTermTemplate);
		result.append(", contentTermTemplate: ");
		result.append(contentTermTemplate);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Used internally to refresh the index. If the index structure changes, the writer has to be flushed
	 * and a new reader operating on the current version of the index must be opened.
	 */
	private void refreshReader() {
		try {
			luceneIndex.flush();
			IndexReader newReader = luceneReader.reopen();
			if(newReader != luceneReader) {
				luceneReader.close(); 
			}
			luceneReader = newReader;
		}
		catch(IOException e) {
			// TODO Error handling
			e.printStackTrace();
		}
	}

} //LuceneMemoryIndexImpl
