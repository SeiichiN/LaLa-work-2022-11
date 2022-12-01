package v1_2;

public class Main {

	public static void main(String[] args) {
		int num = 3;
		Com[] com = new Com[num - 1];
		for (int i=0; i<num-1; i++) {
			com[i] = new Com();
		}
		Human human = new Human("人間");
		for (int i=0; i<num-1; i++) {
			com[i].nextHand();
		}
		human.nextHand();
		for (int i=0; i<num-1; i++) {
			com[i].nextHand();
		}
		com1.judge(human, 1);
		com1.judge(com2, 2);
		com2.judge(human, 1);
		com2.judge(com1, 2);
		human.judge(com1, 1);
		human.judge(com2, 2);
		com1.setResult();
		com2.setResult();
		human.setResult();
		com1.printResult();
		com2.printResult();
		human.printResult();
	}

}
