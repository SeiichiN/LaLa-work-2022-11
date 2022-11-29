package v1;

public abstract class Player {
	String name;
	int hand;
	String result;
	String[] strHand = {"グー", "チョキ", "パー"};
	
	public Player(String name) {
		this.name = name;
	}
	public void printResult() {
		System.out.println
		  (this.name + "の手は" + strHand[this.hand] + " 結果:"
		  + jaResult(this.result));
	}
	public String jaResult(String result) {
		switch (result) {
		case "win":
			return "勝ち";
		case "lose":
			return "負け";
		case "draw":
			return "引き分け";
		}
		return "";
	}
	
	public abstract void nextHand();
}
