package rensyu15.ex2;

public class Main {

	public static void main(String[] args) {
		String folder = "C:\\javadev\\";
		String file = "readme.txt";
		// FileUtil fu = new FileUtil();
		String path = FileUtil.makePath(folder, file);
		System.out.println(path);
	}

}
