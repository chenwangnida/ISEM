package de.dfki.s2m2.service;

public class Specification<T extends SpecificationExpression> extends ServiceComponent {

	protected T		expression;
	
	public Specification(String componentType, T expression) {
		super(componentType);
		
		this.expression		= expression;
	}
	
	@Override
	public String toString() {
		return expression.toString();
	}
	
	public String getLanguage() {
		return expression.getLanguage();
	}
	
	public T getExpression() {
		return expression;
	}
}
