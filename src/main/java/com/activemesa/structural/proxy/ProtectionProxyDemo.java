package com.activemesa.structural.proxy;

public class ProtectionProxyDemo {
	public static void main( String[] args ) {
		Drivable car = new CarProxy( new Driver( 12 ) ); // 22
		car.drive();
	}
}
