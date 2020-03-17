package org.mydigitalschool.tdd.chess.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {
	
	
	@Test
	public void testGetOtherColorWithBlackColor() {
		assertEquals(Color.getOtherColor(Color.BLACK), Color.WHITE);
	}
	
	@Test
	public void testGetOtherColorWithWhiteColor() {
		assertEquals(Color.getOtherColor(Color.WHITE), Color.BLACK);
	}
}
