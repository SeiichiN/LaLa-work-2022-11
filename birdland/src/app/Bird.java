package app;

public abstract class Bird {
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}

	public abstract void sing();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
