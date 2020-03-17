package org.mydigitalschool.tdd.chess.game;

import java.time.LocalDateTime;

public class Engine {
	
	private LocalDateTime startTime;
	
	private Player player1;
	private Player player2;
	
	public Engine() {
		this.startTime = LocalDateTime.now();
		
		Color firstPlayerColor = Color.getRandomColor();
		this.player1 = new Player(firstPlayerColor);
		this.player2 = new Player(Color.getOtherColor(firstPlayerColor));
	}
	
	public LocalDateTime getStartTime() {
		return this.startTime;
	}
	
	public void setLocalDateTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
}
