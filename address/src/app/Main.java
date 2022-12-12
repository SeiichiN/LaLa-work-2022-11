package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ゲッターセッターを使わない
 * p.320あたり
 */
public class Main {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Person person;
		Scanner scan = new Scanner(System.in); 
		
		int count = 0;
		while (count < 3) {
			person = new Person();
			System.out.print("名前 > ");
			person.name = scan.nextLine();
			
			System.out.print("住所 > ");
			person.address = scan.nextLine();
			
			personList.add(person);
			count++;
		}
		
		for (Person p : personList) {
			System.out.println("名前:" + p.name 
					+ " 住所:" + p.address);
		}

	}

}
