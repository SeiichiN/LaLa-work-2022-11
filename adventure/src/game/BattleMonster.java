package game;

import java.util.Scanner;

import human.Human;
import monster.Monster;

public class BattleMonster {
	public void battle(Human human, Monster monster) {
		while (human.getHp() > 0 && monster.getHp() > 0) {
			human.status();
			monster.status();
			System.out.print("戦う: x  逃げる: n > ");
			String cmd = new Scanner(System.in).nextLine();
			if (cmd.equals("x")) {
				monster.attack(human);
				human.attack(monster);
			} else if (cmd.equals("n")) {
				System.out.println(human.getName() + "は逃げた。");
				human.setHp(human.getHp() - 20);
				System.out.println(human.getName() + "は20ポイントを失った。");
				return;
			}
		}
		if (human.getHp() <= 0) {
			System.out.println(human.getName() + "は戦いに負けた");
		}
		if (monster.getHp() <= 0) {
			System.out.println(monster.getName() + "は戦いに負けた");
		}
	}
}
