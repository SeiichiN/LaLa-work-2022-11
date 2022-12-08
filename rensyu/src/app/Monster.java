package app;

public class Monster {
	String name;
	int hp;
	int attackHp;
	
	public Monster() {
		this("モンスター");
	}
	public Monster(String name) {
		this.name = name;
		this.hp = 100;
		this.attackHp = 20;
	}
	
	
	public void attack(Hero h) {
		System.out.println(h.getName() + "を攻撃します。");
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
