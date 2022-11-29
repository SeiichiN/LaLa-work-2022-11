package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHandInterface {

	@Override
	public int nextHand() {
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
