package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

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
 *throws MalformedURLException
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print("英単語 > ");
		String word = new Scanner(System.in).nextLine();
		String urlTxt = "https://script.google.com/macros/s/AKfycbxj-0deGFSNF0iPrumoayDWJp7oU4gFvMPa_1iFT4lkXM1EK_EyOPGgAVyjNZn23wsg/exec?text="
				+ word + "&source=en&target=ja";
		URL u = new URL(urlTxt);
		InputStream is = u.openStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String jsondata = reader.readLine();
		if (jsondata != null) {
			JSONObject jsonObj = new JSONObject(jsondata);
			String data = jsonObj.getString("text");
			System.out.println(data);
		}
	}

}
