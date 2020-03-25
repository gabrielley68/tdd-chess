package org.mydigitalschool.tdd.chess.game.pieces;

public class King extends Piece {
	public String toString() {
		return "1";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
