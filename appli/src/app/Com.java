package app;

public class Com {
	public Koma move() {
		String[] name = {"A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"};
		int n = (int)(Math.random() * 9);
		int num = (int)(Math.random() * 10);
		String img = null;
		if (num % 2 == 0) {
			img = "O";
		} else {
			img = "X";
		}
		Koma koma = new Koma(name[n]);
		koma.setImg(img);
		return koma;
	}
}
