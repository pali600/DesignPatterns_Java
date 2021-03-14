package com.activemesa.creational.singleton.excercise;

public class Singleton {

	private static Singleton INSTANCE;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if ( INSTANCE == null ) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}

	@Override
	public int hashCode() {
		return 42;
	}
}
