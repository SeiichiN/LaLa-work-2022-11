package app;

public class Hero extends Human {

	public Hero() {
		this("ヒーロー");
	}
	public Hero(String name) {
		super(name, MAX_HP, 20);
	}
	
}
