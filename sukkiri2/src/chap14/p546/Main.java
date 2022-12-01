package chap14.p546;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = Hero.getInstance();
		System.out.println(h1.money);
		// X ==> pr();
	}
	
	public void pr() {
		System.out.println("XXXXX");
	}

}
