package app;

import java.util.Random;

public class Com extends Player {
	
	public Com() {
		this("コム");
		// this.name = "コム";
	}
	public Com(String name) {
		this.name = name;
	}
	public void nextHand() {
		this.hand = new Random().nextInt(3);
	}

}
