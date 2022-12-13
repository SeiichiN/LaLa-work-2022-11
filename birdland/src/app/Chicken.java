package app;

public class Chicken extends Bird {

	public Chicken(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(this.getName() + "はコケコッコーと鳴いた");
	}

}
