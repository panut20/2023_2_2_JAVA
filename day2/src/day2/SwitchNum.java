package day2;

import java.util.Scanner;

public class SwitchNum {

	public static void main(String[] args) {
		int a;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1~3사이의 숫자를 입력하세요: ");
		a = s.nextInt();
		
		switch(a) {
		
		case 1:
			System.out.println("숫자 1을 입력하였습니다.");
			break;
		case 2:
			System.out.println("숫자 2를 입력하였습니다.");
			break;
		case 3:
			System.out.println("숫자 3을 입력하였습니다.");
			break;
		default:
			System.out.println("1~3사이의 숫자가 아닌 다른 수가 입력되었습니다.");
		}
		
		s.close();

	}

}
