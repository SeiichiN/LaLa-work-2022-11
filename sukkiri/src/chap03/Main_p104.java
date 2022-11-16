package chap03;

public class Main_p104 {

	public static void main(String[] args) {
		boolean doorClose = true;
		int count = 0;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ" + count);
			count++;
			System.out.println("count>" + count);
			if (count > 10) {
				doorClose = false;
			}
		}
	}

}
