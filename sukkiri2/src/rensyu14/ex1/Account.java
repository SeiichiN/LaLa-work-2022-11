package rensyu14.ex1;

public class Account {
	String accountNumber;    // 口座番号
	int balance;             // 残高
	
	public Account() {}
	public Account(String ac, int ba) {
		this.accountNumber = ac;
		this.balance = ba;
	}
	
	public String toString() {
		return "¥" + balance + "(口座番号@"
				+ accountNumber + ")";
	}
	
	public boolean equals(Object o) {
		if (this == o) {   // 2つのアドレスが同じ
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account)o;
			if (this.accountNumber.equals(a.accountNumber)) {
				return true;
			}
		}
		return false;
	}
}
