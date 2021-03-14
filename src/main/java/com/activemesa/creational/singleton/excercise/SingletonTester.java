package com.activemesa.creational.singleton.excercise;

import java.util.function.Supplier;

public class SingletonTester {

	public static boolean isSingleton( Supplier<Object> func ) {
		if ( func == null ) {
			return false;
		}
		Object obj = func.get();
		Object obj2 = func.get();
		if ( obj == null || obj2 == null ) {
			return false;
		}
		if ( obj.hashCode() == obj2.hashCode() ) {
			return true;
		}
		return false;
	}

	public static void main( String[] args ) {
		System.out.println( SingletonTester.isSingleton( null ) );
		System.out.println( SingletonTester.isSingleton( null ) );
		System.out.println( SingletonTester.isSingleton( () -> null ) );
		System.out.println( SingletonTester.isSingleton( () -> Singleton.getInstance() ) );
		System.out.println( SingletonTester.isSingleton( () -> new NotSingleton() ) );
		System.out.println( SingletonTester.isSingleton( () -> TestEnum.INSTANCE ) );
	}
}
