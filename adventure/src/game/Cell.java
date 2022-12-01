package game;

import monster.Monster;

public class Cell {
	Monster monster;
	Character chara1;
	Character chara2;
	int gold;
	boolean isMonster;
	
	public Cell() {}
	
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
	public Character getChara1() {
		return chara1;
	}
	public void setChara1(Character chara1) {
		this.chara1 = chara1;
	}
	public Character getChara2() {
		return chara2;
	}
	public void setChara2(Character chara2) {
		this.chara2 = chara2;
	}
	public boolean isMonster() {
		return isMonster;
	}
	public void setMonster(boolean isMonster) {
		this.isMonster = isMonster;
	}
	
}
