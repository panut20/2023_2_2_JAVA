package week6;

public class Circle {
	double r, circum, area;
	final double DD = 3.14;
	void CircleCalc(double n) {
		r = n;
		circum = 2*DD*r; // 원의 둘레
		area = r*r*DD;   // 원의 넓이
		ShowResult(this);  // Circle 이라는 객체(본인)를 가르킴.
	}
	void ShowResult(Circle c) {
		System.out.println("반지름이 "+c.r+"인 원의 둘레는 "+c.circum+" 넓이는 "+c.area+" 입니다."); // 변수에만 쓰는게 아닌 객체에도 쓴다.
	}
}
