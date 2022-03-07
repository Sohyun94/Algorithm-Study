package week1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수형 입력
		
		byte bnum =sc.nextByte();
		
		short num = sc.nextShort();
		
		int age = sc.nextInt();
		
		long money = sc.nextLong();
		
		
		
		//실수형 입력
		
		float fnum = sc.nextFloat();
		
		double dnum = sc.nextDouble();
		
		
		//boolean 입력
		
		boolean flag = sc.nextBoolean();
		
		//char c = sc.nextChar()/???? : 문자 하나만을 입력 받을 수는 없음
		
		//문자열 입력
		String name = sc.next();
		
		//문자 하나만을 입력 받고 싶으면 string으로 받아서 쪼갠다
		char c = sc.next().charAt(0);
		
		
		
		
	}

}
