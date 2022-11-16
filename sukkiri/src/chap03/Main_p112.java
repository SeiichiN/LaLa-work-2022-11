package chap03;

public class Main_p112 {

	public static void main(String[] args) {
		System.out.println("m / w > ");
		String gender = 
		 		new java.util.Scanner(System.in).nextLine();
		// String gender = "m";   // == で比較可能
		if (gender.equals("m")) {
			System.out.println("MAN");
		} else if(gender.equals("w")) {
			System.out.println("WOMAN");
		} else {
			System.out.println("???");
		}

	}

}
