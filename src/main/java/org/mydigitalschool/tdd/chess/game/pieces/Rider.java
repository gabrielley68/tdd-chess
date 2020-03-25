package org.mydigitalschool.tdd.chess.game.pieces;

public class Rider extends Piece {
	public String toString() {
		return "4";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
