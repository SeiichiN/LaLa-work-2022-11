package app;

import java.util.Random;

public class Com extends Player {
	
	public Com() {
		this("コム");
	}
	public Com(String name) {
		super(name);
	}
	@Override
	public void nextHand() {
		int hnd = new Random().nextInt(3);
		this.setHand(hnd);
	}

}
