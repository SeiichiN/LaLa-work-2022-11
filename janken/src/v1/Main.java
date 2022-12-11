package v1;

/**
 * Game勝敗を判定するクラスGame を作成する。
 * Gameクラスのjudge()メソッドが判定する。
 * 
 * @author se-ichi
 *
 */
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
