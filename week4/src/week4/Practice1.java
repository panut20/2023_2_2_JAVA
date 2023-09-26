package week4;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		int human = 0;
		int num = 0;
		int count = 1;
		Random a = new Random();
		Scanner b = new Scanner(System.in);
		
		num = Math.abs(a.nextInt() % 100);
		
		do {
			System.out.println("1 ~ 100의 숫자중에 하나를 입력하세요.");
			human = b.nextInt();
			
			if(human == num) {
				System.out.println("정답입니다! 총 트라이 횟수: "+count);
				break;
			}
			if(human > num) {
				System.out.println(human+"보다 작습니다.");
			}
			if(human < num) {
				System.out.println(human+"보다 큽니다.");
			}
			
			count++;
			
			
		}while(true);
		
		b.close();
	}

}
