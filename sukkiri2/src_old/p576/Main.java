package chap15.p576;

public class Main {

	public static void main(String[] args) {
		String s =
			String.format
			("%d日で%sわかる%s入門", 3, "スッキリ", "Java");
		System.out.println(s);
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s2 =
			String.format
			(FORMAT, "asaka", "witch",  32);
		System.out.println(s2);
		
		String[] str = {"abc", "wahaha", "こあ"};
		String s3 = String.format("%s...%s...%s", str);
		System.out.println(s3);
	}

}
