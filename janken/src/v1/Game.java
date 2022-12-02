package v1;

public class Game {
	public void judge(Player p1, Player p2) {
		if (p1.hand == p2.hand) {
			p1.result = "draw";
			p2.result = "draw";
		} else if ((p1.hand + 1) % 3 == p2.hand) {
			p1.result = "win";
			p2.result = "lose";
		} else {
			p1.result = "lose";
			p2.result = "win";
		}
	}
}
