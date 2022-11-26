package p329;

import world.Cleric;

public class Main {

	public static void main(String[] args) {
		Cleric cleric = new Cleric();
		cleric.name = "ルター";
		cleric.hp -= 30;
		cleric.selfAid();
		System.out.println
		  (cleric.name + "のMPは" + cleric.mp);
		int recover = cleric.pray(3);
		System.out.println(recover + "回復した");
	}

}
