package chap13;

public class Inn {
	public void checkIn(Hero h) {
		System.out.println(h.getName() + "は宿屋に泊まった");
		h.sleep();
	}
}
