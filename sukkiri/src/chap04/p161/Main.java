package chap04.p161;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		char[] base = {'♥', '♣', '◆', '♠'};
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
			System.out.print(base[seq[i]] + " ");
		}

	}

}
