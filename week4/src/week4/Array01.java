package week4;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		double avg = 0;
		int [] a = new int [10];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요.");
			num = s.nextInt();		
			a[i]=num;
		}
		
		for(int j = 0; j < a.length; j++) {
			System.out.println(j+1+"번째 숫자: "+a[j]);
			sum+=a[j];
		}
		avg = sum/10;
		System.out.println("총 합: "+sum+" 평균: "+avg);
		s.close();
	}
	
}
