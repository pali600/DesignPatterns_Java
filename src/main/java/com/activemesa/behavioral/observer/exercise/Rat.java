package com.activemesa.behavioral.observer.exercise;

import java.io.Closeable;
import java.io.IOException;

public class Rat implements Closeable {

	private Game game;
	public int attack = 1;

	public Rat( Game game ) {
		this.game = game;
		game.increase( this );
	}

	@Override
	public void close() throws IOException {
		game.decrease( this );
	}
}
