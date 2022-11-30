package rensyu12;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();                // Aa
		// X型で宣言されているメソッドしか使えない
		
		Y y1 = new A();
		Y y2 = new B();
		y1.a();               // Aa
		y2.a();               // Ba
		// Y型にはa()メソッドは宣言されている。
		// Y型の中のインスタンスのメソッドが動く
	}

}
