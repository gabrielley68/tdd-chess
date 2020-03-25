package org.mydigitalschool.tdd.chess.game.pieces;

import org.junit.Test;
import static org.junit.Assert.*;

public class PawnTest {
	
	@Test
	public void testPossibleMovement() {
		Pawn pawn = new Pawn();
		pawn.setxIdx(1);
		pawn.setyIdx(1);
		assertTrue(pawn.isMovementPossible(2, 2));
	}
	
	@Test
	public void testImpossibleMovement() {
		Pawn pawn = new Pawn();
		pawn.setxIdx(1);
		pawn.setyIdx(1);
		assertFalse(pawn.isMovementPossible(3, 2));
	}
}
