package com.activemesa.behavioral.visitor.acyclic;

public interface AdditionExpressionVisitor extends Visitor {
	void visit( AdditionExpression obj );
}
