package v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Human extends Player {
	public Human() {}
	public Human(String name) {
		super(name);
	}
	
	public int nextHand() {
		int hand = 99;;
		do {
			hand = inputHand();
		} while(hand < 0 || hand > 2);
		return hand;
	}

	private int inputHand() {
		int hand = 99;
		System.out.println("0:グー 1:チョキ 2:パー");
		try {
			hand = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			System.out.println("0,1,2以外は受け付けません");
		}
		return hand;
	}
}
