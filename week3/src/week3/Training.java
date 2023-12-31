package week3;

import java.util.Scanner;

public class Training {

	public static void main(String[] args) {
		
		int month=0;
		
		System.out.print("일수를 알고 싶은 월을 입력하세요(ex. 1월=1): ");
		Scanner a = new Scanner(System.in);
		
		month = a.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월은 31일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월은 30일까지 있습니다.");
			break;
		case 2:
			System.out.print("연도를 입력하세용: ");
			
			int year = a.nextInt();
			
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year+"년 "+month+"월은 윤년이며 29일까지 있습니다.");
			}
			else {
				System.out.println(year+"년 "+month+"월은 평년이며 28일까지 있습니다.");
			}
			break;	
		default:
			System.out.println("숫자만 기입하여 다시 입력 해주세요. ex. 1월: 1");
			break;
		
		}
		a.close();
	}
	
}
