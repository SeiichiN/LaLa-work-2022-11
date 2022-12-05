package base;

import human.Human;
import monster.Monster;

public abstract class Character {
	private String name;
	private int hp;
	private int attackHp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void status() {
		System.out.println(getName() + " HP:" + getHp());
	}
	
	public String toString() {
		return this.name + ":" + this.hp + ":" + this.attackHp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackHp() {
		return attackHp;
	}

	public void setAttackHp(int attackHp) {
		this.attackHp = attackHp;
	}
	
}
