package game;

import java.util.List;
import java.util.Scanner;

import human.Hero;
import human.Human;
import monster.Monster;
import monster.NoMonster;

public class Main {

	public static void main(String[] args) {
		Map map = Map.getInstance();
		Scene scene = new Scene();
		scene.setSceneAll();
		
		SetMonster setMonster = new SetMonster();
		setMonster.exec();
		List<Place> monsterPlaceList = setMonster.getMonsterPlaceList();
		for (Place monsterPlace : monsterPlaceList) {
			System.out.println(monsterPlace.getMonster());
		}
		
		Human human = new Hero("太郎", 100);
		
		CheckMonster checkMonster = new CheckMonster();
		
		Place here = map.getRoadA().get(0);
		while (true) {
			System.out.println(here);
			Monster monster = checkMonster.exec(here);
			if (monster != null) {
				BattleMonster battleMonster = new BattleMonster();
				battleMonster.battle(human, monster);
				if (monster.getHp() <= 0) {
					here.setMonster(new NoMonster());
				}
			}
			Place next = move(here);
			if (next == null) {
				System.out.println("そちらには進めません");
			} else {
				here = next;
			}
		}
	}

	public static Place move(Place here) {
		System.out.println("n:北 s:南 e:東 w:西 9:終了");
		String dir = new Scanner(System.in).nextLine();
		switch (dir) {
		case "n":
			return here.getNorth();
		case "s":
			return here.getSouth();
		case "e":
			return here.getEast();
		case "w":
			return here.getWest();
		case "9":
			System.exit(0);
		}
		return null;
	}
}
