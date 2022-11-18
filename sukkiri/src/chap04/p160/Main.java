package chap04.p160;

public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0:
				System.out.print("♥ ");
				break;
			case 1:
				System.out.print("♣ ");
				break;
			case 2:
				System.out.print("◆ ");
				break;
			case 3:
				System.out.print("♠ ");
				break;
			}
		}

	}

}
