package org.mydigitalschool.tdd.chess.game;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EngineTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStream() {
		System.setOut(originalOut);
	}
	
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
	
	/**
	 * Assert that two players doesn't have the same color on creation
	 */
	@Test
	public void playerColorDifferent() {
		Engine engine = new Engine();
		assertNotEquals(engine.getPlayer1().getColor(), engine.getPlayer2().getColor());
	}

	/**
	 * Assert that the two players doesn't have the same color on creation
	 * multiple times because of the randomness
	 */
	@Test
	public void playerColorDifferentMultipleTimes() {
		for (int i = 0; i < 10; i++) {
			this.playerColorDifferent();
		}
	}
	
	@Test
	public void displayBoardOnInit() {
		Engine engine = new Engine();
		
		assertEquals(engine.getBoard().toString(), outContent.toString());
	}
	

}
