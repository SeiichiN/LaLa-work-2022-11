package app;

public class Hero {
	private String name;
	private int hp;
	private int attackHp;
	
	public void attack(Monster m) {
		System.out.println(m.getName() + "を攻撃します。");
		// int damage = new Random().nextInt(this.attackHp + 1);
		int damage = (int)(Math.random() * (this.attackHp + 1));
		
//		モンスターのhpポイントを、その攻撃ポイント分減らす。
//		「<モンスターの名前>に<攻撃ポイント>のダメージを与えた。」と表示する。		
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
