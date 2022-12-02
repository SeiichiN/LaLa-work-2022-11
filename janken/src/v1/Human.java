package v1;

import java.util.Scanner;

public class Human extends Player {

	public Human() {
		super("あなた");
	}
	public Human(String name) {
		super(name);
	}
	@Override
	public void nextHand() {
		System.out.println("0:グー 1:チョキ 2:パー");
		this.hand = new Scanner(System.in).nextInt();
	}
	
}
