package game;


import java.util.LinkedList;
import java.util.List;

public class Map {
	private static Map map;

	List<Place> roadA = new LinkedList<>();
	List<Place> roadB = new LinkedList<>();
	List<Place> roadC = new LinkedList<>();
	List<Place> roadD = new LinkedList<>();
	List<Place> roadE = new LinkedList<>();
	List<Place> roadF = new LinkedList<>();
	
	private Map() {
		this.makeMap();
	}
	
	public static Map getInstance() {
		if (map == null) {
			map =  new Map();
			return map;
		} else {
			return map;
		}
	}
	
	public void setRoute(Place p1, String dir, Place p2) {
		switch (dir) {
		case "s":
			p1.setSouth(p2);
			p2.setNorth(p1);
			break;
		case "n":
			p1.setNorth(p2);
			p2.setSouth(p1);
			break;
		case "e":
			p1.setEast(p2);
			p2.setWest(p1);
			break;
		case "w":
			p1.setWest(p2);
			p2.setEast(p1);
			break;
		}
	}
	
	public void makeMap() {
		// プレースを作成し、ロードとする
		for (int i=0; i<8; i++) {
			String name = "A" + i;
			roadA.add(new Place(name));
		}
		for (int i=0; i<5; i++) {
			String name = "B" + i;
			roadB.add(new Place(name));
		}
		for (int i=0; i<4; i++) {
			String name = "C" + i;
			roadC.add(new Place(name));
		}
		for (int i=0; i<3; i++) {
			String name = "D" + i;
			roadD.add(new Place(name));
		}
		for (int i=0; i<5; i++) {
			String name = "E" + i;
			roadE.add(new Place(name));
		}
		for (int i=0; i<5; i++) {
			String name = "F" + i;
			roadF.add(new Place(name));
		}
		
		// 各ロードの各プレースを連結し、道をつける
		for (int i = 0; i < 7; i++) {
			setRoute(roadA.get(i), "s", roadA.get(i+1));
		}
		setRoute(roadA.get(2), "e", roadB.get(0));
		setRoute(roadB.get(0), "e", roadB.get(1));
		setRoute(roadB.get(1), "e", roadB.get(2));
		setRoute(roadB.get(2), "s", roadB.get(3));
		setRoute(roadB.get(3), "s", roadB.get(4));
		setRoute(roadB.get(4), "s", roadC.get(2));
		
		setRoute(roadA.get(5), "e", roadC.get(0));
		setRoute(roadC.get(0), "e", roadC.get(1));
		setRoute(roadC.get(1), "e", roadC.get(2));
		setRoute(roadC.get(2), "s", roadC.get(3));
		setRoute(roadC.get(3), "s", roadD.get(2));

		setRoute(roadA.get(7), "e", roadD.get(0));
		setRoute(roadD.get(0), "e", roadD.get(1));
		setRoute(roadD.get(1), "e", roadD.get(2));
		
		setRoute(roadA.get(4), "w", roadE.get(0));
		setRoute(roadE.get(0), "w", roadE.get(1));
		setRoute(roadE.get(1), "w", roadE.get(2));
		setRoute(roadE.get(2), "s", roadE.get(3));
		setRoute(roadE.get(3), "s", roadE.get(4));
		setRoute(roadE.get(4), "s", roadF.get(3));

		setRoute(roadA.get(7), "w", roadF.get(0));
		setRoute(roadF.get(0), "w", roadF.get(1));
		setRoute(roadF.get(1), "w", roadF.get(2));
		setRoute(roadF.get(2), "w", roadF.get(3));
	}

	public List<Place> getRoadA() {
		return roadA;
	}

	public void setRoadA(List<Place> roadA) {
		this.roadA = roadA;
	}

	public List<Place> getRoadB() {
		return roadB;
	}

	public void setRoadB(List<Place> roadB) {
		this.roadB = roadB;
	}

	public List<Place> getRoadC() {
		return roadC;
	}

	public void setRoadC(List<Place> roadC) {
		this.roadC = roadC;
	}

	public List<Place> getRoadD() {
		return roadD;
	}

	public void setRoadD(List<Place> roadD) {
		this.roadD = roadD;
	}

	public List<Place> getRoadE() {
		return roadE;
	}

	public void setRoadE(List<Place> roadE) {
		this.roadE = roadE;
	}

	public List<Place> getRoadF() {
		return roadF;
	}

	public void setRoadF(List<Place> roadF) {
		this.roadF = roadF;
	}

}
