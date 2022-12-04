package game;

import java.util.ArrayList;
import java.util.List;

import monster.Dragon;
import monster.Goblin;
import monster.Slime;

public class SetMonster {
	private List<Place> monsterPlaceList = new ArrayList<>();
	private int sizeA;
	private int sizeB;
	private int sizeC;
	private int sizeD;
	private int sizeE;
	private int sizeF;

	public List<Place> exec() {
		Map map = Map.getInstance();
		calcSize(map);
		int placeNum = getAllPlaceSize(map);
		int dragonIdx = getDragonIdx(placeNum);
		int goblinIdx = getGoblinIdx(placeNum, dragonIdx);
		int slimeIdx = getSlimeIdx(placeNum, dragonIdx, goblinIdx);

		Place dragonPlace = getMonsterPlace(map, dragonIdx);
		Dragon dragon = new Dragon("ドラゴン", 100);
		dragonPlace.setMonster(dragon);
		monsterPlaceList.add(dragonPlace);

		Place goblinPlace = getMonsterPlace(map, goblinIdx);
		Goblin goblin = new Goblin("ゴブリン", 70);
		goblinPlace.setMonster(goblin);
		monsterPlaceList.add(goblinPlace);

		Place slimePlace = getMonsterPlace(map, slimeIdx);
		Slime slime = new Slime("スライム", 50);
		slimePlace.setMonster(slime);
		monsterPlaceList.add(slimePlace);

		return monsterPlaceList;
	}
//	public List<Place> getMonsterPlaceList() {
//		this.exec();
//		return monsterPlaceList;
//	}

	private void calcSize(Map map) {
		sizeA = map.getRoadA().size();
		sizeB = map.getRoadB().size();
		sizeC = map.getRoadC().size();
		sizeD = map.getRoadD().size();
		sizeE = map.getRoadE().size();
		sizeF = map.getRoadF().size();
	}

	private int getAllPlaceSize(Map map) {
		return sizeA + sizeB + sizeC + sizeD + sizeE + sizeF;
	}

	private int getDragonIdx(int placeNum) {
		return (int) (Math.random() * (placeNum - 1)) + 1;
	}

	private int getGoblinIdx(int placeNum, int dragonIdx) {
		int goblinIdx = 0;
		do {
			goblinIdx = (int) (Math.random() * (placeNum - 1)) + 1;
		} while (goblinIdx == dragonIdx);
		return goblinIdx;
	}

	private int getSlimeIdx(int placeNum, int dragonIdx, int goblinIdx) {
		int slimeIdx = 0;
		do {
			slimeIdx = (int) (Math.random() * (placeNum - 1)) + 1;
		} while (slimeIdx == dragonIdx || slimeIdx == goblinIdx);
		return slimeIdx;
	}

	private Place getMonsterPlace(Map map, int idx) {
		if (idx < sizeA) {
			return map.getRoadA().get(idx);
		}
		if (idx < (sizeA + sizeB)) {
			int i = idx - sizeA;
			return map.getRoadB().get(i);
		}
		if (idx < (sizeA + sizeB + sizeC)) {
			int i = idx - (sizeA + sizeB);
			return map.getRoadC().get(i);
		}
		if (idx < (sizeA + sizeB + sizeC + sizeD)) {
			int i = idx - (sizeA + sizeB + sizeC);
			return map.getRoadD().get(i);
		}
		if (idx < (sizeA + sizeB + sizeC + sizeD + sizeE)) {
			int i = idx - (sizeA + sizeB + sizeC + sizeD);
			return map.getRoadE().get(i);
		}
		int i = idx - (sizeA + sizeB + sizeC + sizeD + sizeE);
		return map.getRoadF().get(i);
	}
}
