package org.mydigitalschool.tdd.chess.game.pieces;

public class Pawn extends Piece {
	public String toString() {
		return "6";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
