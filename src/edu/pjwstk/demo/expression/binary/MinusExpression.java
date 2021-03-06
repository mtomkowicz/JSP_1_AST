package edu.pjwstk.demo.expression.binary;

import edu.pjwstk.demo.expression.Expression;
import edu.pjwstk.jps.ast.binary.IMinusExpression;
import edu.pjwstk.jps.visitor.ASTVisitor;

public class MinusExpression extends BinaryExpression implements IMinusExpression {

	public MinusExpression(Expression leftExpr, Expression rightExpr) {
		super(leftExpr, rightExpr);
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visitMinusExpression(this);
	}
}
