package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public class Pawn extends Piece {
	
	public Pawn() {}

	public Pawn(Player player) {
		super(player);
	}
	
	public String toString() {
		return "6";
	}
	
	public boolean isMovementPossible(int x, int y) {
		return (
			Math.abs(this.getxIdx() - x) < 2 && Math.abs(this.getyIdx() - y) < 2
		);
				
	}
}
