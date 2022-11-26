package p349;

import world.Hero;

public class Main {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = a;
		b[0] = 100;
		System.out.println(a[0]);   // 100
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		Hero h2 = h1;
		h2.name = "アサカ";
		System.out.println(h1.name);   // アサカ
		
		String s1 = "abc";
		String s2 = s1;  // s2にはs1のアドレスが入っている
		s2 = "XXX";     // s2は "XXX" のアドレスには変わっている
		System.out.println(s1);   // "abc"
		

	}

}
