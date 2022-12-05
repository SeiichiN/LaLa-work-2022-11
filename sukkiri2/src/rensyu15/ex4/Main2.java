package rensyu15.ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws ParseException {
		System.out.print("誕生日> ");
		String _birthday = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy/MM/dd");
		Date birthday = sdf.parse(_birthday);
		System.out.println(birthday);

	}

}
