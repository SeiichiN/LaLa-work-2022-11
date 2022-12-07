package app;

public class Board {
	public static void setup(Koma[][] komas) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				komas[i][j].setImg("");
			}
		}
	}
	
	public static void check(Koma koma) {
		
	}
}
