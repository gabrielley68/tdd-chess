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
	
	@Test
	public void testDisplayInitialBoard() {
		Board board = new Board();
		Player player1 = new Player(Color.BLACK);
		Player player2 = new Player(Color.WHITE);
		
		board.initPieces(player1, player2);
		String expectedDisplay = String.join(
			Board.NEW_LINE,
			"  A B C D E F G H",
			"8 5 4 3 1 2 3 4 5",
			"7 6 6 6 6 6 6 6 6",
			"6                ",
			"5                ",
			"4                ",
			"3                ",
			"2 6 6 6 6 6 6 6 6",
			"1 5 4 3 2 1 3 4 5"
		);
		
		assertEquals(expectedDisplay, board.toString());
	}
}
