package org.mydigitalschool.tdd.chess.game;

import org.mydigitalschool.tdd.chess.game.pieces.Piece;

//Test
public class Board {

	private Piece[][] board;
	
	// constructor
	public Board() {
		this.board = new Piece[8][8];
	}
	
	//Affectation de pièces au tableau
	public void setPiece(int x, int y, Piece piece) throws OutOfBoardException {
		try {
			this.board[x][y] = piece;
		} catch (IndexOutOfBoundsException error) {
			throw new OutOfBoardException("Coordonnées en dehors du tableau");
		}	
	}
	
	public String toString() {
		return "TO IMPLEMENT";
	}
	
	public Piece[][] getBoard(){
		return this.board;
	}
	
	public void setBoard(Piece[][] board) {
		this.board = board;
	}

}