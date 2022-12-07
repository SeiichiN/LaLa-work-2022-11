package rensyu17.ex2;

public class Main {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("ヌルポ例外をキャッチしました");
			System.out.println
			  ("--- stack trace from here ---");
			e.printStackTrace();
			System.out.println
			  ("--- stack trace end ---");
			
		}

	}

}
