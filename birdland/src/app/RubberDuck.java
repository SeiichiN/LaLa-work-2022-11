package app;

public class RubberDuck extends Toy implements Swimable {
	
	public RubberDuck(String name) {
		super(name);
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + "はすいすいと泳いだ");
	}

}
