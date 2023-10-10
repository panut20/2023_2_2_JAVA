package week6;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		String a [] = {"홍길동", "로빈훗","이순신","정약용","이황","정우성","고현정","김명수","홍진경","이영자","이준기"};
//		a[0] = "홍길동";
//		a[1] = "로빈훗";
//		a[2] = "이순신";
//		a[3] = "정약용";
//		a[4] = "이황";
//		a[5] = "정우성";
//		a[6] = "고현정";
//		a[7] = "김명수";
//		a[8] = "홍진경";
//		a[9] = "이영자";
//		a[10] = "이준기";
		Arrays.sort(a);
		for(int i=0; i<a.length;i++) {
			System.out.println("[i="+i+"].....["+a[i]+"]");
		}

	}

}
