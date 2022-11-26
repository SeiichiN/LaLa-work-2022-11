package v2;

public class Game {
	public void judge(Player player1, Player player2) {
		int p1 = player1.getHand();
		int p2 = player2.getHand();
		
		if (p1 == p2) {
			player1.setResult(Conf.DRAW);
			player2.setResult(Conf.DRAW);
		} else if ((p1 + 1) % 3 == p2) {
			player1.setResult(Conf.WIN);
			player2.setResult(Conf.LOSE);
		} else {
			player1.setResult(Conf.LOSE);
			player2.setResult(Conf.WIN);
		}
	}
}
