package rensyu17.ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		while (i == 0) {
			System.out.println("数字を入力してください(1以上)>");
			String str = new Scanner(System.in).nextLine();
			i = changeNum(str);
		}
		System.out.println(i);
	}
	
	public static int changeNum(String moji) {
		int i = 0;
		try {
			i = Integer.parseInt(moji);
		} catch (NumberFormatException e) {
			System.out.println("数字じゃないです");
		}
		return i;
		
	}

}
