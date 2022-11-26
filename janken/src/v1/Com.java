package v1;

import java.util.Random;

public class Com extends Player {
	public Com() {}
	public Com(String name) {
		super(name);
	}

	public int nextHand() {
		int hand = new Random().nextInt(3);
		return hand;
	}
}
