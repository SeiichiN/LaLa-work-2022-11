package ex2;

public class Main {

	public static void main(String[] args) {
		Superman s = new Superman("ケント", 25, '1');
//		Superman s = new Superman();
//		s.name = "ケント";
//		s.age = 25;
//		s.gender = '1';
		s.print();
		s.fly();
		
		Person p1 = new Person("桃太郎", 21, '1');
		p1.print();

		Person p2 = new Person();
		p2.name = "かぐや";
		p2.age = 19;
		p2.gender = '2';
		p2.print();		
	}

}
