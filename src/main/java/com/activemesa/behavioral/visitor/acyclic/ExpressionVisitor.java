package com.activemesa.behavioral.visitor.acyclic;

public interface ExpressionVisitor extends Visitor {
	void visit( Expression obj );
}
