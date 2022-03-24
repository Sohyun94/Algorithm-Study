package _220222;

import java.util.Scanner;

public class Boj_13300_반배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] stuArr = new int[2][7]; // 여자:0, 남자:1, 1~6학년, 0부터 시작이라 배열 한 칸 더 만듦
		int N = sc.nextInt(); // 학생 입력
		int K = sc.nextInt(); // 최대 인원 입력
		for (int i = 0; i < N; i++) {
			int gender = sc.nextInt(); // 성별 받기
			int grade = sc.nextInt(); // 학년 받기
			stuArr[gender][grade]++; // 1~6학년
		}
		int room = 0; // 방 0으로 초기화
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 6; j++) {
				// 학생이 있을 경우
				if (stuArr[i][j] != 0) {
					// 최대 인원으로 나누기
					if (stuArr[i][j] % K == 0) {
						room += stuArr[i][j] / K;
					} else { // 나머지가 있으면 1 더하기
						room += (stuArr[i][j] / K) + 1;
					} // else문
				} // if문
			}

		} // for문
		System.out.println(room);
	}// main
}
