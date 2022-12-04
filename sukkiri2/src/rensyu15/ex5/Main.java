package rensyu15.ex5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate mirai = now.plusDays(100L);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦 yyyy 年 MM 月 dd 日");
		String miraiText = dtf.format(mirai);
		System.out.println(miraiText);
	}

}
