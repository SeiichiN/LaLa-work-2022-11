package game;

import monster.Monster;

public class Cell {
	Monster monster;
	int gold;
	boolean isMonster;
	
	public Cell() {
		this(null, 0, false);
	}
	public Cell(Monster m,  int g, boolean b) {
		this.monster = m;
		this.gold = g;
		this.isMonster = b;
	}
	
	public String toString() {
		return monster.toString();
	}
	public Monster getMonster() {
		return monster;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public boolean isMonster() {
		return isMonster;
	}
	public void setMonster(boolean isMonster) {
		this.isMonster = isMonster;
	}
	
}
