package rensyu16;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Hero> heroList = new ArrayList<>();
		Hero hero = new Hero("斎藤");
		heroList.add(hero);
		hero = new Hero("鈴木");
		heroList.add(hero);

		for (Hero h : heroList) {
			System.out.println(h.getName());
		}
	}

}
