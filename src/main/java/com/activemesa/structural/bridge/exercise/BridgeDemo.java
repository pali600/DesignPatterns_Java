package com.activemesa.structural.bridge.exercise;

public class BridgeDemo {

	public static void main( String[] args ) {
		print( new Triangle( new RasterRenderer() ) );
		print( new Triangle( new VectorRenderer() ) );
		print( new Square( new RasterRenderer() ) );
		print( new Square( new VectorRenderer() ) );
		print( new RasterTriangle() );
		print( new RasterSquare() );
		print( new VectorTriangle() );
		print( new VectorSquare() );
	}

	public static void print( Shape shape ) {
		System.out.println( shape );
	}

}
