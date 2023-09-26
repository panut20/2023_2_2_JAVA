package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExcpt {

	public static void main(String[] args) {
		int k1, k2;
		Scanner s = new Scanner(System.in);
		
		
		try {
			System.out.print("분자를 입력하세요: ");
			k1 = s.nextInt();
			System.out.println("분모를 입력하세요: ");
			k2 = s.nextInt();
			
			System.out.println(k1+" 나누기 "+k2+" 는 "+k1/k2+" 입니다.");
		}
		catch (InputMismatchException e) { // 정수 이외에 값을 입력할경우.
			System.out.println("정수를 입력하세요.");	
		}
		catch (ArithmeticException e) {	// 분모에 0을 입력할경우.
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		}

	}

}
