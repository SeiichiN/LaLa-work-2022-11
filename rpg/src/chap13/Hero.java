package chap13;

public class Hero {
	private int hp = 100;
	private String name;
	private Sword sword;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			  ("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
			  ("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
			  ("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVER です");
	}
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("おばけキノコ" + m.getSuffix() + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
}
