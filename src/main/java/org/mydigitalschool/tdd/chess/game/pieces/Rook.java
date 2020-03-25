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
		System.out.println(this.getxIdx());
		System.out.println(this.getyIdx());
		return this.getyIdx() == y ^ this.getxIdx() == x;
	}
}
