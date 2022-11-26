package v2;

import java.util.Random;

public class RandomNextHand implements NextHandInterface {

	@Override
	public int nextHand() {
		int hand = new Random().nextInt(3);
		return hand;
	}

}
