package chap04.p167;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB = new int[3];
		
		arrayB[0] = arrayA[0];
		arrayB[1] = arrayA[1];
		arrayB[2] = arrayA[2];

		arrayB[0] = 100;
		System.out.println(arrayA[0]);  // 1
	}

}
