package chap17;

import java.io.FileWriter;
import java.io.IOException;

// p679
public class Main3 {

	public static void main(String[] args) {
		String str = "helohelo";
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write(str);
		} catch (IOException | NullPointerException e) {
			System.out.println("書き込み失敗");
		}

	}

}
