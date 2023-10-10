package week6;

public class ThisTest {
	public ThisTest() {
		this(10);
		System.out.println("첫번째 생성자입니다.");
	}
	public ThisTest(int n) {
		System.out.println("두번째 생성자입니다.\n"+n);	//this(10) 때문에 인자를 받는 생성자를 만들기 위해 두번째 생성자를 먼저 생성함.
	}
}
