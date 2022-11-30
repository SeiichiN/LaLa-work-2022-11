package p471;

import world.Character;
import world.Hero;
import world.Matango;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		// Wizard w = new Wizard();
		Character c = new Wizard();
		if (c instanceof Hero) {
			Hero h = (Hero) c;
			Matango m = new Matango('A');
			h.name = "アサカ";
			h.attack(m);
		} else {
			System.out.println("cはWizardですよ");
		}
		// h.fireball(m);
	}

}
