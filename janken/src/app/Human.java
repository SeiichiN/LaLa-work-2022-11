package app;

import java.util.Scanner;

public class Human extends Player {
	
	public Human() {
		this("あなた");
		// this.name = "コム";
	}
	public Human(String name) {
		super(name);
	}
	@Override
	public void nextHand() {
		this.setHand(inputHand());
	}
	
	private int inputHand() {
		int hnd = 99;
		do {
			System.out.print("0:グー 1:チョキ 2:パー > ");
			hnd = new Scanner(System.in).nextInt();
		} while (!(hnd == 0 || hnd == 1 || hnd == 2));
		return hnd;
	}
}
