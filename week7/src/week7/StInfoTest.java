package week7;

public class StInfoTest {

	public static void main(String[] args) {
		subStrinfo a = new subStrinfo();
		a.name = "홍길동";
		a.phone = "010-0000-0000";
		a.age = 23;
		a.addr = "계양구 양지로7";
		System.out.println("이름: "+a.name+", 전화번호: "+a.phone+", 나이:"+a.age+", 주소: "+a.addr);
	}

}
