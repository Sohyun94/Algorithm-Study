package _220307;

import java.util.Scanner;

public class B7568_덩치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] rank = new int[n]; // 등수 받을 배열
		int[] weight = new int[n]; // 무게 받을 배열
		int[] height = new int[n]; // 키 받을 배열

		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rank[i] = 1; // 등수 전부 일단 1로 설정
		} // 입력 for문
		for (int i = 0; i < n; i++) { // for문 두 개 돌리며 덩치 비교
			for (int j = 0; j < n; j++) {
				if (weight[i] < weight[j] && height[i] < height[j]) { // 이러면 i 선수 덩치가 더 작은 거니까
					rank[i]++; // i선수의 랭크 숫자 늘려 주기
				}
			}
		} // 비교 for문
		for (int i = 0; i < n; i++) {
			System.out.print(rank[i] + " ");
		}//출력

	}// main

}
