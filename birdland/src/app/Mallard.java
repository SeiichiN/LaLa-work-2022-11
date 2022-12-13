package app;

public class Mallard extends Bird 
              implements Swimmable, Flyable {
	
	public Mallard(String name) {
		super(name);
	}
	@Override
	public void fly() {
		System.out.println(this.getName() + "は空を飛んだ");
	}
	@Override
	public void swim() {
		System.out.println
		(this.getName() + "はスイスイと泳いだ");
	}
	@Override
	public void sing() {
		System.out.println
		(this.getName() + "はグエグエと啼いた");
	}


}
