package app;

public class Duck extends Bird 
                   implements Swimmable {

	public Duck(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println
		(this.getName() + "はスイスイと泳いだ");
	}
	@Override
	public void sing() {
		System.out.println
		(this.getName() + "はガアガアと啼いた");
	}

}
