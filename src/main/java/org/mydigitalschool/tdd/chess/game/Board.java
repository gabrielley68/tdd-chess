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
			piece.setyIdx(y);
			piece.setxIdx(x);
		} catch (IndexOutOfBoundsException error) {
			throw new OutOfBoardException("Coordonn�es en dehors du tableau");
		}
	}
	
	public void removePiece(int y, int x) throws OutOfBoardException {
		try {
			this.board[y][x] = null;
		} catch (IndexOutOfBoundsException error) {
			throw new OutOfBoardException("Coordonnées en dehors du tableau");
		}
	}
	
	public void initPieces(Player player1, Player player2) {
		try {
			setPiece(0, 0, new Rook(player1));
			setPiece(0, 1, new Rider(player1));
			setPiece(0, 2, new Bishop(player1));
			setPiece(0, 3, new King(player1));
			setPiece(0, 4, new Queen(player1));
			setPiece(0, 5, new Bishop(player1));
			setPiece(0, 6, new Rider(player1));
			setPiece(0, 7, new Rook(player1));
			
			setPiece(7, 0, new Rook(player2));
			setPiece(7, 1, new Rider(player2));
			setPiece(7, 2, new Bishop(player2));
			setPiece(7, 3, new Queen(player2));
			setPiece(7, 4, new King(player2));
			setPiece(7, 5, new Bishop(player2));
			setPiece(7, 6, new Rider(player2));
			setPiece(7, 7, new Rook(player2));
			
			for (int x = 0; x < this.board[1].length; x++) {
				setPiece(1, x, new Pawn(player1));
				setPiece(6, x, new Pawn(player2));
			}
		} catch (OutOfBoardException e) {
			System.err.println(e);
			System.exit(1);
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
	
	public Piece getPiece(int y, int x) throws OutOfBoardException {
		try {
			return this.board[y][x];
		} catch (IndexOutOfBoundsException e) {
			throw new OutOfBoardException("Coordonnées en dehors du tableau");
		}
	}
	
	public Piece[][] getBoard(){
		return this.board;
	}
	
	public void setBoard(Piece[][] board) {
		this.board = board;
	}

}