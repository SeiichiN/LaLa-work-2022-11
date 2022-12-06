package chap16;

import java.util.HashSet;
import java.util.Set;

// p629
public class Main3 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("青");
		colors.add("赤");
		colors.add("黃");
		colors.add("赤");
		System.out.println(colors.size());
		
		// p630
		for (String s : colors) {
			System.out.print(s + "->");
		}
	}

}
