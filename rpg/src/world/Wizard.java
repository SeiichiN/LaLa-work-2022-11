package world;

public class Wizard {
	public String name;
	public int hp;

	public Wizard(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public void heal(Hero hero) {
		hero.hp += 10;
		System.out.println(hero.name + "のHPを10回復した");
	}

}
