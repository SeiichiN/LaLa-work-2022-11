package app;

public class RubberDuck extends Toy 
                   implements Swimmable {

	public RubberDuck(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println
		(this.name + "はスイスイと泳いだ");
	}

}
