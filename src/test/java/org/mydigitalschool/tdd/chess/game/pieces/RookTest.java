package org.mydigitalschool.tdd.chess.game.pieces;

import org.junit.Test;
import org.mydigitalschool.tdd.chess.game.Board;
import org.mydigitalschool.tdd.chess.game.OutOfBoardException;

import static org.junit.Assert.*;

public class RookTest {

	@Test
	public void testHorizontalMovement() throws OutOfBoardException {
		Board board = new Board();
		Piece rook = new Rook();
		board.setPiece(2, 3, rook);
		rook.isMovementPossible(2, 5);
		assertTrue(rook.isMovementPossible(2, 5));
	}
	
	@Test
	public void testVerticalMovement() throws OutOfBoardException {
		Board board = new Board();
		Piece rook = new Rook();
		board.setPiece(5, 4, rook);
		rook.isMovementPossible(5,4);
		assertTrue(rook.isMovementPossible(5, 4));
	}
	
	@Test
	public void testDiagonalMovement() throws OutOfBoardException {
		
	}
}
