package com.ssafy.ws01.step2;

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birthday = -1;

		do {
			birthday = sc.nextInt();
			switch (birthday) {
			case 0:
				break;

			case 3:
			case 4:
			case 5:
				System.out.printf("%d월은 봄입니다.", birthday);
				continue;

			case 6:
			case 7:
			case 8:
				System.out.printf("%d월은 여름입니다.", birthday);
				continue;

			case 9:
			case 10:
			case 11:
				System.out.printf("%d월은 가을입니다.", birthday);
				continue;

			case 12:
			case 1:
			case 2:
				System.out.printf("%d월은 겨울입니다.", birthday);
				continue;

			default:
				System.out.println("그런 월은 존재하지 않습니다(그만하려면 0을 입력하세요).");
			}
		} while (birthday != 0);

	}
}
