package app;

public class Main {

	public static void main(String[] args) {
		Com com = new Com();
		com.nextHand();
		Human human = new Human();
		human.nextHand();
		Game game = new Game();
		game.judge(com, human);
		com.printResult();
		human.printResult();
	}

}
