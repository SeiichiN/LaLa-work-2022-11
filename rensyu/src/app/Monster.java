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
		System.out.print(this.name + " ==> " + h.getName() + " ");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int) (Math.random() * (this.attackHp + 1));
		for (int i = 0; i <= damage; i++) {
			System.out.print("X");
		}
		System.out.println(" " + damage);
		h.setHp(h.getHp() - damage);
	}

	public void attack(List<Human> hList) {
		if (this.getHp() <= 0) { return; }
		int num = (int)(Math.random() * hList.size());
		int damage = (int)(Math.random() * (this.getAttackHp() + 1));
		int newHp = hList.get(num).getHp() - damage;
		hList.get(num).setHp(newHp);
		
		System.out.print(this.getName() + " ==> ");
		System.out.print(damage + " ");
		System.out.print
		  (hList.get(num).getName() + " ");
		if (hList.get(num).getHp() <= 0) { return; }
		for (int i = 0; i < newHp / 10; i++) {
			System.out.print("*");
		}
		System.out.println();
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
			System.out.println
			  (this.getName() + "は倒れた");
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
