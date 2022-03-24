package _220215;

import java.util.Scanner;

public class Boj_1652_누울자리찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 방의 크기 담당하는 2차원 배열 생성
		// (하나씩 담을 거니까 char로)
		char room[][] = new char[101][101];
		// 가로, 세로 자릿수 초기화
		int row = 0;
		int col = 0;
		for (int i = 0; i < N; i++) {
			// 문자열 입력받음
			String xx = sc.next();
			for (int j = 0; j < N; j++) {
				room[i][j] = xx.charAt(j);
			} // for문 괄호(j)
		} // for문 괄호(i)
			// 누울 수 있는지 체크
		for (int i = 0; i < N; i++) {
			// 가로, 세로 빈 칸(.) 초기화
			int rowdot = 0;
			int coldot = 0;
			for (int j = 0; j < N; j++) {
				// 가로 확인
				if (room[i][j] == '.') {
					rowdot++;
				}
				// 짐에 닿거나 벽에 닿거나
				if (room[i][j] == 'X' || (j == N - 1)) {
					// 그러면서 점이 2개 이상이면
					if (rowdot >= 2) {
						// 가로로 누울 자리 증가
						row++;
					}
					// 점 개수 초기화
					rowdot = 0;
					// 두 번째 if문 괄호
				} // 첫 번째 if문 괄호
					// 세로 확인
				if (room[j][i] == '.') {
					coldot++;
				}
				if (room[j][i] == 'X' || (j == N - 1)) {
					if (coldot >= 2) {
						col++;
					}
					coldot = 0;
					// 두 번째 if문 괄호
				} // 첫 번째 if문 괄호
			} // for문 괄호
		} // 방의 크기 N번 돌리는 for문 괄호
		System.out.printf("%d %d", row, col);
	}// main 함수 괄호

}
