package week3;

import java.util.Scanner;

public class SimpleFor2 {

	public static void main(String[] args) {
		int sum=0;
		int nu=0;
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("합계를 내고 싶은 수를 입력하세요: ");
		nu = a.nextInt();
		
		for(int i=1;i<=nu;i++) {
			sum+=i;
			System.out.println("1부터 "+i+"까지의 합은 "+sum+"입니다.");
		}
		a.close();
	}

}
