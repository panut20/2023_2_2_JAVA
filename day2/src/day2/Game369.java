package day2;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		int a;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("369게임을 진행할 100이하의 숫자를 입력하세요: ");
		a = s.nextInt();
		
		if(a>100) {
			System.out.println("숫자가 100보다 큽니다.");
		}else if(a % 10 == 3 || a % 10 == 6 || a % 10 == 9 || a % 30 ==0 || a % 60 == 0 || a % 90 == 0 ) {
			System.out.println("박수 짝!");
			
		}else {
			System.out.println("입력한 숫자:"+a);
		}
		
		s.close();
		

	}

}
