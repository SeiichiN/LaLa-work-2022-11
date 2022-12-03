package chap15.p568;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("> ");
		String name = new Scanner(System.in).nextLine();
		if (Check.isValidPlayerName(name)) {
			System.out.println("正しい");
		} else {
			System.out.println("間違い");
		}

	}

}
