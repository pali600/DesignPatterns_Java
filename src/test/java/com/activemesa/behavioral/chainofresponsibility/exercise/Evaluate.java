package com.activemesa.behavioral.chainofresponsibility.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Evaluate {
	@Test
	public void manyGoblinsTest() {
		Game game = new Game();
		Goblin goblin = new Goblin( game );
		game.creatures.add( goblin );
		System.out.println( goblin );

		assertEquals( 1, goblin.getAttack() );
		assertEquals( 1, goblin.getDefense() );

		Goblin goblin2 = new Goblin( game );
		game.creatures.add( goblin2 );
		System.out.println( goblin2 );

		assertEquals( 1, goblin.getAttack() );
		assertEquals( 2, goblin.getDefense() );

		GoblinKing goblin3 = new GoblinKing( game );
		game.creatures.add( goblin3 );
		System.out.println( goblin3 );

		assertEquals( 2, goblin.getAttack() );
		assertEquals( 3, goblin.getDefense() );

		Goblin goblin4 = new Goblin( game );
		game.creatures.add( goblin4 );
		System.out.println( goblin4 );

		assertEquals( 2, goblin.getAttack() );
		assertEquals( 4, goblin.getDefense() );

		Goblin goblin5 = new GoblinKing( game );
		game.creatures.add( goblin5 );
		System.out.println( goblin5 );

		assertEquals( 3, goblin.getAttack() );
		assertEquals( 5, goblin.getDefense() );
	}
}
