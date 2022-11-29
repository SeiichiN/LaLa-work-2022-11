package chap13;

import world.Matango;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ミナト");
		Inn inn = new Inn();
		inn.checkIn(h);
		Matango m = new Matango('A');
		h.attack(m);
	}

}
