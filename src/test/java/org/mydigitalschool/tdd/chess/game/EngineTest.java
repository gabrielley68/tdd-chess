package org.mydigitalschool.tdd.chess.game;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class EngineTest {
	
	@Test
	public void testDateOnCreation() {
		LocalDateTime time = LocalDateTime.now();
		Engine engine = new Engine();
		
		assertTrue(time.isBefore(engine.getStartTime()) || time.isEqual(engine.getStartTime()));
	}

}
