package chap18;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class P697 {

	public static void main(String[] args) throws IOException {
		System.out.print("英単語 > ");
		String word = new Scanner(System.in).nextLine();
		String urlTxt =
				"https://script.google.com/macros/s/AKfycbxj-0deGFSNF0iPrumoayDWJp7oU4gFvMPa_1iFT4lkXM1EK_EyOPGgAVyjNZn23wsg/exec?text=" + word +"&source=en&target=ja";
		URL u = new URL(urlTxt);
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = is.read();
		}
	}

}
