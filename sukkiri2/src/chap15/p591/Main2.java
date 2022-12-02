package chap15.p591;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// p594
public class Main2 {

	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		// LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 0, 0);
		
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		// System.out.println(l1);
		System.out.println(l2);
		System.out.println(z1);
		System.out.println(l3);
		

	}

}
