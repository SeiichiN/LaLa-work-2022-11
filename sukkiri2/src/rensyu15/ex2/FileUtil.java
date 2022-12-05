package rensyu15.ex2;

public class FileUtil {
	/**
	 * フォルダ名とファイル名を連結して、その文字列を返す
	 * @param folder フォルダ名
	 * @param file ファイル名
	 * 
	 * @return
	 *   フォルダ名とファイル名を連結した文字列
	 */
	public static String makePath(String folder, String file) {
		if (! folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}
}

