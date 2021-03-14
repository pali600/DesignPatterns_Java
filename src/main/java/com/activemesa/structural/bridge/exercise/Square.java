package com.activemesa.structural.bridge.exercise;

public class Square extends Shape {

	public Square( Render render ) {
		super( render );
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
