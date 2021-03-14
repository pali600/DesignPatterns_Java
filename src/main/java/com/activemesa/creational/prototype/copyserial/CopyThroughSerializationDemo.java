package com.activemesa.creational.prototype.copyserial;

import org.apache.commons.lang3.SerializationUtils;

class CopyThroughSerializationDemo {
	public static void main( String[] args ) {
		Foo foo = new Foo( 42, "life" );
		// use apache commons!
		Foo foo2 = SerializationUtils.roundtrip( foo );

		foo2.whatever = "xyz";

		System.out.println( foo );
		System.out.println( foo2 );
	}
}