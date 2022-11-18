package chap05.p206;

public class Main {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static int add(int x, int y, int z) {
		int ans = x + y + z;
		return ans;
	}
	
	public static int add(double x, double y) {
		int ans = (int) (x + y);
		return ans;
	}

	public static void main(String[] args) {
		double x = 100.5;
		double y = 10.4;
		// int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + add(x, y));
	}

}
