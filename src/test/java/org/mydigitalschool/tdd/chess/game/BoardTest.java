package org.mydigitalschool.tdd.chess.game;

import org.junit.Test;
import org.mydigitalschool.tdd.chess.game.pieces.Piece;

import org.mydigitalschool.tdd.chess.game.pieces.Pawn;

import static org.junit.Assert.*;

public class BoardTest {
		
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
		board.setPiece(3, 2, pawn);
		assertEquals(pawn, board.getBoard()[3][2]);
	}
	
	@Test
	public void testDisplayEmptyBoard() {
		Board board = new Board();
		String expectedDisplay = String.join(
			Board.NEW_LINE, 
			"  A B C D E F G H",
			"8                ",
			"7                ",
			"6                ",
			"5                ",
			"4                ",
			"3                ",
			"2                ",
			"1                "
		);
			
		assertEquals(expectedDisplay, board.toString());
	}
}
