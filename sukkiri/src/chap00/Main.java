package chap00;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println(args[0]);
		if (args[0] instanceof String)
			System.out.println("mojiretu");
		else
			System.out.println("xxx");
	}

}
