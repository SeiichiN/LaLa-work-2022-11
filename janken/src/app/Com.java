package app;

import java.util.Random;

public class Com extends Player {
	
	public Com() {
		this("コム");
	}
	public Com(String name) {
		super(name);
	}
	
	// 乱数で手を決める 
	@Override
	public void nextHand() {
		// hnd -- 0, 1, 2 のどれか
		int hnd = new Random().nextInt(3);
		this.setHand(hnd);
	}

}
