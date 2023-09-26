package week4;

public class SimpleMethod02 {
	
	static void hol(int a, int b) {
		
		if(a%2==0) {
		System.out.println(a+"는 짝수입니다.");
		}else if(a%2==1) {
			System.out.println(a+"는 홀수입니다.");
		}
		
		if(b%2==0) {
			System.out.println(b+"는 짝수입니다.");
			}else if(a%2==1) {
				System.out.println(b+"는 홀수입니다.");
			}
	}

	public static void main(String[] args) {
		
		hol(5,12);

	}

}
