package chap15.p560;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java programming";
		
		System.out.println("s1の4文字目以降は" +
		  s1.substring(3));  // a programming
		
		System.out.println("s1の4～8文字目は" +
				  s1.substring(3, 8));  // a pro
		
		System.out.println("s1の0文字目は" +
				  s1.charAt(0));  // J

	}

}
