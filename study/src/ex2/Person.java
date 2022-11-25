package ex2;

public class Person {
	String name;
	int age;
	char gender;
	
	public Person() {}
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void print() {
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
		System.out.println("性別:" + gender);
	}
}
