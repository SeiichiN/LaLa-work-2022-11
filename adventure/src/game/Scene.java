package game;

import java.util.List;

public class Scene {
	String a0 = "ここはスタート地点です。南に道があります。";
	String nothing = "道です。";
	String a2 = "道です。道が東と南と北に分かれています。";
	String a4 = "道です。道が西と南と北に分かれています。";
	String a5 = "道です。道が東と南と北に分かれています。";
	String a7 = "道です。道が東と西と北に分かれています。";
	String c2 = "道です。道が西と南と北に分かれています。";

	public void setSceneAll() {
		Map map = Map.getInstance();
		List<Place> roadA = map.getRoadA();
		for (int i = 0; i < roadA.size(); i++) {
			if (i == 0) {
				roadA.get(i).setSceneText(a0);
			} else if (i == 2) {
				roadA.get(i).setSceneText(a2);
			} else if (i == 4) {
				roadA.get(i).setSceneText(a4);
			} else if (i == 5) {
				roadA.get(i).setSceneText(a5);
			} else if (i == 7) {
				roadA.get(i).setSceneText(a7);
			} else {
				roadA.get(i).setSceneText(nothing);
			}
		}
		List<Place> roadB = map.getRoadB();
		for (int i = 0; i < roadB.size(); i++) {
			roadB.get(i).setSceneText(nothing);
		}
		List<Place> roadC = map.getRoadC();
		for (int i = 0; i < roadC.size(); i++) {
			if (i == 2) { roadC.get(i).setSceneText(c2); }
			else { roadC.get(i).setSceneText(nothing); }
		}
		List<Place> roadD = map.getRoadD();
		for (int i = 0; i < roadD.size(); i++) {
			roadD.get(i).setSceneText(nothing); 
		}
		List<Place> roadE = map.getRoadE();
		for (int i = 0; i < roadE.size(); i++) {
			roadE.get(i).setSceneText(nothing); 
		}
		List<Place> roadF = map.getRoadF();
		for (int i = 0; i < roadF.size(); i++) {
			roadF.get(i).setSceneText(nothing); 
		}
	}
}
