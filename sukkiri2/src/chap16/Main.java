package chap16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		
		Dog dog;
		dog = new Dog("ポチ", "S");
		dogList.add(dog);
		
		dog = new Dog("クロ", "M");
		dogList.add(dog);
		
		dog = new Dog("パトラッシュ", "L");
		dogList.add(dog);
		
		Iterator<Dog> it = dogList.iterator();
		while (it.hasNext()) {
			Dog wanko = it.next();
			System.out.println(wanko);
		}

//		for (Dog wanko : dogList) {
//			System.out.println(wanko);
//		}
	}

}
