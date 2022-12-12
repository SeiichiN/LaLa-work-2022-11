package app;

public abstract class Player {
	private String name;      // 名前
	private int hand;        // 0:グー 1:チョキ 2:パー
	private String result;    // "win", "lose", "draw"
	private int winCount = 0;
	private int loseCount = 0;
	private int drawCount = 0;
	private String[] hands = {"グー", "チョキ", "パー"};
	
	public Player(String name) {
		this.name = name;
	}
	
	public void printResultAll() {
		System.out.println
		  (this.name + " 勝ち:" + this.winCount
				  + " 負け:" + this.loseCount
				  + " 引分:" + this.drawCount);
	}
	
	/**
	 * 相手の手を見て自分の勝ち負けを判断するメソッド
	 * @param p -- 相手
	 */
	public void judge(Player p) {
		if (this.hand == p.getHand()) {
			this.result = "draw";
			this.drawCount++;
		} else if ((this.hand + 1) % 3 == p.getHand()) {
			this.result = "win";
			this.winCount++;
		} else {
			this.result = "lose";
			this.loseCount++;
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
