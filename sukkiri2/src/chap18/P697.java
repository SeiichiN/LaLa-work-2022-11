package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class P697 {

	public static void main(String[] args) throws IOException  {
		System.out.print("英単語 > ");
		String word = new Scanner(System.in).nextLine();
		String urlTxt =
				"https://script.google.com/macros/s/AKfycbxj-0deGFSNF0iPrumoayDWJp7oU4gFvMPa_1iFT4lkXM1EK_EyOPGgAVyjNZn23wsg/exec?text=" + word +"&source=en&target=ja";
		URL u = new URL(urlTxt);
		InputStream is = u.openStream();
		BufferedReader reader = 
				new BufferedReader
				  (new InputStreamReader(is));
		String data = reader.readLine();
		if (data != null) {
			System.out.println(data);
		}
	}

}
