package com.activemesa.structural.decorator;

public class Demo {
	public static void main( String[] args ) {
		MagicString s = new MagicString( "hello" );
		System.out.println( s + " has "
				+ s.getNumberOfVowels() + " vowels" );
	}
}
