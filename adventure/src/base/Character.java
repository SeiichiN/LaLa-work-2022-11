package base;

import monster.Monster;

public abstract class Character {
	String name;
	int hp;
	int attackHp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack(Monster m) {
		System.out.println(this.getName() + "は" + m.getName() + "を攻撃した");
		m.setHp(m.getHp() - this.attackHp);
		System.out.println(m.getName() + "に" + this.attackHp + "ポイントのダメージを与えた");
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
	
}
