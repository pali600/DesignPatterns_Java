package com.activemesa.behavioral.mediator.rx;

public class FootballCoach {
	public FootballCoach( EventBroker broker ) {
		broker.subscribe( i -> {
			System.out.println( "Hey, you scored " + i + " goals!" );
		} );
	}
}
