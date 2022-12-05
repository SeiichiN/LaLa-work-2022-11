package rensyu15.ex5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.print("誕生日> ");
		String _birthday = new Scanner(System.in).nextLine();
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate birthday = LocalDate.parse(_birthday, fmt);
		System.out.println(birthday);


	}

}
