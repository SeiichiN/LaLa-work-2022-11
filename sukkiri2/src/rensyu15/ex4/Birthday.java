package rensyu15.ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Birthday {

	public static void main(String[] args) throws ParseException {
		String birth = "2006/06/21";
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy/MM/dd");
		// 文字列を日付オブジェクトに変換する
		Date birthday = sdf.parse(birth);
		System.out.println(birthday);
		// 日付オブジェクトを文字列に戻す
		String birthText = sdf.format(birthday);
		System.out.println(birthText);
	}

}
