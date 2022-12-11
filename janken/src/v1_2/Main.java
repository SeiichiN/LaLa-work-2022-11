package v1_2;

/**
 * 勝敗の判定は、各Playerサブクラスがおこなう。
 * すなわち、５人じゃんけんならば、各プレイヤーは
 * 他の４人それぞれの勝敗を判定し、その組み合わせによって
 * 全体としての勝敗を判定する。
 * 例
 *   プレイヤー1 グー とすると、プレイヤー1は、
 *     プレイヤー2 グー ... 引分
 *     プレイヤー3 チョキ ... 勝ち
 *     プレイヤー4 チョキ ... 勝ち
 *     プレイヤー5 グー ... 引分 となり、
 *   全体としては、「勝ち」となる。
 *    
 * @author se-ichi
 *
 */
public class Main {
	static final int NUM = 5; // 5人じゃんけん

	public static void main(String[] args) {
		Player[] players = new Player[NUM];
		for (int i=0; i<NUM; i++) {
			if (i==0) {
				players[i] = new Human("あなた");
			} else {
				players[i] = new Com(i);
			}
		}
		for (int i=0; i<NUM; i++) {
			players[i].nextHand();
		}
		int k = 0;
		for (int i=0; i<NUM; i++) {
			for (int j=0; j<NUM; j++) {
				if (i == j) continue;
				players[i].judge(players[j], k);
				k++;
			}
			k = 0;
		}
		for (int i=0; i<NUM; i++) {
			players[i].setResult();
		}
		for (int i=0; i<NUM; i++) {
			players[i].printResult();
		}
	}

}
