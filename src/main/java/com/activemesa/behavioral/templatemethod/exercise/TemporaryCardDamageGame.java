package com.activemesa.behavioral.templatemethod.exercise;

public class TemporaryCardDamageGame extends CardGame {

	public TemporaryCardDamageGame( Creature[] creatures ) {
		super( creatures );
	}

	@Override
	protected void hit( Creature attacker, Creature other ) {
		int tempHealth = other.health;
		for ( int i = 0; i < creatures.length; i++ ) {
			if ( creatures[ i ] == other ) {
				other.health -= attacker.attack;
			}
		}
	}
}
