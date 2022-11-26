package rensyu11;

public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;

	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
