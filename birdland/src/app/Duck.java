package app;

public class Duck extends Bird implements Swimable {
	public Duck(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(this.getName() + "はがあがあと鳴いた");
	}

	@Override
	public void swim() {
		System.out.println(this.getName() + "はすいすいと泳いだ");
	}
}
