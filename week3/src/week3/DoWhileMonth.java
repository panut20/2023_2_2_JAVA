package week3;

import java.util.Scanner;

public class DoWhileMonth {

	public static void main(String[] args) {
		int month=0;
		
		Scanner a = new Scanner(System.in);
		
		do {
		System.out.print("월을 입력하세요: ");
		month = a.nextInt();
		
		}while(month<1||month>12);
		
		System.out.println("사용자가 입력한 월은 "+month+"월");
	
		a.close();
	}

}
