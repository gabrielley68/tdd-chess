package org.mydigitalschool.tdd.chess.game.pieces;

import org.mydigitalschool.tdd.chess.game.Player;

public abstract class Piece {
	private int xIdx;
	private int yIdx;
	private Player player;
	
	public Piece() { }
	
	public Piece(Player player) {
		this.player = player;
	}
	
	public abstract boolean isMovementPossible(int y, int x);
	
	public abstract String toString();
	
	public int getxIdx() {
		return xIdx;
	}

	public void setxIdx(int xIdx) {
		this.xIdx = xIdx;
	}

	public int getyIdx() {
		return yIdx;
	}

	public void setyIdx(int yIdx) {
		this.yIdx = yIdx;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
