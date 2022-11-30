package chap13;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ミナト");
		King king = new King();
		king.talk(h);
		Matango m = new Matango('A');
		h.attack(m);
		Inn inn = new Inn();
		inn.checkIn(h);
		h.attack(m);

	}

}
