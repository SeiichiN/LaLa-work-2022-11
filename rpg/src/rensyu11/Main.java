package rensyu11;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Java入門", 2400, "白", "B123");
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getColor());
		System.out.println(book.getIsbn());
		
		Computer com = new Computer("PC101", 50000, "黒", "HP");
		System.out.println(com.getName());
		System.out.println(com.getPrice());
		System.out.println(com.getColor());
		System.out.println(com.getMakerName());
	}

}
