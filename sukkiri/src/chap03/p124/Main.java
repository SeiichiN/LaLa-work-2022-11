package chap03.p124;

public class Main {

	public static void main(String[] args) {
		String word;
		do {
			System.out.println("yesと入力してください");
			word = new java.util.Scanner(System.in)
					.nextLine();
		} while (!word.equals("yes"));
		System.out.println("End:" + word);
	}

}
