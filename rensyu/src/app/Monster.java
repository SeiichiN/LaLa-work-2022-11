package app;

import java.util.List;

public abstract class Monster {
	private String name;
	private int hp;
	private int attackHp;

	public Monster() {
		this("モンスター");
	}

	public Monster(String name) {
		this(name, 100, 20);
	}

	public Monster(String name, int hp, int attackHp) {
		this.name = name;
		this.hp = hp;
		this.attackHp = attackHp;
	}

	public String toString() {
		String hp = "*";
		for (int i = 0; i < this.hp / 10; i++) {
			hp = hp + "*";
		}
		return this.name + ":" + hp;
	}

	public void attack(Hero h) {
		if (this.hp <= 0) {
			return;
		}
		System.out.println(this.name + "が" + h.getName() + "を攻撃。");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int) (Math.random() * (this.attackHp + 1));
		System.out.println(h.getName() + "に" + damage + "のダメージを与えた。");
		h.setHp(h.getHp() - damage);
	}

	public void attack(List<Human> hList) {
		if (this.hp <= 0) { return; }
		int num = (int)(Math.random() * hList.size());
		System.out.println(this.name + "が" + hList.get(num).getName() + "を攻撃");
		int damage = (int)(Math.random() * (this.attackHp + 1));
		System.out.println(hList.get(num).getName() + "に" 
				  + damage + "のダメージを与えた。");
		hList.get(num).setHp(hList.get(num).getHp() - damage);
	}
	
	public void run() {

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
		if (hp <= 0) {
			hp = 0;
			System.out.println(this.getName() + "は倒れた。");
		}
		this.hp = hp;
	}

	public int getAttackHp() {
		return attackHp;
	}

	public void setAttackHp(int attackHp) {
		this.attackHp = attackHp;
	}
}