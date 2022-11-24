package world;

public class Hero {
	public String name = "ミナト";
	public int hp = 100;
		
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
}
