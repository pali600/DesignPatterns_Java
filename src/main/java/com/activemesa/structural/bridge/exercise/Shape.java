package com.activemesa.structural.bridge.exercise;

public abstract class Shape {

	private Render render;

	public Shape( Render render ) {
		this.render = render;
	}

	public String toString() {
		return String.format( "Drawing %s as %s", getName(), render.whatToRenderAs() );
	}

	public abstract String getName();
}
