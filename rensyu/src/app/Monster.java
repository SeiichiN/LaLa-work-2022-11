package app;

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
		return this.name + " hp:" + this.hp;
	}
	
	public void attack(Hero h) {
		if (this.hp <= 0) { return; }
		System.out.println(this.name + "が" + h.getName() + "を攻撃。");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int)(Math.random() * (this.attackHp + 1));
		h.setHp(h.getHp() - damage);
		System.out.println(h.getName() + "に" 
		  + damage + "のダメージを与えた。");
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
		this.hp = hp;
	}

	public int getAttackHp() {
		return attackHp;
	}

	public void setAttackHp(int attackHp) {
		this.attackHp = attackHp;
	}
}
