package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		List<Human> hList = new ArrayList<>();
		Human taro = new Hero("桃太郎");
		taro.setHp(100);
		taro.setAttackHp(10);
		hList.add(taro);
		hList.add(new Animal("さる"));
		hList.add(new Animal("いぬ"));
		hList.add(new Animal("きじ"));
		
		List<Monster> mList = new ArrayList<>();
		mList.add(new Goblin("赤鬼"));
		mList.add(new Dragon("やまたのおろち"));
		mList.add(new Slime("スライム"));

		boolean getaway = false;
		while (true) {
			for (Monster m : mList) {
				m.attack(hList);
				Thread.sleep(2000);
			}
			for (int i = 0; i < hList.size(); i++) {
				if (hList.get(i).getHp() <= 0) {
					hList.remove(i);
				}
			}
			if (hList.isEmpty()) { break; }

			for (Human h : hList) {
				h.attack(mList);
				Thread.sleep(2000);
			}
			for (int i = 0; i < mList.size(); i++) {
				if (mList.get(i).getHp() <= 0) {
					mList.remove(i);
				}
			}
			if (mList.isEmpty()) { break; }

			printStatus(hList, mList);
			if (sentaku().equals("n")) {
				getaway = true;
				break;
			}

		}
		if (mList.isEmpty()) {
			System.out.println("桃太郎軍団は" 
					+ "モンスターたちを倒した");
		}
		if (hList.isEmpty()) {
			System.out.println("桃太郎軍団は"
					+ "倒された。");
		}
		if (getaway) {
			System.out.println("桃太郎軍団は"
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
		System.out.println("-----------------------");
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getHp() > 0) {
				System.out.print(" " + i + ":" + mList.get(i).getName());
			}
		}
		System.out.print("\nどれを攻撃しますか？ No > ");
		int no = new Scanner(System.in).nextInt();
		return mList.get(no);
	}
	
	public static String sentaku() {
		System.out.print
		  ("どうする？ x:攻撃 n:逃げる > ");
		String cmd = new Scanner(System.in).nextLine().toLowerCase();
		return cmd;
	}

	public static void printStatus(List<Human> hList, List<Monster> mList) {
		System.out.println("------------------------");
		for (Human h : hList) {
			System.out.print(h + " ");
		}
		System.out.println();
		for (Monster m : mList) {
			System.out.print(m + " ");
		}
		System.out.println();
	}
}
