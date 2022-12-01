package v1_2;

public abstract class Player {
	String name;
	int hand;
	String[] res = new String[Main.NUM];
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
	/**
	 * "win" -- 001
	 * "draw -- 010
	 *  "lose" -- 100
	 */
	public void setResult() {
		// flag = 000
		for (int i=0; i<Main.NUM-1; i++) {
			if (res[i].equals("win")) {
				// flag = flag OR 001
			} else if (res[i].equals("draw")) {
				// flag = flag OR 010
			} else if (res[i].equals("lose")) {
				// flag = flag OR 100
			}
		}
		// if (flag == 001 || flag == 011) {
		//   result = "win"
		// } else if (flag == 100 || flag == 110) {
		//   result = "lose"
		// } else {
		//   result = "draw"
		// }
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
