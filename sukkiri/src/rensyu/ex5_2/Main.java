package rensyu.ex5_2;

public class Main {

	public static void main(String[] args) {
		email("業務連絡",
		      "abc@gmail.com",
		      "こんにちは。お元気ですか。さようなら。");

		email("taro@gmail.com",
			   "竜宮城にいきたいな");
	}

	public static void email(String title, String address, String text) {
		System.out.println
		  (address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	public static void email(String address, String text) {
		System.out.println
		  (address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}

}
