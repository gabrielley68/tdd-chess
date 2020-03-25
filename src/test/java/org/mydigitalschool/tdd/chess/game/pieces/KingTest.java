package org.mydigitalschool.tdd.chess.game.pieces;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KingTest {
	@Test
	public void testPossibleMovement() {
		King king = new King();
		king.setxIdx(1);
		king.setyIdx(1);
		assertTrue(king.isMovementPossible(2, 2));
	}
	
	@Test
	public void testImpossibleMovement() {
		King king = new King();
		king.setxIdx(1);
		king.setyIdx(1);
		assertFalse(king.isMovementPossible(3, 2));
	}
}
