package chap15.p568;

public class Check {
	
	public static boolean isValidPlayerName(String name) {
		return name.matches("^[A-Z][A-Z0-9]{7}$");
	}
}
