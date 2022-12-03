package chap15.p563;

public class Main2 {

	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + "Java";
		}
		System.out.println(s.substring(0, 20));
	}

}
