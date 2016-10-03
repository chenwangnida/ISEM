package de.dfki.s2m2.service.pddl;

public class Negation extends PDDLExpression {

	protected PDDLExpression	expression;
	
	public Negation(PDDLExpression expression) {
		this.expression	= expression;
	}
	
	public PDDLExpression getBasicExpression() {
		return expression;
	}
	
	@Override
	public boolean isCNF() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "(not " + expression.toString() + ")";
	}
}
