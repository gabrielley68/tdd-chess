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
	public void testSetPieceOutsideBoard() {
		Board board = new Board();
		Piece pawn = new Pawn();
		board.setPiece(-1, 12, pawn);
	}
	
	@Test
	public void testPieceOnChestBoard() {
		
	}
	
}
