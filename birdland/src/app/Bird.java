package app;

public abstract class Bird {
	String name;
	
	public Bird(String name) {
		this.name = name;
	}

	public abstract void sing();
}
