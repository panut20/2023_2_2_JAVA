package week3;

import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random r = new Random();
		int input=0;
		while(true) {
			System.out.print("입력 (가위는0, 바위는1, 보는 2, 종료하려면 -1): ");
			input = a.nextInt();
			if(input<0) {
				break;
			}
			int saram = input; // 사람이 낸 가위, 바위, 보
			int com = r.nextInt()%3;
			if(com < 0) {
				com = com * -1;
			}
			// 가위는 0, 바위는 1, 보는 2 이외의 숫자가 입력되면 다시 입력.
			if(saram>2) {
				System.out.println();
				continue;
			}
			//사람의 입력값 출력
			if(saram==0) {
				System.out.println("당신은 가위를 냈습니다.");
			}else if(saram==1) {
				System.out.println("당신은 바위를 넀습니다.");
			}else if(saram==2){
				System.out.println("당신은 보를 냈습니다.");
			}
			
			//컴퓨터의 입력값 출력
			if(com == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
			}else if(com == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
			}else if(com == 2) {
				System.out.println("컴퓨터는 보를 넀습니다.");
			}
			System.out.println("--------------------------------------");
			System.out.print("게임 결과: ");
			
			//승패판독
			if(saram==com) {
				System.out.println("비겼습니다.");
			}else if(saram==(com+1%3)) {
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			System.out.println("--------------------------------------");
			
		}
		
		a.close();
	}

}
