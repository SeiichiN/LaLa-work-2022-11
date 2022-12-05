package human;

import base.Character;
import monster.Monster;

public abstract class Human extends Character {
	public Human(String name, int hp) {
		super(name, hp);
	}
	
	public void attack(Monster m) {
		System.out.println(this.getName() + "は" + m.getName() + "を攻撃した");
		int damage = (int)(Math.random() * this.getAttackHp());
		m.setHp(m.getHp() - damage);
		System.out.println(m.getName() + "に" + damage + "ポイントのダメージを与えた");
	}
}
