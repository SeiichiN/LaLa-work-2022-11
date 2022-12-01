package rensyu14.ex1;

public class Main {

	public static void main(String[] args) {
		// Account a = new Account("4649", 1592);
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		// \1592(口座番号@4649)
		
		Account b = new Account("4649", 3924);
		if (a.equals(b)) {
			System.out.println("同じである");
		} else {
			System.out.println("違います");
		}
	}

}
