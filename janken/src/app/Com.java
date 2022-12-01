package app;

import java.util.Random;

public class Com {
	String name;
	int hand;
	String result;
	
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
	public void printResult() {
		System.out.println
		(this.name + "の手は" + this.hand + 
				" 結果:" + this.result);
	}
}
