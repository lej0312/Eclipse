package com.day07;

//p298
public class Player {
	private PlayerLevel level;
	
	public Player() {
		level=new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getlLevel() {
		return level;
	}
	public void upgreadLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
