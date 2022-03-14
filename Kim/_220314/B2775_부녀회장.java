package _220314;

import java.util.Scanner;

public class B2775_부녀회장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) { // 테스트 케이스
			int level = sc.nextInt(); // 층
			int room = sc.nextInt(); // 호수
			// 아파트 배열 생성 (0부터 14층, 14호까지 있음)
			int[][] apt = new int[15][15];
			// 기본으로 세팅되어 있는 사람 수 채우기
			for (int i = 0; i < 15; i++) {
				// 각 층 1호에는 무조건 1명씩 거주(바로 아랫층 이전 호수까지의 합)
				apt[i][1] = 1;
				// 0층 i호에는 i명이 살고 있음(즉, 0층 1호에는 1명, 2호에는 2명)
				apt[0][i] = i;
			}
			for (int i = 1; i < 15; i++) { // 0층 채웠으니까 1층부터 시작
				for (int j = 2; j < 15; j++) { // 1호 다 채웠으니까 2호부터 시작
					// apt[i][j-1] <- 아랫층 내 호수 -1까지 다 합친 사람 수 들어감
					// apt[i-1][j] <- 아랫층 내 호수에 -1한 사람 수
					// 둘이 합치면 현재 거주 중인 사람 수 나옴
					apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
				}
			} // for문
			System.out.println(apt[level][room]);
		}
	}

}
