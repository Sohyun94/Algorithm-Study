package _220307;

import java.util.Scanner;

public class B1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 666을 포함하는 N번째로 작은 숫자를 찾아야 하니까 fin = 666으로 설정
		int fin = 666;
		int cnt = 1; // 몇 번 진행했는지 세어 줄 카운트
		String sssix = ""; // 숫자 담아줄 문자열(666 있는지 확인할)
		// 아직 횟수 N만큼 진행 안 했을 때
		while (cnt < N) {
			fin++; // 숫자 증가
			sssix = Integer.toString(fin); // 종말의 숫자(ㅋㅋ) 문자열로 변환해 넣기
			//해당 안 될 때까지 반복
			if (sssix.indexOf("666") != -1) //666이 있는 문자 위치 찾기
				cnt++;

		}//while문
		System.out.println(fin);
	}//main

}
