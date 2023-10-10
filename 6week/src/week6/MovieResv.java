package week6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieResv {
		//좌석을 표시할 배열
		String [][] seat = new String[5][10];
		//좌석에 따른 배열의 행번호, 열번호, 기능동작
		char rn;
		int row_int, col, system;
		boolean confirm;
		//이름을 확인받을 변수, 이름을 받을 변수, 취소에 쓸 이름, 열 이름, 예약여부표시
		String con_char, name, c_name, row, q;
		String pw = "java"; // pw = 관리자 비밀번호
		
		public void Interface() {
			System.out.println("안녕하세요. 좌석 예얏 시스템입니다.");
			System.out.println("번호를 선택하세요.");
			System.out.println("예약(1), 취소(2), 좌석조회(3), 종료(4)");
			Scanner scan = new Scanner(System.in);
			try {
				system = scan.nextInt();
				switch(system) {
				case 0:			//관리모드 로그인
					Admin();	
					break;
				case 1:			//예약모드
					Reservation();
					break;
				case 2:			//취소모드
					Cancel();
					break;
				case 3:			//좌석조회
					Reference();
					break;
				case 4:			//시스템 종료
					System.out.println("시스템을 종료합니다.");
					break;
				}
			}catch(InputMismatchException e) {
					System.out.println("잘못입력하셨습니다.");
				}
			}
	
		//관리자 모드
		public void Admin() {
			System.out.println("관리자 비밀번호를 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			if(scan.nextLine().equals(pw)) {
				System.out.println("관리자 로그인 되었습니다.");
				confirm = true; 	// 관리자 로그인 확인용 true
				do {
					try {
						System.out.print("취소(1), 좌석조회(2), 종료(3): ");
						system = new Scanner(System.in).nextInt();
						switch(system) {
						case 1:			//좌석취소
							AdminCancel();
							break;
						case 2:			//좌석조회
							AdminRef();
							break;
						case 3:			//관리자모드 종료
							System.out.println("관리자모드 종료");
							confirm = false;
							break;
						}
					}catch(InputMismatchException e) {
						System.out.println("잘못입력하셨습니다.");
					}
				}while(confirm);	//관리자 모드인 이상 무한 반복.
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		
		//좌석 초기화
		public void Initialize() {
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					seat[i][j]="____";	//좌석 초기화
				}
			}
		}
		
		//관리자 좌석조회 모드
		public void AdminRef() {
			rn = 'A';
			for(int i=0;i<5;i++) {
				System.out.println(rn+"열 ");
				col = 1;
				rn++;	// 'B' -> 'C' -> ... 아스킷코드 영향.
				for(int j=0;j<10;j++) {
					q = seat[i][j].equals("____")?" ◻ ":" ◼ ";	// 좌석이 비어있으면 비어있는 네모를 넣어서 예매 상황 체크. 삼항연산자
					System.out.println(col + q);
					col++;
				}
				System.out.println();
			}
		}
		
		//좌석조회 모드
		public void Reference() {
			rn = 'A';
			for(int i=0;i<5;i++) {
				System.out.println(rn+"열 ");
				col = 1;
				rn++;	// 'B' -> 'C' -> ... 아스킷코드 영향.
				for(int j=0;j<10;j++) {
					q = seat[i][j].equals("____")?" ◻ ":" ◼ ";	// 좌석이 비어있으면 비어있는 네모를 넣어서 예매 상황 체크. 삼항연산자
					System.out.println(col + q);
					col++;
					}
				System.out.println(); 
				}
			}
		
		//예약
		public void Reservation() {
			Reference();	//예약하기 전에 예매현황 조회
			do {
				confirm = true;
				System.out.println("예약자 성함을 입력해주세요 : ");
				Scanner scan = new Scanner(System.in);
				name = scan.nextLine();
				System.out.println("예약자 성함을 확인해주세요: "+name);
				System.out.println("맞으면 Y, 틀리면 N : ");
				con_char = scan.next();
				confirm=(con_char.equals("Y"))||con_char.equals("y")?false:true;
			}while(confirm);	//예약자 이름 입력받고 맞는지 확인될 때까지 반복. 확인됐다면 다음.
			do {
				confirm = true;
				System.out.println("열을 선택하세요(A~E): ");
				Scanner scan = new Scanner(System.in);
				try {
					row = scan.next();
				} catch (Exception e) {
					System.out.println("A~E만 입력하세요.");
				}
				if(row.equals("A")||row.equals("a")){
					row_int = 0;
					confirm = false;
				}else if(row.equals("B")||row.equals("b")){
					row_int = 1;
					confirm = false;
				}else if(row.equals("C")||row.equals("c")){
					row_int = 2;
					confirm = false;
				}else if(row.equals("D")||row.equals("d")){
					row_int = 3;
					confirm = false;
				}else if(row.equals("E")||row.equals("e")){
					row_int = 4;
					confirm = false;
				}else {
					System.out.println("A~E만 입력하세요");
				}
			}while(confirm);	//A~E까지의 열을 입력받고 맞게 입력됐다면 다음.
			do {
				confirm = true;
				Scanner scan = new Scanner(System.in);
				try {
					System.out.println("좌석 번호를 선택해주세요. 1~10: ");
					col = scan.nextInt();
					if(col>=1 && col <=10) {
						if(seat[row_int][col-1].equals("____")) {
							seat[row_int][col-1]=name;
							confirm = false;
						}else {
							System.out.println("이미 예약된 자리입니다.");
						}
					}else {
						System.out.println("좌석은 1~10번 까지입니다.");
					}
				} catch (Exception e) {
					System.out.println("좌석은 1~10번 까지입니다.");
				}
			}while(confirm);	//1~10번 까지의 좌석을 입력받고 예약된 자리인지 확인 후 비어있다면 이름을 넣어 예약 완료.
		}
		
		//관리자 모드용 취소모드 이름을 입력받고 동일한 이름의 좌석이 있다면 ____로 덮어 씌운 후 취소 확인.
		public void AdminCancel() {
			System.out.println("이름을 입력하세요");
			Scanner scan = new Scanner(System.in);
			c_name = scan.nextLine();
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(seat[i][j].equals(c_name)) {
						seat[i][j]="____";
						System.out.println(c_name+"님 취소가 완료되었습니다.");
						AdminRef();		
					}
				}
			}
		}
		
		//취소모드 이름을 입력받고 동일한 이름의 좌석이 있다면 ____로 덮어 씌운 후 취소 확인.
		public void Cancel() {
			System.out.println("이름을 입력하세요");
			Scanner scan = new Scanner(System.in);
			c_name = scan.nextLine();
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(seat[i][j].equals(c_name)) {
						seat[i][j]="____";
						System.out.println(c_name+"님 취소가 완료되었습니다.");
						AdminRef();
					}
				}
			}
		}
		
		

	public static void main(String[] args) {
		MovieResv movie = new MovieResv();
		//좌석 초기화 후 4입력 될때까지 실행.
		movie.Initialize();
		while(true) {
			movie.Interface();
			if(movie.system == 4) {
				break;
			}
		}

	}

}
