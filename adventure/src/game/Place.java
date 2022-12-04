package game;

import monster.Monster;
import monster.NoMonster;

public class Place {
	private String name;
	private Monster monster;
	private Item item;
	private String sceneText;
	Place north;
	Place south;
	Place east;
	Place west;
	
	
	public Place() {
		this("");
	}
	public Place(String name) {
		this(name, new NoMonster(), new NoItem());
	}
	public Place(String name, Monster monster, Item item) {
		this.name = name;
		this.monster = monster;
		this.item = item;
		this.setNorth(null);
		this.setSouth(null);
		this.setEast(null);
		this.setWest(null);
		
	}
	
	public String toString() {
		// return this.name + ":" + this.monster + ":" + this.item;
		return this.getSceneText();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Monster getMonster() {
		return monster;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Place getNorth() {
		return north;
	}
	public void setNorth(Place north) {
		this.north = north;
	}
	public Place getSouth() {
		return south;
	}
	public void setSouth(Place south) {
		this.south = south;
	}
	public Place getEast() {
		return east;
	}
	public void setEast(Place east) {
		this.east = east;
	}
	public Place getWest() {
		return west;
	}
	public void setWest(Place west) {
		this.west = west;
	}
	public String getSceneText() {
		return sceneText;
	}
	public void setSceneText(String sceneText) {
		this.sceneText = sceneText;
	}
	
}
