package world;

public class PoisonMatango extends Matango {
	int count = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (count > 0) {
			attackWithPoison(h);
			count--;
		}
	}
	private void attackWithPoison(Hero h) {
		System.out.println("さらに毒の胞子をばらまいた");
		int damage = h.hp / 5;
		h.hp = h.hp - damage;
		System.out.println(damage + "ポイントのダメージ");
	}

}
