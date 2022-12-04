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
	
	public void attack(Monster m) {
		System.out.println(this.getName() + "は" + m.getName() + "を攻撃した");
		m.setHp(m.getHp() - this.getAttackHp());
		System.out.println(m.getName() + "に" + this.getAttackHp() + "ポイントのダメージを与えた");
	}
	
	public void attack(Human h) {
		System.out.println(this.getName() + "は" + h.getName() + "を攻撃した");
		h.setHp(h.getHp() - this.getAttackHp());
		System.out.println(h.getName() + "に" + this.getAttackHp() + "ポイントのダメージを与えた");
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
