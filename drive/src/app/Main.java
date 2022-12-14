package app;

public class Main {

	public static void main(String[] args) {
		Sedan car1 = new Sedan(12.0);
		car1.setOil(50.0);
		car1.setSpeed(50.0);
		car1.run(3.0);
		System.out.println("残り燃料:" + car1.getOil());
		car1.run(5.0);
		System.out.println("残り燃料:" + car1.getOil());
		car1.run(5.0);
		System.out.println("残り燃料:" + car1.getOil());
	}

}
