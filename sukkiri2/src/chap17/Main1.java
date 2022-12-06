package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーです。中断します。");
		}
		

	}

}
