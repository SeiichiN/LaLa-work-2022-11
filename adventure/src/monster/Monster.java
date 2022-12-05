package monster;

import base.Character;
import human.Human;

public abstract class Monster extends Character {
	public Monster(String name, int hp) {
		super(name, hp);
	}

	public void attack(Human h) {
		System.out.println(this.getName() + "は" + h.getName() + "を攻撃した");
		int damage = (int)(Math.random() * this.getAttackHp());
		h.setHp(h.getHp() - damage);
		System.out.println(h.getName() + "に" + damage + "ポイントのダメージを与えた");
	}

}
