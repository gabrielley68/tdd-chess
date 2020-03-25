package org.mydigitalschool.tdd.chess.game;

import org.mydigitalschool.tdd.chess.game.pieces.Piece;

//Test
public class Board {

	private Piece board[][];
	
	// constructor
	public Board() {
		board = new Piece[8][8];
	}
	
	//Affectation de pièces au tableau
	public void setPiece(int x, int y, Piece piece) {
		board[x][y] = piece;
		//if(l >= 8 || c >= 8) {
			//board.msgErreur();
		//}
	}
	
	//public void msgErreur() {
		//System.out.println("Impossible de faire ceci!");
	//}
	
	public String toString() {
		return "TO IMPLEMENT";
	}
	
	
	
}