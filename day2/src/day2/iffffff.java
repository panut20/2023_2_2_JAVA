package day2;

import java.util.Scanner;

public class iffffff {
	
	public int arr(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {

		int muge;
		Scanner s = new Scanner(System.in);
		
		System.out.println("체중을 입력하시오.");
		muge = s.nextInt();
		
		if(muge>100) {
			System.out.println("고도비만입니다.");
		}else if(muge>80) {
			System.out.println("비만입니다.");
		}else if(muge>60) {
			System.out.println("표준입니다.");
		}else {
			System.out.println("미달입니다.");
		}
		System.out.println("당신의 체중은"+muge+"킬로그램입니다.");

		iffffff arr = new iffffff();
		
		System.out.println(arr.arr(10,10));
	
		s.close();
	}

}
