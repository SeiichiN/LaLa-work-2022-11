package p387;

import world.Matango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		sh.fly();
		sh.attack(m);

	}

}
