package _220307;

import java.util.Scanner;

public class B18111_마인크래프트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 세로
		int M = sc.nextInt(); // 가로
		int B = sc.nextInt(); // 가지고 있는 블록 수
		int map[][] = new int[N][M];
		long sum = 0; // 맵에 있는 블럭 값 다 더할 변수
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
				sum += map[i][j];
			}
		} // 지도 입력
		long avg = (sum + B) / (N * M); // 평균 구하기
		// 인벤토리에 있는 블럭을 활용할 수 있으므로 이것까지 합해서 맵 넓이로 나눈 것이 평균이 됨
		int maxH = (avg > 256) ? 256 : (int) avg; // 최대 높이
		// 최대 높이가 256이므로 이를 초과하면 256이 높이가 됨
		int ans = Integer.MAX_VALUE; // 최소값 구해야 되니까 대충 크게 초기화
		int height = 0; // 균등해질 높이
		for (int k = 0; k <= maxH; k++) { // 일단 최대 높이까지 for문 돌리기
			int time = 0; // 시간 0으로 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] > k) { // 배열 내부 블럭 수가 k보다 많을 때
						time += (map[i][j] - k) * 2; // 위에 있는 블럭 제거해서 인벤에 넣기 (시간 2초씩 걸림)
					} else if (map[i][j] < k) { // 배열 내부 블럭 수가 k보다 적을 때
						time += k - map[i][j]; // 위에 블럭 추가해주기
					}
				}
			}
			if (ans >= time) {
				ans = time;
				height = k;
			}
		}
		System.out.println(ans + " " + height);
	} // main

}
