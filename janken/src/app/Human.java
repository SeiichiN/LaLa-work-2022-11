package app;

import java.util.Random;

public class Human {
	String name;
	int hand;
	String result;
	
	public Human() {
		this("コム");
		// this.name = "コム";
	}
	public Human(String name) {
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
