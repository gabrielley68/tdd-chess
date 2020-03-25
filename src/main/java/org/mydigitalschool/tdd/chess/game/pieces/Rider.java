package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class Rider extends Piece {
	
	public Rider() {}

	public Rider(Player player) {
		super(player);
	}

	public String toString() {
		return "4";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
