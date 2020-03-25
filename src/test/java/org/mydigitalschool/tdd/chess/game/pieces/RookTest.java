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
		assertTrue(rook.isMovementPossible(2, 5));
	}
	
	public void testVerticalMovement() throws OutOfBoardException {
		Piece rook = new Rook();
		rook.setxIdx(2);
		rook.setyIdx(3);
		assertTrue(rook.isMovementPossible(5, 3));
	}
	
	@Test
	public void testSamePosition() throws OutOfBoardException {
		Board board = new Board();
		Piece rook = new Rook();
		board.setPiece(5, 4, rook);
		assertFalse(rook.isMovementPossible(5, 4));
	}
	
	@Test
	public void testDiagonalMovement() throws OutOfBoardException {
		Board board = new Board();
		Piece rook = new Rook();
		board.setPiece(2, 3, rook);
		assertFalse(rook.isMovementPossible(3, 4));
	}
}
