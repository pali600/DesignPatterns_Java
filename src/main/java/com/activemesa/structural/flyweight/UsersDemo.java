package com.activemesa.structural.flyweight;

public class UsersDemo {
	public static void main( String[] args ) {
		User user = new User( "John Smith" );
		User user1 = new User( "Jane Smith" );

		// have "Smith" in common
		User2 user2 = new User2( "John Smith John" );
		System.out.println( user2.getFullName() );
	}
}
