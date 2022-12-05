package app;

import java.util.Scanner;

public class Human extends Player {
	
	public Human() {
		this("あなた");
		// this.name = "コム";
	}
	public Human(String name) {
		this.name = name;
	}
	@Override
	public void nextHand() {
		System.out.print("0:グー 1:チョキ 2:パー > ");
		this.hand = new Scanner(System.in).nextInt();
	}
}
