package app;

public abstract class Player {
	String name;
	int hand;
	String result;
	
	public Player(String name) {
		this.name = name;
	}
	
	public abstract void nextHand();
	
	public void printResult() {
		System.out.println
		(this.name + "の手は" + this.hand + 
				" 結果:" + this.result);
	}	
}
