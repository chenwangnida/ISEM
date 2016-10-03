package de.dfki.s2m2.service.pddl;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import de.dfki.pddxml.relaxer.Precondition;
import de.dfki.s2m2.service.SpecificationParsingException;

public class PDDXMLExpression extends PDDLExpression {
	
	public static PDDLExpression create(String exprString) throws SpecificationParsingException {
		try {
			StringReader reader = new StringReader(exprString);
			Precondition expression = new Precondition(reader);
			StringBuffer buffer = new StringBuffer();
			expression.makePddlElement(buffer);
			reader.close();
			return PDDLExpression.create(buffer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new SpecificationParsingException(e);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			throw new SpecificationParsingException(e);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			throw new SpecificationParsingException(e);
		}
	}
	
	@Override
	public boolean isCNF() {
		// TODO Auto-generated method stub
		return false;
	}
}
