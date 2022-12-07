package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Koma[][] komas = new Koma[3][3];
		komas[0][0] = new Koma("A1");
		komas[0][1] = new Koma("A2");
		komas[0][2] = new Koma("A3");
		komas[1][0] = new Koma("B1");
		komas[1][1] = new Koma("B2");
		komas[1][2] = new Koma("B3");
		komas[2][0] = new Koma("C1");
		komas[2][1] = new Koma("C2");
		komas[2][2 ] = new Koma("C3");
		Board.setup(komas);

		while (true) {
			Com com = new Com();
			Koma komaCom = com.move();
			
			User user = new User();
			Koma komaUser = user.move(komaCom);
			
			Board.check(komaCom);
			Board.check(komaUser);
		}
	}

}
