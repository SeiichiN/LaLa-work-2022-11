package app;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("桃太郎");
		Monster m = new Monster("赤鬼");
		while (m.getHp() > 0 && h.getHp() > 0) {
			m.attack(h);
			h.attack(m);
		}
		if (m.getHp() <= 0) {
			System.out.println(h.getName() + "は" 
					+ m.getName() + "を倒した");
		}
		if (h.getHp() <= 0) {
			System.out.println(h.getName() + "は"
					+ "倒された。");
		}
	}

	public void printStatus() {
		
	}
}
