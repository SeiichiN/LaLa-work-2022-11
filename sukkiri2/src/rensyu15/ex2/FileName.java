package rensyu15.ex2;

public class FileName {
	public String makeName(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}
}
