package chap05.p202;

public class Main {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		// int ans = add(x, y);
		System.out.println(x + "+" + y + "=" + add(x, y));
	}

}
