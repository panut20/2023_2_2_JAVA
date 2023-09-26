package week4;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		//사용자로부터 5명의 성적을 입력 받아서 평균을 구하는 프로그램을 배열로 작성.
		
		final int STUDENTS = 5;
		int total = 0;
		Scanner s = new Scanner(System.in);
		
		int [] scores = new int[STUDENTS];
		for(int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하세요: ");
			scores[i] = s.nextInt();
		}
		for(int i = 0; i< scores.length; i++) {
			total+=scores[i];
		}
		System.out.println("평균 성적은 "+total/STUDENTS+"입니다.");
		s.close();
		
	}

}
