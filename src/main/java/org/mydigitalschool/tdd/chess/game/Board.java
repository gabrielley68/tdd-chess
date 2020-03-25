package org.mydigitalschool.tdd.chess.game;

import org.mydigitalschool.tdd.chess.game.pieces.*;

//Test
public class Board {

	private Piece[][] board;
	public static String NEW_LINE = System.getProperty("line.separator");
	
	// constructor
	public Board() {
		this.board = new Piece[8][8];
	}
	
	public void setPiece(int y, int x, Piece piece) throws OutOfBoardException {
		try {
			this.board[y][x] = piece;
		} catch (IndexOutOfBoundsException error) {
			throw new OutOfBoardException("Coordonn�es en dehors du tableau");
		}	
	}
	
	public void initPieces(Player player1, Player player2) {
		this.board[0] = new Piece[] { 
			new Rook(), new Rider(), 
			new Bishop(), new King(),
			new Queen(), new Bishop(),
			new Rider(), new Rook()
		};
		
		this.board[7] = new Piece[] {
			new Rook(), new Rider(),
			new Bishop(), new Queen(),
			new King(), new Bishop(),
			new Rider(), new Rook()
		};
		
		for (int x = 0; x < this.board[1].length; x++) {
			this.board[1][x] = new Pawn();
			this.board[6][x] = new Pawn();
		}
	}
	
	public String toString() {
		// First line
		String representation = "  A B C D E F G H" + NEW_LINE;

		for (int y = 0; y < board.length; y++) {
			representation += this.getLineRepresentation(y);
			if (y != board.length - 1) {
				representation += NEW_LINE;
			}
		}
		return representation;
	}
	
	private String getLineRepresentation(int y) {
		String lineRepresentation = String.valueOf(8 - y);
		
		for (int x = 0; x < this.board[y].length; x++) {
			String pawnRepresentation = " ";
			if (this.board[y][x] != null) {
				pawnRepresentation = this.board[y][x].toString();
			}
			lineRepresentation += " " + pawnRepresentation;
		}
		return lineRepresentation;
	}
	
	public Piece[][] getBoard(){
		return this.board;
	}
	
	public void setBoard(Piece[][] board) {
		this.board = board;
	}

}