package week3;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		int num, nu;
		num = 0;
		Scanner a = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		nu = a.nextInt();
		while(true) {
			num++;
			if(num%2==1) {
				continue;
			}
			System.out.println(num);
			if(num>=nu) {
				break;
			}
		}
		a.close();
	}
}
