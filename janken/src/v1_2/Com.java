package v1_2;

import java.util.Random;

public class Com extends Player {

	public Com() {
		super("コム");
	}
	public Com(String name) {
		super(name);
	}
	@Override
	public void nextHand() {
		this.hand = new Random().nextInt(3);
	}
}
