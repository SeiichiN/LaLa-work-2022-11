package ver2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ゲッターセッターを使うやり方
 */
public class Main {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Person person = null;
		Scanner scan = new Scanner(System.in); 

		while (true) {
			person = new Person();
			System.out.print("名前(end:99) > ");
			String name = scan.nextLine();
			if (name.equals("99")) {
				break;
			}
			person.setName(name);
			
			System.out.print("住所 > ");
			String address = scan.nextLine();
			person.setAddress(address);
			
			personList.add(person);
		}

		for (Person p : personList) {
			System.out.println("名前:" + p.getName() 
			+ " 住所:" + p.getAddress());
		}
	}

}
