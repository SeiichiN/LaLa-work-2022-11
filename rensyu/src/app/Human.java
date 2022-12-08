package app;

import java.util.List;

public abstract class Human {
	private String name;
	private int hp;
	private int attackHp;
	
	public Human() {
		this("人間");
	}
	public Human(String name) {
		this(name, 100, 10);
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
		System.out.println(m.getName() + "を攻撃します。");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int)(Math.random() * (this.attackHp + 1));
		System.out.println(m.getName() + "に" 
		  + damage + "のダメージを与えた。");
		m.setHp(m.getHp() - damage);
	}
	
	public void attack(List<Monster> mList) {
		if (this.hp <= 0) { return; }
		int num = (int)(Math.random() * mList.size());
		System.out.println(this.name + "が" + mList.get(num).getName() + "を攻撃");
		int damage = (int)(Math.random() * (this.attackHp + 1));
		System.out.println(mList.get(num).getName() + "に" 
				  + damage + "のダメージを与えた。");
		mList.get(num).setHp(mList.get(num).getHp() - damage);
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
