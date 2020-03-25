package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class Rook extends Piece {

	public Rook() {}

	public Rook(Player player) {
		super(player);
	}

	public String toString() {
		return "5";
	}
	
	public boolean isMovementPossible(int y, int x) {
		return true;
	}
}
