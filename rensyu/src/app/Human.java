package app;

import java.util.List;

public abstract class Human {
	private String name;
	private int hp;
	private int attackHp;
	public static final int MAX_HP = 100;
	
	public Human() {
		this("人間");
	}
	public Human(String name) {
		this(name, MAX_HP, 10);
	}
	public Human(String name, int hp, int attackHp) {
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
	
	public void attack(Monster m) {
		System.out.print(m.getName() + " ==> ");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int)(Math.random() * (this.attackHp + 1));
		System.out.println(m.getName() + " ");
		for (int i = 0; i <= damage; i++) {
			System.out.print("X");
		}
		System.out.println(" " + damage);
		m.setHp(m.getHp() - damage);
	}
	
	public void attack(List<Monster> mList) {
		if (this.hp <= 0) { return; }
		int num = (int)(Math.random() * mList.size());
		if (mList.get(num).getHp() <= 0) { return; }
		System.out.print(this.name + " ==> " + mList.get(num).getName() + " ");
		int damage = (int)(Math.random() * (this.attackHp + 1));
		System.out.print(" " + damage + " ");
		mList.get(num).setHp(mList.get(num).getHp() - damage);
		int enemyHp = mList.get(num).getHp() / 10;
		if (enemyHp > 0) {
			for (int i=0; i <= enemyHp ; i++) {
				System.out.print("*");
			}
		}
		System.out.println();
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
