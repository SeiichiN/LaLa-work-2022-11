package app;

public class RubberDuck implements Swimming {
	String name;
	
	public RubberDuck(String name) {
		this.name = name;
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + "はすいすいと泳いだ");
	}

}
