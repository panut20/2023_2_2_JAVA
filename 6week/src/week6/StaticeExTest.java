package week6;

public class StaticeExTest {

	public static void main(String[] args) {
		StaticEx a = new StaticEx();
		StaticEx b = new StaticEx();
		a.ins = 5;
		b.ins = 500;
		System.out.println("인스턴스 변수의 값은 "+a.ins+","+b.ins+"입니다.");
		a.stc = 5;
		b.stc = 500;
		System.out.println("클래스 변수의 값은 "+a.stc+","+b.stc+"입니다.");
	}

}
