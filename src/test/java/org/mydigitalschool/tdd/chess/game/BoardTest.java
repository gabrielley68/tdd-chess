package org.mydigitalschool.tdd.chess.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

	@Test
	public void testShowChestBoardWhite() {
		
	}
	
	@Test
	public void testShowChestBoardBlack() {
	}
	
	@Test
	public void testOnePiece() {
		Board board = new Board();
		board.setPiece(1,2,4);
		board.setPiece(1,2,1);
		assertEquals("Impossible de faire ceci!", board.msgErreur);
	}
	
	@Test
	public void testPieceOnChestBoard() {
		
	}
	
}
