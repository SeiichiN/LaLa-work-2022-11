package p307;

import old.Hero;
import old.Matango;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		Matango m1 = new Matango();
		
		System.out.println
		  ("勇者" + h.name + "を生み出しました");
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
