package v3;

import java.util.HashMap;
import java.util.Map;

public abstract class Player {
	NextHandInterface nhi;
	String name;
	int hand;
	String result;
	String[] strHand = { "グー", "チョキ", "パー" };
	Map<String, String> resultMap = new HashMap<>() {
		{
			put("win", "勝ち");
			put("lose", "負け");
			put("draw", "引き分け");
		}
	};

	public Player() {
	}

	public Player(String name) {
		this.name = name;
	}

	public void setNhi(NextHandInterface nhi) {
		this.nhi = nhi;
	}
	
	public int nextHand() {
		return nhi.nextHand();
	}

	public void printResult() {
		System.out.println(this.name + "の手は" + strHand[this.hand] + " 結果:" + this.resultMap.get(this.result));
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

}
