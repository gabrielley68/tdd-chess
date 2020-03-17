package org.mydigitalschool.tdd.chess.game;

import java.time.LocalDateTime;

public class Engine {
	
	private LocalDateTime startTime;
	
	public Engine() {
		this.startTime = LocalDateTime.now();
	}
	
	public LocalDateTime getStartTime() {
		return this.startTime;
	}
	
	public void setLocalDateTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
}
