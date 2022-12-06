package rensyu16;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<Hero, Integer> heros = new HashMap<>();
		Hero hero = new Hero("斎藤");
		heros.put(hero, 3);
		hero = new Hero("鈴木");
		heros.put(hero, 7);
		
		for (Hero h : heros.keySet()) {
			int teki = heros.get(h);
			System.out.println
			(h.getName() + "が倒した敵=" + teki);
		}

	}

}
