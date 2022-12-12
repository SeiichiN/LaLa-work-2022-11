package app;

public class Duck extends Bird implements Swimming {
	public Duck(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(this.name + "はがあがあと鳴いた");
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はすいすいと泳いだ");
	}
}
