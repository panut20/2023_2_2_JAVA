package week7;

class ClssA{
	public ClssA() {
		System.out.println("ClssA의 생성자");
	}
	public ClssA(int a) {
		System.out.println("ClssA의 생성자: 인수="+a);
	}
}

class ClssB extends ClssA{
	int a =11;
	public ClssB() {
		System.out.println("ClssB의 생성자");
	}
	public ClssB(int a) {
		super(10);
		System.out.println("ClssB의 생성자: this 인수="+this.a+" 인수="+a);
	}
}

public class InhcontrtEx2 {

	public static void main(String[] args) {
		ClssB a = new ClssB(5);
	}

}

