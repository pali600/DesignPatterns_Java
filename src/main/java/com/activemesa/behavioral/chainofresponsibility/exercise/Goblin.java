package com.activemesa.behavioral.chainofresponsibility.exercise;

public class Goblin extends Creature {

	public Goblin( Game game ) {
		super( game );
	}

	@Override
	public int getAttack() {
		int baseAttack = 1;
		for ( Creature creature : game.creatures ) {
			if ( creature != this && creature instanceof GoblinKing ) {
				baseAttack++;
			}
		}
		return baseAttack;
	}

	@Override
	public int getDefense() {
		int baseDefense = 1;
		for ( Creature creature : game.creatures ) {
			if ( creature != this && creature instanceof Goblin || creature instanceof GoblinKing ) {
				baseDefense++;
			}
		}
		return baseDefense;
	}

	@Override
	public String toString() {
		return "Goblin{" +
				"attack=" + getAttack() + // !!!
				", defense=" + getDefense() +
				'}';
	}
}
