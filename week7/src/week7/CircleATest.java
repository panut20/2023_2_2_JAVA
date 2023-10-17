package week7;

public class CircleATest {

	public static void main(String[] args) {
		CircleB a = new CircleB();
		a.GetArea(3.5);
		a.GetCircum(3.5);
		System.out.println("반지름 3.5인 원의 넓이: "+a.area);
		System.out.println("반지름 3.5인 원의 둘레: "+a.circum);
	}

}
