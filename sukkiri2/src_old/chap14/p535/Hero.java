package chap14.p535;

public class Hero {
	String name;
	int hp;
	
	public boolean equals(Object o) {
		if (this == o) {   // 2つのアドレスが同じ
			return true;
		}
		// oがHeroのインスタンスであれば
		if (o instanceof Hero) {
			// o をHero型にもどす
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
