package p427;

import world.Dancer;
import world.Matango;

public class Main {

	public static void main(String[] args) {
		Dancer d = new Dancer();
		d.name = "アサカ";
		Matango m = new Matango('A');
		d.attack(m);
	}

}
