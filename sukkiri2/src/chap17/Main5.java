package chap17;

import java.io.FileWriter;
import java.io.IOException;

// p679
public class Main5 {

	public static void main(String[] args) {
		System.out.println("START");
		String str = "maido";
		writeFw(str);

	}
	
	public static void writeFw(String str)  {
		FileWriter fw;
		try {
			fw = new FileWriter("data.txt");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			;  // もみけし
		}
	}

}
