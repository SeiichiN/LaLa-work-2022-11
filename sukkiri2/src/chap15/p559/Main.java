package chap15.p559;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("s1は Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("s1は Javaが末尾です");
		}
		System.out.println(
				"s1で最初にJavaが登場する位置は" +
		        s1.indexOf('r'));
		System.out.println(
				"s1で最後にJavaが登場する位置は" +
		        s1.lastIndexOf("Java"));
		
	}

}
