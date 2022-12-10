package app;

import java.util.HashMap;
import java.util.Map;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	private String[] hands = {"グー", "チョキ", "パー"};
	private int win_count = 0;
	private int lose_count = 0;
	private int draw_count = 0;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void judge(Player p) {
		if (this.hand == p.getHand()) {
			this.result = "draw";
			this.win_count++;
		} else if ((this.hand + 1) % 3 == p.getHand()) {
			this.result = "win";
			this.win_count++;
		} else {
			this.result = "lose";
			this.lose_count++;
		}
	}
	
	public abstract void nextHand();
	
	public void printResult() {
		System.out.println
		(this.name + "の手は" + this.hands[this.hand] + 
				" 結果:" + jaResult(this.result));
	}
	
	private String jaResult(String moji) {
		switch (moji) {
		case "win":
			return "勝ち";
		case "lose":
			return "負け";
		case "draw":
			return "引き分け";
		}
		return null;
	}
	
	public void printResultAll() {
		System.out.println
		  (this.name + ":" 
		          + " 勝ち:" + this.win_count
				  + " 負け:" + this.lose_count
				  + " 引分:" + this.draw_count);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String[] getHands() {
		return hands;
	}

	public void setHands(String[] hands) {
		this.hands = hands;
	}

	public int getWin_count() {
		return win_count;
	}

	public void setWin_count(int win_count) {
		this.win_count = win_count;
	}

	public int getLose_count() {
		return lose_count;
	}

	public void setLose_count(int lose_count) {
		this.lose_count = lose_count;
	}

	public int getDraw_count() {
		return draw_count;
	}

	public void setDraw_count(int draw_count) {
		this.draw_count = draw_count;
	}
}
