package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Bird> birdList = new ArrayList<>();
		Bird chicken = new Chicken("にわとり");
		birdList.add(chicken);
		Bird duck = new Duck("あひる");
		birdList.add(duck);
		Bird mallard = new Mallard("まがも");
		birdList.add(mallard);
		Swimable rubberDuck = new RubberDuck("ラバーダック");
		
		for (Bird bird : birdList) {
			bird.sing();
			if (bird instanceof Flyable) {
				Flyable flybird = (Flyable) bird;
				flybird.fly();
			}
			if (bird instanceof Swimable) {
				Swimable swimbird = (Swimable) bird;
				swimbird.swim();
			}
		}
		
		rubberDuck.swim();
	}

}
