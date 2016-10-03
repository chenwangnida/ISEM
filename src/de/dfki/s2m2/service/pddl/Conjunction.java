package de.dfki.s2m2.service.pddl;

import java.util.HashSet;
import java.util.Set;

public class Conjunction extends PDDLExpression {

	protected Set<PDDLExpression>		basicExpressions;
	
	public Conjunction(Set<PDDLExpression> basicExpressions) {
		this.basicExpressions	= basicExpressions;
	}
	
	public Conjunction(PDDLExpression expression1, PDDLExpression expression2) {
		this.basicExpressions	= new HashSet<PDDLExpression>();
		this.basicExpressions.add(expression1);
		this.basicExpressions.add(expression2);
	}
	
	/**
	 * @return the basicExpressions
	 */
	public Set<PDDLExpression> getBasicExpressions() {
		return basicExpressions;
	}
	
	@Override
	public boolean isCNF() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		String str = "(and";
		for(PDDLExpression expr : basicExpressions)
			str += " " + expr.toString();
		return str + ")";
	}
}
