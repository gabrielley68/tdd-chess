package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class King extends Piece {

	public King() {}

	public King(Player player) {
		super(player);
	}

	public String toString() {
		return "1";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
