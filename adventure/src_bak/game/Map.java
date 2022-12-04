package game;

import monster.Dragon;
import monster.Goblin;
import monster.Monster;
import monster.NoMonster;
import monster.Slime;

public class Map {
	public int ROW = Conf.ROW;
	public int COL = Conf.COL;
	public static final Cell[][] CELLS = new Cell[Conf.ROW][Conf.COL];

	public Map() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				NoMonster noM = new NoMonster();
				CELLS[i][j] = new Cell(new NoMonster(), 0, false);
			}
		}
	}

	public void makeMap() {
		Dragon dragon1 = new Dragon("炎のドラゴン", 100);
		setMonster(dragon1);
		Dragon dragon2 = new Dragon("氷のドラゴン", 100);
		setMonster(dragon2);
		Goblin goblin1 = new Goblin("ゴブリン1", 50);
		setMonster(goblin1);
		Goblin goblin2 = new Goblin("ゴブリン2", 50);
		setMonster(goblin2);
		Slime slime1 = new Slime("スライム1", 30);
		setMonster(slime1);
		Slime slime2 = new Slime("スライム2", 30);
		setMonster(slime2);

	}

	public void printMap() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (CELLS[i][j] == null) {
					System.out.println("NULL");
				} else {
					System.out.println(CELLS[i][j]);
				}
			}
		}
	}

	private void setMonster(Monster m) {
		boolean setOK = false;
		while (!setOK) {
			int row = (int) (Math.random() * ROW);
			int col = (int) (Math.random() * COL);
			if (!CELLS[row][col].isMonster()) {
				CELLS[row][col].setMonster(m);
				CELLS[row][col].setMonster(true);
				setOK = true;
			}
		}
	}
}
