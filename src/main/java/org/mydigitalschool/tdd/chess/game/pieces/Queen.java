package org.mydigitalschool.tdd.chess.game.pieces;

public class Queen extends Piece {
	public String toString() {
		return "2";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
