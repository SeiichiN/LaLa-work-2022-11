package v2;

public abstract class Player {
	String name;
	int hand;
	String result;
	String[] strHand = { "グー", "チョキ", "パー" };

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	public abstract int nextHand();

	public void printResult() {
		System.out.println(this.name + "の手は" + strHand[this.hand] + " 結果:" + jaResult(this.result));
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

	private String jaResult(String result) {
		switch (result) {
		case "win":
			return "勝ち";
		case "lose":
			return "負け";
		case "draw":
			return "引き分け";
		default:
			return "";
		}
	}
}
