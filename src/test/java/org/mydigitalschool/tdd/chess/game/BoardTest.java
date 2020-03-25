package org.mydigitalschool.tdd.chess.game;

import org.junit.Test;
import org.mydigitalschool.tdd.chess.game.pieces.Piece;

import org.mydigitalschool.tdd.chess.game.pieces.Pawn;

import static org.junit.Assert.*;

public class BoardTest {

	@Test
	public void testShowChestBoard() {
		
	}
	
	@Test(expected = OutOfBoardException.class)
	public void testSetPieceOutsideBoard() throws OutOfBoardException {
		Board board = new Board();
		Piece pawn = new Pawn();
		board.setPiece(-1, 12, pawn);
	}
	
	
	@Test
	public void testPieceOnChestBoard() throws OutOfBoardException {
		Board board = new Board();
		Piece pawn = new Pawn();
		board.setPiece(2, 3, pawn);
		assertEquals(pawn, board.getBoard()[2][3]);
	}
	
}
