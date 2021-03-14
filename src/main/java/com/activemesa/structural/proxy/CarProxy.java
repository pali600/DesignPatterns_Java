package com.activemesa.structural.proxy;

public class CarProxy extends Car {
	private Driver driver;

	public CarProxy( Driver driver ) {
		super( driver );
		this.driver = driver;
	}

	@Override
	public void drive() {
		if ( driver.age >= 17 ) {
			super.drive();
		} else {
			System.out.println( "Driver too young" );
		}
	}
}
