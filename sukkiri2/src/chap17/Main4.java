package chap17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println(num);
	}

	public static int inputNum() {
		int num = 0;
		System.out.println("数字を入力してね");
		try {
		    num = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			throw new IllegalStateException
			  ("数字ちゃうやん");
		}
		return num;
	}
}
