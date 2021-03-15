package com.activemesa.behavioral.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public List<Rat> rats = new ArrayList<>();

	public void increase( Rat rat ) {
		rats.add( rat );
		rats.stream().forEach( r -> r.attack = rats.size() );
	}

	public void decrease( Rat rat ) {
		rats.forEach( r -> --r.attack );
		rats.remove( rat );
	}
}
