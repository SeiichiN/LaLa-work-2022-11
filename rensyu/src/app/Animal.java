package app;

public class Animal extends Human {
	
	public Animal() {
		this("けらい");
	}
	public Animal(String name) {
		super(name, MAX_HP, 5);
	}
	
}
