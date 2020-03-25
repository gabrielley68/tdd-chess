package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class Bishop extends Piece {
	
	public Bishop() {}
	
	public Bishop(Player player) {
		super(player);
	}

	public String toString() {
		return "3";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return true;
	}
}
