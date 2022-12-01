package rensyu13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard() {}
	public Wizard(String name, int hp, int mp) {
		this.setName(name);
		this.setHp(hp);
		this.setMp(mp);
	}
	
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = 
				(int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println
		  (h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException
			  ("名前は3文字以上です");
		}
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			  ("mpは0以上です");
		}
		this.mp = mp;
	}
}
