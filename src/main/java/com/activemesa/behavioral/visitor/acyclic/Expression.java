package com.activemesa.behavioral.visitor.acyclic;

public abstract class Expression {
	// optional
	public void accept( Visitor visitor ) {
		if ( visitor instanceof ExpressionVisitor ) {
			((ExpressionVisitor) visitor).visit( this );
		}
	}
}
