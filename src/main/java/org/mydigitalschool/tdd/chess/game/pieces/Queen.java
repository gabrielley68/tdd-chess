package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class Queen extends Piece {

	public Queen() {}

	public Queen(Player player) {
		super(player);
	}

	public String toString() {
		return "2";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
