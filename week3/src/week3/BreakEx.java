package week3;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		int num, sum, nu;
		sum = 0;
		num = 1;
		Scanner a = new Scanner(System.in);
		System.out.print("합계를 알고 싶은 수를 입력하세요: ");
		nu = a.nextInt();
		while(true) {
			sum+=num;
			num++;
			if(num>nu) {
				break;
			}
		}
		System.out.println("1부터 "+nu+"까지의 합은 "+sum+"입니다.");
		a.close();
	}

}
