package chap17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println(num);
	}

	public static int inputNum() {
		int num = 0;
		boolean isNum = false;
		while (! isNum) {
			System.out.println("数字を入力してください。");
			try {
			    num = new Scanner(System.in).nextInt();
			    isNum = true;
			} catch (InputMismatchException e) {
				System.out.println("数字ではありません");
			}
		}
		return num;
	}
}
