package de.dfki.s2m2.service.pddl;

import java.util.HashSet;
import java.util.Set;

public class Disjunction extends PDDLExpression {

	protected Set<PDDLExpression>		basicExpressions;
	
	public Disjunction(Set<PDDLExpression> basicExpressions) {
		this.basicExpressions	= basicExpressions;
	}
	
	public Disjunction(PDDLExpression expression1, PDDLExpression expression2) {
		this.basicExpressions	= new HashSet<PDDLExpression>();
		this.basicExpressions.add(expression1);
		this.basicExpressions.add(expression2);
	}
	
	@Override
	public boolean isCNF() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		String str = "(or";
		for(PDDLExpression expr : basicExpressions)
			str += " " + expr.toString();
		return str + ")";
	}
}
