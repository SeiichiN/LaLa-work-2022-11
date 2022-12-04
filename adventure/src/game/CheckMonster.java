package game;

import monster.Monster;

public class CheckMonster {
	public Monster exec(Place here) {
		Monster monster = here.getMonster();
		if (monster.getName().equals("")) {
			;
		} else {
			System.out.println(monster.getName() + "が現れた!");
			return monster;
		}
		return null;
	}
}
