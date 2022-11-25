package world;

public abstract class FlyingMonster extends Monster
						implements RunInterface {
	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
