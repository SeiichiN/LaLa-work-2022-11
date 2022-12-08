package chap18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * (参考) URL URLから読み込んだ内容をStream APIで処理
 * https://qiita.com/kagamihoge/items/916e7015ec871202a5c8
 * 
 * BufferedReader 【Java入門】BufferedReaderでテキストをまとめて読み込む(readLine)
 * https://www.sejuku.net/blog/49981
 * 
 * キーボード入力を受け付ける2つの方法【BufferedReader & Scanner】
 * https://reasonable-code.com/java-keyboard-input/
 * 
 * stleary / JSON-java https://github.com/stleary/JSON-java
 * 
 * @author se-ichi
 *
 */
public class P697 {

//	public static void main(String[] args) throws MalformedURLException {
//		System.out.print("英単語を入力 > ");
//
//		String text = null;
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			text = reader.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		String urltxt = "https://script.google.com/macros/s/AKfycbxj-0deGFSNF0iPrumoayDWJp7oU4gFvMPa_1iFT4lkXM1EK_EyOPGgAVyjNZn23wsg/exec?text="
//				+ text + "&source=en&target=ja";
//		URL u = new URL(urltxt);
//
//		String jsonData = getData(u);
//		String jaText = getJaWord(jsonData);
//		System.out.println(text + ":" + jaText);
//	}
	
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

	private static String getJaWord(String jsonData) {
		String jaText = null;
		try {
			JSONObject json = new JSONObject(jsonData);
			jaText = json.getString("text");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jaText;
	}

	private static String getData(URL url) {
		String data = null;
		try (InputStream is = url.openStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));) {
			if ((data = reader.readLine()) != null) {
				System.out.println(data);
			}
//			while ((data = reader.readLine()) != null) {
//				System.out.println(data);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
