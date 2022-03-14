package _220307;

import java.util.Scanner;

public class B14500_테트로미노 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 세로
		int M = sc.nextInt(); // 가로
		int sum = 0; // 테트로미노 합계
		int paper[][] = new int[N][M]; // 입력받을 종이
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				paper[i][j] = sc.nextInt();
			}
		} // 종이 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int max = 0; // 최댓값
				// 1. 긴 막대(세로)
				if (i <= N - 4) {
					max = paper[i][j] + paper[i + 1][j] + paper[i + 2][j] + paper[i + 3][j];
					if (max > sum)
						sum = max;
				}
				// 긴 막대 (가로)
				if (j <= M - 4) {
					max = paper[i][j] + paper[i][j + 1] + paper[i][j + 2] + paper[i][j + 3];
					if (max > sum)
						sum = max;
				}

				// 2. 정사각형
				if (i <= N - 2 && j <= M - 2) {
					max = paper[i][j] + paper[i + 1][j] + paper[i][j + 1] + paper[i + 1][j + 1];
				}
				// 3. 니은 모양 └
				if (i <= N - 3 && j <= M - 2) {
					max = paper[i][j] + paper[i + 1][j] + paper[i + 2][j] + paper[i + 2][j + 1];
					if (max > sum)
						sum = max;
					// 얘는 기역 모양이라고 해야 하나? 7 이런 형태
					max = paper[i][j] + paper[i][j + 1] + paper[i + 1][j + 1] + paper[i + 2][j + 1];
					if (max > sum)
						sum = max;
					// 기역 뒤집은 모양 ┌
					max = paper[i][j] + paper[i + 1][j] + paper[i + 2][j] + paper[i][j + 1];
					if (max > sum)
						sum = max;
					// 4. 번개 모양
					max = paper[i][j] + paper[i + 1][j] + paper[i + 1][j + 1] + paper[i + 2][j + 1];
					if (max > sum)
						sum = max;
					// 5. ㅏ 모양
					max = paper[i][j] + paper[i + 1][j] + paper[i + 2][j] + paper[i + 1][j + 1];

				}
				if (i <= N - 2 && j <= M - 3) {
					// 하...
				}
			}
		} // for문 끝

	}// main

}
