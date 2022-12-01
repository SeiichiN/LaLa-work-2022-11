package v1_2;

public class Main {
	static final int NUM = 5;

	public static void main(String[] args) {
		Player[] players = new Player[NUM];
		for (int i=0; i<NUM; i++) {
			if (i==0) {
				players[i] = new Human("あなた");
			} else {
				players[i] = new Com(i);
			}
		}
		for (int i=0; i<NUM; i++) {
			players[i].nextHand();
		}
		for (int i=0; i<NUM; i++) {
			players[i].judge(players[(i+1)%3], 0);
			players[i].judge(players[(i+2)%3], 1);
		}
		for (int i=0; i<NUM; i++) {
			players[i].setResult();
		}
		for (int i=0; i<NUM; i++) {
			players[i].printResult();
		}
	}

}
