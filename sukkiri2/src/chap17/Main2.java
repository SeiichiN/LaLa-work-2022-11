package chap17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int num = inputNumber();
		System.out.println("入力されたのは " + num);

	}

	public static int inputNum() {
		boolean isNum = false;
		int num = 0;
		while (!isNum) {
			System.out.print("数字を入力> ");
			String numTxt = new Scanner(System.in).nextLine();
			try {
				num = Integer.parseInt(numTxt);
				isNum = true;
			} catch (NumberFormatException e) {
				System.out.println("数字ではありません");
			}
		}
		return num;
	}
	
	public static int inputNumber() {
		int num = 0;
		boolean isNum = false;
		while (!isNum) {
			System.out.print("数字を入力> ");
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
