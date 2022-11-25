package world;

public abstract class WalkingMonster extends Monster
							implements RunInterface {
	public void run() {
		System.out.println("トコトコ走って逃げる");
	}
}
