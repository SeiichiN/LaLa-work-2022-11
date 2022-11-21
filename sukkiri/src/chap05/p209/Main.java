package chap05.p209;

public class Main {
	
	public static void printArray(int[] array) {
		array[0] = 100;
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
		System.out.println(array[0]);
		
		// int x = 3;
		// printX(x);
		// System.out.println(x);
		
	}

	public static void printX(int x) {
		x++;
		System.out.println(x);
	}
	
}
