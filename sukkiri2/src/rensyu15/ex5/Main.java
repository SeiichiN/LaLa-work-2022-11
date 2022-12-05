package rensyu15.ex5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate mirai = now.plusDays(100);
		DateTimeFormatter dtf =
				DateTimeFormatter.ofPattern
				("yyyy/MM/dd");
		String miraiText = mirai.format(dtf);
		System.out.println(miraiText);

	}

}
