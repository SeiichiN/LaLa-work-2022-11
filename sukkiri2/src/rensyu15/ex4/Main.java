package rensyu15.ex4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		Date mirai = c.getTime();
		SimpleDateFormat sdf =
				new SimpleDateFormat
				("西暦 yyyy 年 MM 月 dd 日");
		String miraiText = sdf.format(mirai);
		System.out.println(miraiText);

	}

}
