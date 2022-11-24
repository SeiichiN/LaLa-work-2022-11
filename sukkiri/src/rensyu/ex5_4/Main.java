package rensyu.ex5_4;

public class Main {

	public static void main(String[] args) {
		double area1 = calcTriangleArea(10.0, 5.0);
		System.out.println("面積は" + area1);
		double area2 = calcCircleArea(5.0);
		System.out.println("面積は" + area2);
	}
	
	public static double calcTriangleArea
			      (double bottom, double height) {
		double area = bottom * height / 2.0;
		return area;
				
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}
