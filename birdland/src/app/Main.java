package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Bird> birdList = new ArrayList<>();
		Chicken chicken = new Chicken("にわとり");
		birdList.add(chicken);
		Duck duck = new Duck("あひる");
		birdList.add(duck);
		Mallard mallard = new Mallard("まがも");
		birdList.add(mallard);
		RubberDuck rubberDuck = new RubberDuck("ラバーダック");
		
		for (Bird bird : birdList) {
			bird.sing();
			if (bird instanceof Flying) {
				Flying flybird = (Flying) bird;
				flybird.fly();
			}
			if (bird instanceof Swimming) {
				Swimming swimbird = (Swimming) bird;
				swimbird.swim();
			}
		}
		
		rubberDuck.swim();
	}

}
