package app;

public class Mallard extends Bird implements Flyable, Swimable {

	public Mallard(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(this.name + "はグエグエグエと鳴いた");
	}

	@Override
	public void fly() {
		System.out.println(this.name + "は空を飛んだ");
	}

	@Override
	public void swim() {
		System.out.println(this.name + "はすいすいと泳いだ");
	}
	
}
