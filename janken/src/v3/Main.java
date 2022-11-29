package v3;

public class Main {

	public static void main(String[] args) {
		Com com = new Com("com");
		com.setNhi(new RandomNextHand());
		Human human = new Human("Taro");
		human.setNhi(new InputNextHand());
		com.setHand(com.nextHand());
		human.setHand(human.nextHand());
		Game game = new Game();
		game.judge(com, human);
		com.printResult();
		human.printResult();
	}

}
