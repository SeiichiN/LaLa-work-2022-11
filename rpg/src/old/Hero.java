package old;

import world.Sword;

public class Hero {
	public String name;
	public int hp = 100;
	public Sword sword;
	
	public Hero() {
		this("ダミー");
	}
	public Hero(String name) {
		// this.hp = 100;
		this.name = name;
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println
		  (this.name + "は、眠って回復した!");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println
		  (this.name + "は" + sec + "秒座った");
		System.out.println
		  ("HPが" + sec + "ポイント回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println
		  (this.name + "はころんだ");
		System.out.println("5のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
