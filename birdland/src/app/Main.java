package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Bird> birdList = new ArrayList<>();

		birdList.add(new Chicken("にわとり"));
		birdList.add(new Duck("あひる"));
		birdList.add(new Mallard("まがも"));
		
		RubberDuck rubberDuck = new RubberDuck("ラバーダック");

		for (Bird b : birdList) {
			b.sing();
			if (b instanceof Swimmable) {
				((Swimmable)b).swim();
			}
			if (b instanceof Flyable) {
				((Flyable)b).fly();
			}
		}
		
		rubberDuck.swim();


	}

}
