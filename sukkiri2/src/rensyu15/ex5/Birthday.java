package rensyu15.ex5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		System.out.print("誕生日(yyyy/mm/dd)> ");
		String birth = new Scanner(System.in).nextLine();
		DateTimeFormatter dtf =
				DateTimeFormatter.ofPattern
				("yyyy/MM/dd");
		// 文字列を日付オブジェクトに変換
		LocalDate birthday = LocalDate.parse(birth, dtf);
		System.out.println(birthday);
				
		// 日付オブジェクトを文字列に変換
		String birthText = birthday.format(dtf);
		System.out.println(birthText);
	}

}
