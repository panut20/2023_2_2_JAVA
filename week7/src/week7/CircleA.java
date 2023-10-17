package week7;

public class CircleA {
	static final double PI = 3.14;
	double area;
	public void GetArea(double r) {
		area = PI * r * r;
	}
}
class CircleB extends CircleA{
	double circum;
	public void GetCircum(double r) {
		circum = 2*PI*r;
	}
}
