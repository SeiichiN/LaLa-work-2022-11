package app;

public class Game {
	public void judge(Com p1, Human p2) {
		if (p1.hand == p2.hand) {
			p1.result = "draw";
			p2.resutl = "draw";
		} else if ((p1.hand + 1) % 3 == p2.hand) {
			p1.result = "win";
			p2.result = "lose";
		} else {
			p1.result = "lose";
			p2.result = "win";
		}
	}
}
