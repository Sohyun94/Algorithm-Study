package _220314;

import java.util.Scanner;

public class B2108_통계학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		// 1. 평균 구하기
		double avg = 0.0;
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += nums[i];
		}
		avg = sum / N;

		// 2. 중앙값 구하기
		int center = 0;
		for (int i = 1; i < N; i++) { // 버블 정렬
			for (int j = 0; j < N - 1; j++)
				if (nums[j] > nums[j + 1]) {
					int tmp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = tmp;
				}
		} // for문
		center = nums[N / 2];

		// 3. 최빈값 구하기
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		int freq = nums[0]; // 최빈값 첫 번째 값으로 초기화
		boolean flag = false;
		for (int i = 0; i < N - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				cnt++;
			} else {
				cnt = 0;
			} // else문
			if (max < cnt) {
				max = cnt;
				freq = nums[i];
				flag = true;
			} else if (max == cnt && flag == true) {
				freq = nums[i];
				flag = false;
			}
//			for(int j = 0; j < N; j++) {
//				if(num)
//			}
		} // for문
			// 4. 범위 구하기
		int range = nums[N - 1] - nums[0];

		System.out.printf("%.0f\n", avg);
		System.out.println(center + " ");
		System.out.println(freq + " ");
		System.out.println(range);
	}// main

}
