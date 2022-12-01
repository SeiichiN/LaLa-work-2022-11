package game;

import monster.Dragon;
import monster.Monster;

public class Map {
	public static final int ROW = 10;
	public static final int COL = 10;
	public static final Cell[][] CELLS = new Cell[ROW][COL];

	public Map () {
		for (int i=0; i<ROW; i++) {
			for (int j=0; j<COL; j++) {
				CELLS[i][j].setMonster(false);
			}
		}
	}
	public void makeMap() {
		Dragon dragon1 = new Dragon();
		setMonster(dragon1);
		Dragon dragon2 = new Dragon();
		setMonster(dragon2);
		
	}
	
	private void setMonster(Monster m) {
		int row = (int)(Math.random() * 10);
		int col = (int)(Math.random() * 10);
		if (!CELLS[row][col].isMonster()) {
			CELLS[row][col].setMonster(m);
			CELLS[row][col].setMonster(true);
		}
	}
}
