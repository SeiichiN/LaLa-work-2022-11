package world;

import java.util.Random;

public class Cleric {
	public String name;
	public int hp = 50;
	final int HP_MAX = 50;
	public int mp = 10;
	final int MP_MAX = 10;
	
	public void selfAid() {
		System.out.println
		  (this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.HP_MAX;
		System.out.println("HPが最大まで回復した");
		
	}
	
	public int pray(int sec) {
		System.out.println
		  (this.name + "は" + sec + "秒間天に祈った");
		int hosei = new Random().nextInt(3);
		int kaihuku = sec + hosei;
		int genzai = this.mp;
		this.mp = this.mp + kaihuku;
		if (this.mp > this.MP_MAX) {
			this.mp = this.MP_MAX;
		}
		int recover = this.mp - genzai;
		// System.out.println("MPが" + recover + "回復した");
		return recover;
	}
}





