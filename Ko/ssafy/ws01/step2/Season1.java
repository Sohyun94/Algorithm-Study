package com.ssafy.ws01.step2;

import java.util.Scanner;

public class Season1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (int birthday;;) {
//			System.out.println("월 입력>>");
//			birthday = sc.nextInt();
//			if (3 <= birthday && birthday <= 5)
//				System.out.printf("%d월은 봄입니다.", birthday);
//			else if (6 <= birthday && birthday <= 8)
//				System.out.printf("%d월은 여름입니다.", birthday);
//			else if (9 <= birthday && birthday <= 11)
//				System.out.printf("%d월은 가을입니다.", birthday);
//			else if (12 == birthday || (1 <= birthday && birthday <= 2))
//				System.out.printf("%d월은 겨울입니다.", birthday);
//			else if (birthday == 0) {
//				System.out.println("반복을 중단합니다");
//				break;
//			} else
//				System.out.println("올바른 월을 입력하세요.");
//		}

		for (int birthday;;) {
			System.out.println("월 입력>>");
			birthday = sc.nextInt();
			if (birthday < 0 || birthday > 12)
				System.out.println("올바른 월을 입력하세요.");
			else if (birthday == 0) {
				System.out.println("반복을 중단합니다");
				break;
			} else if (12 == birthday || birthday <= 2) {
				System.out.printf("%d월은 겨울입니다.", birthday);
				continue;
			} else if (birthday <= 5) {
				System.out.printf("%d월은 봄입니다.", birthday);
				continue;
			} else if (birthday <= 8) {
				System.out.printf("%d월은 여름입니다.", birthday);
				continue;
			} else if (birthday <= 11) {
				System.out.printf("%d월은 가을입니다.", birthday);
				continue;
			} else
				System.out.println("올바른 월을 입력하세요.");
		}

	}
}
