package com.activemesa.behavioral.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	private List<Participant> listeners = new ArrayList<>();

	public void broadcast( Object sender, int n ) {
		for ( Participant p : listeners ) {
			p.notify( sender, n );
		}
	}

	public void addListener( Participant p ) {
		listeners.add( p );
	}
}
