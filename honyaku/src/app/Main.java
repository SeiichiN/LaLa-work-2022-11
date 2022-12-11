package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print("英単語 > ");
		// String word = new Scanner(System.in).nextLine();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = reader.readLine();
		String urlTxt = "https://script.google.com/macros/s/AKfycbxj-0deGFSNF0iPrumoayDWJp7oU4gFvMPa_1iFT4lkXM1EK_EyOPGgAVyjNZn23wsg/exec?text="
				+ word + "&source=en&target=ja";
		URL u = new URL(urlTxt);
		InputStream is = u.openStream();
		reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String jsondata = reader.readLine();
		if (jsondata != null) {
			JSONObject jsonObj = new JSONObject(jsondata);
			String data = jsonObj.getString("text");
			System.out.println(data);
		}
	}

}
