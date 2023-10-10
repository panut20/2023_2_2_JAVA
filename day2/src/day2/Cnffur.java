package day2;

import java.util.Scanner;

public class Cnffur {

	public static void main(String[] args) {
		int a, b;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자(a)를 입력하세요: ");
		a = s.nextInt();
		System.out.println("두 번째 숫자(b)를 입력하세요: ");
		b = s.nextInt();
		
		if(a>b) {
			System.out.println("a("+a+") 와 "+"b("+b+") 중 "+"a("+a+")가 더 큽니다");
		}else if(a<b) {
			System.out.println("a("+a+") 와 "+"b("+b+") 중 "+"b("+b+")가 더 큽니다");
		}else {
			System.out.println("두 숫자가 같습니다.");
		}
		s.close();
	}

}
