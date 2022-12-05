package rensyu15.ex1;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 101; i++) {
			// sb.append(((Integer)i).toString() + ",");
			sb.append(i + ",");
		}
		String s = sb.toString();
		System.out.println(s);
		
		String[] a = s.split(",");
	}

}
