package com.activemesa.behavioral.visitor.exercise;

public abstract class ExpressionVisitor {
	abstract void visit( Value value );

	abstract void visit( AdditionExpression ae );

	abstract void visit( MultiplicationExpression me );
}
