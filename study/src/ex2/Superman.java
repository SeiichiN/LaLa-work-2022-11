package ex2;

public class Superman extends Person {
	public Superman
	  (String name, int age, char gender) {
		super(name, age, gender);
	}
	
	public void fly() {
		System.out.println
		  (this.name + "は空を飛んだ");
	}
}
