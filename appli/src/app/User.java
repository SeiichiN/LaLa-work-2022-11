package app;

import java.util.Scanner;

public class User {
	public Koma move(Koma komaCom) {
		String komaUser = null;
		boolean isSame = false;
		do {
			System.out.println("koma (ex.'a1') > ");
			komaUser = new Scanner(System.in).nextLine().toUpperCase();
			if (komaUser.equals(komaCom.getName())) {
				isSame = true;
			}
		} while (isSame);
		System.out.println("X or O > ");
		String img = new Scanner(System.in).nextLine();
		
		Koma koma = new Koma(komaUser);
		koma.setImg(img);
		return koma;
	}
}
