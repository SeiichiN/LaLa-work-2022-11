package v1;

public class Main {

	public static void main(String[] args) {
		Com com = new Com("com");
		Human human = new Human("Taro");
		com.setHand(com.nextHand());
		human.setHand(human.nextHand());
		Game game = new Game();
		game.judge(com, human);
		com.printResult();
		human.printResult();
	}

}
