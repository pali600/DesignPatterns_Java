package com.activemesa.behavioral.chainofresponsibility.exercise;

public class GoblinKing extends Goblin {

	public GoblinKing( Game game ) {
		super( game );
	}

	@Override
	public int getAttack() {
		int baseAttack = 3;
		for ( Creature creature : game.creatures ) {
			if ( creature != this && creature instanceof GoblinKing ) {
				baseAttack++;
			}
		}
		return baseAttack;
	}

	@Override
	public int getDefense() {
		int baseDefense = 3;
		for ( Creature creature : game.creatures ) {
			if ( creature != this && creature instanceof GoblinKing ) {
				baseDefense++;
			}
		}
		return baseDefense;
	}

	@Override
	public String toString() {
		return "GoblinKing {" +
				"attack=" + getAttack() + // !!!
				", defense=" + getDefense() +
				'}';
	}

}
