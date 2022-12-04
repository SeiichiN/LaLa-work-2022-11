package human;

import monster.Monster;

public class Wizard extends Human {
	public Wizard(String name, int hp) {
		super(name, hp);
		setAttackHp(8);
	}
}
