package week4;

import java.util.Scanner;

public class Practice2 {
	
	static void print_header() {
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		
		final int SEAT = 10;
		
		int num = 0;
		
		int a[] = new int [SEAT];
		
		for(int i = 0; i<a.length;i++) {
			a[i]=0;
		}
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			print_header();
			
			for(int i = 0; i < a.length; i++) {
				System.out.print(i+1+" ");
			}
			
			System.out.println();
			print_header();
			
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			print_header();
			
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			num = s.nextInt();
			
			if(num == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(a[num-1] == 0) {
				a[num-1] = 1;
			}else if(a[num-1] == 1) {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
		
		
		s.close();
	}

}
