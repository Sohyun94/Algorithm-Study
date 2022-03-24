package _220215;

import java.util.Scanner;

public class Boj_4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 입력
		int C = sc.nextInt();
		// 테스트 케이스 for문
		for (int tc = 0; tc < C; tc++) {
			// 학생 수 입력
			int std = sc.nextInt();
			// 학생 수에 따라 성적 담을 배열
			int[] arr = new int[std];
			// 성적 총합 초기화
			int sum = 0;

			// 성적 입력
			for (int i = 0; i < std; i++) {
				int score = sc.nextInt();
				// 배열에 성적 담기
				arr[i] = score;
				sum += score;
			} // for문(성적 입력)

			// 평균 (int에서 double로 묵시적 형변환)
			double avg = sum / std;
			// 평균 넘는 학생 수 초기화
			int count = 0;
			// 평균 넘는 학생 수 계산
			for (int i = 0; i < std; i++) {
				if (arr[i] > avg) {
					count++;
				} // if문
			} // for문(평균 넘는 학생 수)
				// 평균 넘는 학생 수 비율
			double avgStd = (count / std) * 100;
			System.out.printf("%.3f%%\n", avgStd);
		} // for문(테스트 케이스)
	}// main 함수

}
