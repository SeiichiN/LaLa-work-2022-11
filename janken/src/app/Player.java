package app;

public abstract class Player {
	private String name;
	private int hand;
	private String result;
	private String[] hands = {"グー", "チョキ", "パー"};
	
	public Player(String name) {
		this.name = name;
	}
	
	public void judge(Player p) {
		if (this.hand == p.getHand()) {
			this.result = "draw";
		} else if ((this.hand + 1) % 3 == p.getHand()) {
			this.result = "win";
		} else {
			this.result = "lose";
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
}
