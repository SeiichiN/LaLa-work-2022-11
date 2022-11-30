package p433;

import world.DeathBat;
import world.Goblin;
import world.Werewolf;

public class Main {

	public static void main(String[] args) {
		Goblin g = new Goblin();
		g.attack();
		g.run();
		
		Werewolf w = new Werewolf();
		w.attack();
		w.run();
		
		DeathBat d = new DeathBat();
		d.attack();
		d.run();
	}

}
