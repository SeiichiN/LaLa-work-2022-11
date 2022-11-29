package world;

public class Wizard extends Character {
	public int mp = 20;
	
	public Wizard() {
		super("ななしの助", 50);
	}

	public Wizard(String name) {
		super(name, 50);
	}
	@Override
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;		
	}
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った!");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
	public void heal(Hero hero) {
		hero.hp += 10;
		System.out.println(hero.name + "のHPを10回復した");
	}


}
