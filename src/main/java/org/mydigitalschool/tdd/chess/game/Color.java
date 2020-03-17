package org.mydigitalschool.tdd.chess.game;

import java.util.Random;

public enum Color {
	BLACK,
	WHITE;
	
	public static Color getRandomColor() {
		Random random = new Random();
		return values()[random.nextInt(2)];
	}
	
	public static Color getOtherColor(Color color) {
		Color[] colors = values();
		return colors[0] == color ? colors[1] : colors[0];
	}
}
