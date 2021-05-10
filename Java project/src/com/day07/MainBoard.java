package com.day07;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgreadLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgreadLevel(sLevel);
		player.play(3);
	}

}
