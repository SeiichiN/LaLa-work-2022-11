package chap16;

public class Dog {
	private String name;
	private String size; // Small, Middle, Large
	
	public Dog() {}
	public Dog(String name) {
		this.name = name;
	}
	public Dog(String name, String size) {
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String toString() {
		return name + ":" + size;
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Dog) {
			Dog d = (Dog)o;
			if (d.getName().equals(this.getName())) {
				return true;
			}
		}
		return false;
	}
}
