package app;

public class Main {
	public static final int MAX = 5;
	
	public static void main(String[] args) {
		Com com = new Com();
		Human human = new Human();
		int count = 0;
		while (count < MAX) {
			com.nextHand();
			human.nextHand();
			com.judge(human);
			human.judge(com);
			com.printResult();
			human.printResult();
			count++;
		}
		System.out.println("--------------------");
		human.printResultAll();
	}

}
