package week7;

public class ClsA {
public ClsA() {
	System.out.println("ClsA의 생성자");
}
}

class ClsB extends ClsA{
	public ClsB() {
		System.out.println("ClsB의 생성자");
	}
}

class ClsC extends ClsB{
	public ClsC() {
		System.out.println("ClsC의 생성자");
	} 
}
