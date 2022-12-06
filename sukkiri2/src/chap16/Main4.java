package chap16;

import java.util.HashMap;
import java.util.Map;

// p635
public class Main4 {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都");
		System.out.println(tokyo);
		
		// prefs.remove("京都府");
		// int kyoto = prefs.get("京都府");
		// System.out.println(kyoto);
		
		prefs.put("熊本県", 182);
		int kuma = prefs.get("熊本県");
		System.out.println(kuma);
		
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + " " + value);
		}
	}
}
