package chap13;

import world.Matango;
import world.Sword;

public class Hero {
	private String name;
	int hp;
    Sword sword;
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVER です");
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
		
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
		System.out.println("おばけきのこ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
}
