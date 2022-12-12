package app;

public class Main {
	public static final int MAX = 5;
	
	public static void main(String[] args) {
		Com com = new Com();
		Human human = new Human();
		int count = 0;
		while (count < 5) {
			System.out.println
			  ((count + 1) + "回目------");
			com.nextHand();      // comの手を決める(乱数)
			human.nextHand();    // humanの手を決める(Scanner)
			com.judge(human);    // comが自分の勝ち負けを判断
			human.judge(com);    // humanが...
			com.printResult();
			human.printResult();
			count++;
		}
		System.out.println("------------------");
		com.printResultAll();
		human.printResultAll();
	}

}
