package com.activemesa.structural.bridge.exercise;

public class Triangle extends Shape {

	public Triangle( Render render ) {
		super( render );
	}

	@Override
	public String getName() {
		return "Triangle";
	}
}
