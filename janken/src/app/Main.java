package app;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		com.nextHand();
		Human human = new Human();
		human.nextHand();
		com.judge(human);
		human.judge(com);
		com.printResult();
		human.printResult();
	}

}
