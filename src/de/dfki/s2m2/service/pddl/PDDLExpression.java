package de.dfki.s2m2.service.pddl;

import java.util.HashSet;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import uk.ac.bham.cs.zas.pddl.antlr.PddlLexer;
import uk.ac.bham.cs.zas.pddl.antlr.PddlParser;
import uk.ac.bham.cs.zas.pddl.antlr.PddlParser.goalDesc_return;
import de.dfki.s2m2.service.SpecificationExpression;
import de.dfki.s2m2.service.SpecificationParsingException;

public abstract class PDDLExpression implements SpecificationExpression {
		
	@Override
	public String getLanguage() {
		return "PDDL";
	}
	
	public static PDDLExpression create(String exprString) throws SpecificationParsingException {
		PddlLexer lexer = new PddlLexer(new ANTLRStringStream(exprString));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PddlParser parser = new PddlParser(tokens);
		try {
			goalDesc_return expr = parser.goalDesc();
			CommonTree tree = (CommonTree) expr.getTree();

			return parseTree(tree);
			
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			throw new SpecificationParsingException(e);
		}
	}
	
	private static PDDLExpression parseTree(Tree tree) throws SpecificationParsingException {
		
		switch(tree.getType()) {
			case(PddlParser.PRED_HEAD): {
				LinkedList<String> params = new LinkedList<String>();
				for(int i = 1; i < tree.getChildCount(); i++)
					// substring(1) to remove "?"
					params.add(tree.getChild(i).getText().substring(1));
				return new Atom(tree.getChild(0).getText(), params);
			}

			case(PddlParser.AND_GD): {
				HashSet<PDDLExpression> subExpr = new HashSet<PDDLExpression>();
				for(int i = 0; i < tree.getChildCount(); i++)
					subExpr.add(parseTree(tree.getChild(i)));
				return new Conjunction(subExpr);
			}
				
			case(PddlParser.OR_GD): {
				HashSet<PDDLExpression> subExpr = new HashSet<PDDLExpression>();
				for(int i = 0; i < tree.getChildCount(); i++)
					subExpr.add(parseTree(tree.getChild(i)));
				return new Disjunction(subExpr);
			}
			
			case(PddlParser.NOT_GD): {
				return new Negation(parseTree(tree.getChild(0)));
			}
			
			default: {
				System.out.println("Ingored " + tree.toString());
				throw new SpecificationParsingException("Element not supported: " + tree.getText());
			}
		}
	}
	
	public abstract boolean isCNF();
	
	public static void main(String[] args) {
		
		
//		String exprString = "(and (locatedIn ?Robot ?Room) (carries ?Robot ?Item) (or (not (isUnplugged ?Robot)) (isCharged ?Robot)))";
		String exprString = "<and></and>";
		
		try {
			PDDLExpression pddl = create(exprString);
			
			System.out.println(pddl.toString());
		} 
		catch(SpecificationParsingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}