package annotation;

public class Human extends Character {
	public void lun() {
		System.out.println("ばじる");
	}

	@Override
	public void run() {
		System.out.println("XXX");
	}
}
