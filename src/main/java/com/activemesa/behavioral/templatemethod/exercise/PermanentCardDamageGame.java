package com.activemesa.behavioral.templatemethod.exercise;

public class PermanentCardDamageGame extends CardGame {

	public PermanentCardDamageGame( Creature[] creatures ) {
		super( creatures );
	}

	@Override
	protected void hit( Creature attacker, Creature other ) {
		for ( int i = 0; i < creatures.length; i++ ) {
			if ( creatures[ i ] == other ) {
				other.health -= attacker.attack;
				creatures[ i ] = other;
			}
		}
	}

}
