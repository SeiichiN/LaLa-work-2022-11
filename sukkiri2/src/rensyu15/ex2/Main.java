package rensyu15.ex2;

public class Main {

	public static void main(String[] args) {
		String folder = "C:\\java";
		String file = "readme.txt";
		FileName fn = new FileName();
		String path = fn.makeName(folder, file);
		System.out.println(path);
	}

}
