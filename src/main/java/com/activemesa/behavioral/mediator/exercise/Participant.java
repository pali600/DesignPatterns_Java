package com.activemesa.behavioral.mediator.exercise;

public class Participant {

	public int value = 0;
	private Mediator mediator;

	public Participant( Mediator mediator ) {
		this.mediator = mediator;
		mediator.addListener( this );
	}

	public void say( int n ) {
		mediator.broadcast( this, n );
	}

	public void notify( Object sender, int n ) {
		if ( sender != this ) {
			value += n;
		}
	}

}
