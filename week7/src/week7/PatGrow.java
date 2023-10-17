package week7;

import java.util.Scanner;

class Pat{
	public String race; //애완동물의 종류
	public String name; //애완동물의 이름
	public int age; //나이
	public int power; //파워
	public int energy; //에너지
	int count = 0;	//나이 체크용 카운트변수
	//생성자
	public Pat() {
		System.out.println("시작");
	}
	//밥먹기
	public void eat() {
		energy+=15;
		count++;
		aging();
	}
	//잠자기
	public void sleep() {
		energy+=5;
		count++;
		aging();
	}
	//운동하기
	public void exercise() {
		energy -=10;
		power +=10;
	}
	//카운트 변수에 따른 나이변화
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	//공격하기
	public void attack() {
		energy -=15;
		power +=20;
	}
	//행동을 할때마다 스탯변화 출력
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}	
}

//강아지, 상속을 받았지만 스탯변화가 다르기에 메소드 오버라이딩. 이하 행동들은 Pat과 동일.
class Dog extends Pat{
	public int count;
	public Dog(String name) {
		this.name = name;	//this를 이용하여 name 변수를 입력 받아들인 name으로 초기화.
		race = "강아지";
		age = 0;
		power = 200;
		energy = 300;
		count = 0;
		System.out.println("강아지("+name+")가 만들어졌습니다.");
	}
	public void eat() {
		energy+=15;
		count++;
		aging();
	}
	public void sleep() {
		energy+=5;
		count++;
		aging();
	}
	public void exercise() {
		energy -=20;
		power +=20;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void attack() {
		energy -=20;
		power +=30;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}

//Pat클래스와 스탯변화 동일하기에 기본적인 항목만 초기화 후 끝
class Cat extends Pat{
	public int count;
	public Cat(String name) {
		this.name = name;
		race = "고양이";
		age = 0;
		power = 100;
		energy = 200;
		count = 0;
		System.out.println("고양이("+name+")가 만들어졌습니다.");
	}
}

//Pat 클래스와 스탯변화가 다르기에 메소드 오버라이딩.
class Rabbit extends Pat{
	public int count;
	public Rabbit(String name) {
		this.name = name;
		race = "토끼";
		age = 0;
		power = 30;
		energy = 100;
		count = 0;
		System.out.println("토끼("+name+")가 만들어졌습니다.");
	}
	public void eat() {
		energy+=5;
		count++;
		aging();
	}
	public void sleep() {
		energy+=3;
		count++;
		aging();
	}
	public void exercise() {
		energy -=3;
		power +=7;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void attack() {
		energy -=10;
		power +=10;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}


public class PatGrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pat p = null;	// 자바의 다형성을 이용하여 인스턴스 생성까진 하지 않음. 이후 선택한 동물에 따른 객체 생성.
		System.out.println("애완동물을 선택하세요.");
		System.out.println("1. 강아지, 2. 고양이, 3. 토끼");
		int x = sc.nextInt();
		System.out.println("애완동물의 이름을 입력하세요.");
		String name = sc.next();
		if(x==1) {
			p = new Dog(name);
		}else if(x==2) {
			p = new Cat(name);
		}else if(x==3) {
			p = new Rabbit(name);
		}
		boolean flag = true;	//에너지 소비로 인한 게임오버까지 무한반복을 위한 true 설정.
		//숫자에 맞는 행동 수행 후 스탯변화 및 에너지에 따른 게임 종료.
		while(flag) {
			System.out.println("메뉴");
			System.out.println("1. 밥먹기 2. 잠자기 3. 운동하기 4. 공격 5. 끝");
			x = sc.nextInt();
			switch (x) {
			case 1: 
				p.eat();
				p.print();
				break;
			case 2:
				p.sleep();
				p.print();
				break;
			case 3:
				p.exercise();
				p.print();
				if(p.energy<=0) {
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 4:
				p.attack();
				p.print();
				if(p.energy <= 0) {
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 5:
				flag = false;

			}
		}
	}

}
