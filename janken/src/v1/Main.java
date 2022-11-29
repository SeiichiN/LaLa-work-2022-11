package v1;

public class Main {

	public static void main(String[] args) {
		Com com = new Com("コンちゃん");
		Human human = new Human("人間");
		com.nextHand();
		human.nextHand();
		Game game = new Game();
		game.judge(com, human);
		com.printResult();
		human.printResult();
	}

}
