package chap17;

import java.io.FileWriter;
import java.io.IOException;

// p660
public class Main2 {

	public static void main(String[] args) {
		String str = "helohelo";
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write(str);
		} catch (IOException | NullPointerException e) {
			System.out.println("書き込み失敗");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}

	}

}
