package chap14.p546;

public class Hero {
	String name;
	int hp;
	static int money;
	
	private Hero() {
		this.name = "ミナト";
	}
	public static Hero getInstance() {
		return new Hero();
	}
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		// X ==> System.out.println(this.name + "初期化");
	}
}
