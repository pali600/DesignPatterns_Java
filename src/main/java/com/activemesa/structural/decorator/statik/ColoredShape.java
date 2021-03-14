package com.activemesa.structural.decorator.statik;

import java.util.function.Supplier;

// we are NOT altering the base class of these objects
// cannot make ColoredSquare, ColoredCircle
public class ColoredShape<T extends Shape> implements Shape {
	private Shape shape;
	private String color;

	public ColoredShape( Supplier<? extends T> ctor, String color ) {
		shape = ctor.get();
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " has the color " + color;
	}
}
