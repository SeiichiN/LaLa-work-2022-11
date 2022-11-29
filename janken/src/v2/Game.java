package v2;

public class Game {
	public void judge(Player player1, Player player2) {
		int p1 = player1.getHand();
		int p2 = player2.getHand();
		
		if (p1 == p2) {
			player1.setResult("draw");
			player2.setResult("draw");
		} else if ((p1 + 1) % 3 == p2) {
			player1.setResult("win");
			player2.setResult("lose");
		} else {
			player1.setResult("lose");
			player2.setResult("win");
		}
	}
}
