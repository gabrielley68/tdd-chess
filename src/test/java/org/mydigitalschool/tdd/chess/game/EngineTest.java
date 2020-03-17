package org.mydigitalschool.tdd.chess.game;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class EngineTest {
	
	/**
	 * Assert that engine start_time is initialized on creation
	 */
	@Test
	public void testDateOnCreation() {
		LocalDateTime time = LocalDateTime.now();
		Engine engine = new Engine();
		// startTime may be right before time due to execution time
		assertTrue(time.isBefore(engine.getStartTime()) || time.isEqual(engine.getStartTime()));
	}

}
