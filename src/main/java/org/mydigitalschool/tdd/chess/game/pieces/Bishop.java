package org.mydigitalschool.tdd.chess.game.pieces;

public class Bishop extends Piece {
	public String toString() {
		return "3";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
