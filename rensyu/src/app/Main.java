package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("桃太郎");
		h.setHp(500);
		h.setAttackHp(50);
		List<Monster> mList = new ArrayList<>();
		mList.add(new Goblin("赤鬼"));
		mList.add(new Dragon("やまたのおろち"));

		boolean getaway = false;
		Monster target = null;
		while (true) {
			for (Monster m : mList) {
				m.attack(h);
			}
			if (h.getHp() <= 0) { break; }
			target = selectEnemy(mList);
			h.attack(target);
			int isDead = monsterDeadCount(mList);
			if (isDead == mList.size()) { break; }

			printStatus(h, mList);
			if (sentaku().equals("n")) {
				getaway = true;
				break;
			}

		}
		if (target.getHp() <= 0) {
			System.out.println(h.getName() + "は" 
					+ target.getName() + "を倒した");
		}
		if (h.getHp() <= 0) {
			System.out.println(h.getName() + "は"
					+ "倒された。");
		}
		if (getaway) {
			System.out.println(h.getName() + "は"
					+ "逃げ出した。");
		}
	}
	
	public static int monsterDeadCount(List<Monster> mList) {
		int isDead = 0;
		for (Monster m : mList) {
			if (m.getHp() <= 0) {
				isDead++;
			}
		}
		return isDead;
	}
	
	public static Monster selectEnemy(List<Monster> mList) {
		System.out.println("どれを攻撃しますか？ No > ");
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getHp() > 0) {
				System.out.print(i + ":" + mList.get(i).getName());
			}
		}
		int no = new Scanner(System.in).nextInt();
		return mList.get(no);
	}
	
	public static String sentaku() {
		System.out.println
		  ("どうする？ x:攻撃 n:逃げる > ");
		String cmd = new Scanner(System.in).nextLine().toLowerCase();
		return cmd;
	}

	public static void printStatus(Hero h, List<Monster> mList) {
		System.out.print(h + " ");
		for (Monster m : mList) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
}
