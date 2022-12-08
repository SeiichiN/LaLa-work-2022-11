package app;

public class Hero {
	private String name;
	private int hp;
	private int attackHp;
	
	public Hero() {
		this("ヒーロー");
	}
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.attackHp = 20;
	}
	
	public String toString() {
		return this.name + " hp:" + this.hp;
	}
	
	public void attack(Monster m) {
		System.out.println(m.getName() + "を攻撃します。");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int)(Math.random() * (this.attackHp + 1));
		m.setHp(m.getHp() - damage);
		System.out.println(m.getName() + "に" 
		  + damage + "のダメージを与えた。");
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
