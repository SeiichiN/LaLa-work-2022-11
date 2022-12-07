package chap17;

public class Main7 {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException
			("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
