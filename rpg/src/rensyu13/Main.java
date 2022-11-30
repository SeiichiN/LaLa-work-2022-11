package rensyu13;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		w.setName("アサカ");
		w.setHp(80);
		w.setMp(20);
		Wand wa = new Wand();
		wa.setName("魔法の杖");
		wa.setPower(50.5);
		w.setWand(wa);
		Hero h = new Hero();
		w.heal(h);
	}

}
