package de.dfki.s2m2.service.pddl;

import java.util.LinkedList;
import java.util.List;

public class Atom extends PDDLExpression {
	
	protected String		predicate;
	
	protected List<String>	parameters;
	
	public Atom(String predicate, List<String> parameters) {
		this.predicate	= predicate;
		this.parameters	= parameters;
	}
	
	public Atom(String predicate, String parameter) {
		this.predicate	= predicate;
		this.parameters	= new LinkedList<String>();
		this.parameters.add(parameter);
	}
	
	public Atom(String predicate, String firstParameter, String secondParameter) {
		this.predicate	= predicate;
		this.parameters	= new LinkedList<String>();
		this.parameters.add(firstParameter);
		this.parameters.add(secondParameter);
	}
	
	/**
	 * @return the predicate
	 */
	public String getPredicate() {
		return predicate;
	}

	/**
	 * @return the parameters
	 */
	public List<String> getParameters() {
		return parameters;
	}
	
	@Override
	public boolean isCNF() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO is this correct? -> pred(a,b,c)
		String str =  "(" + predicate;
		for(String param : parameters)
			str += " " + param;
		return str + ")";
	}
}
