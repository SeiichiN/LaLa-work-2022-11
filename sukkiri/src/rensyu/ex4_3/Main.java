package rensyu.ex4_3;

public class Main {

	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.2F, 175.0F};
		// NullPointerException
		System.out.println(counts[1]);
		// ArrayIndexOutOfBoundsException
		System.out.println(heights[2]);
	}

}
