package v1_2;

public abstract class Player {
	String name;
	int hand;
	String[] res = new String[2];
	String result;
	String[] strHand = {"グー", "チョキ", "パー"};
	
	public Player(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param enemy
	 * @param no -- 0ならば1つめの敵、1ならば2つめの敵
	 */
	public void judge(Player enemy, int no) {
		if (this.hand == enemy.hand) {
			this.res[no] = "draw";
		} else if ((this.hand + 1) % 3 == enemy.hand) {
			this.res[no] = "win";
		} else {
			this.res[no] = "lose";
		}		
	}
	public void setResult() {
		if ((res[0].equals("win") && res[1].equals("win"))
				|| (res[0].equals("win") && res[1].equals("draw"))
				|| (res[0].equals("draw") && res[1].equals("win"))) {
			result = "win";
		}	else if ((res[0].equals("lose") && res[1].equals("lose"))
				|| (res[0].equals("lose") && res[1].equals("draw"))
				|| (res[0].equals("draw") && res[1].equals("lose"))) {
			result = "lose";
		} else {
			result = "draw";
		}
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
