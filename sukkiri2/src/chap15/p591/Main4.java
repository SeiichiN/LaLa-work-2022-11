package chap15.p591;

import java.time.LocalDate;
import java.time.Period;

// p598
public class Main4 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);

		Period p1 = Period.ofDays(3);  // p3d
		Period p2 = Period.between(d1,  d2);  // p3d
		
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3); // 2020-01-07
		
	}

}
