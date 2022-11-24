package p356;

import world.Hero;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.hp);
		
		Hero h2 = new Hero("アサカ");
		
		Wizard w = new Wizard("スガワラ");
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

	}

}
