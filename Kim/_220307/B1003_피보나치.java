package _220307;

import java.util.Scanner;

public class B1003_피보나치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) { //테스트 케이스 돌리기
			int N = sc.nextInt();
		//테스트 케이스마다 초기화
		// 이게 접근법이.. f(0) = 0 / f(1) = 1 / f(2)= f(1) + f(0) = 1 + 0
		// f(3) = f(2) + f(1) = f(1) + f(1) + f(0) = 1 + 1 + 0
		// f(4) = f(3) + f(2) = f(2) + f(1) + f(1) + f(0) = f(1) + f(0) + f(1) + f(1) + f(0) = 1 + 0 + 1 + 1 + 0
		// 이런 식으로 1이랑 0이 몇 번 쓰이는지를 이용하여 계산하면 될 것 같음
		int zero[] = new int[41]; // 0 개수 세어 줄 배열 (N이 40보다 작다 했으니 넉넉하게 41칸)
		int one[] = new int[41]; // 1 개수 세어 줄 배열
		zero[0] = 1; // 0일 땐 0이 1개 쓰이니까 1
		zero[1] = 0; // 1일 땐 1이 0개 쓰이니까 0
		one[0] = 0; // 0일 땐 1이 0개 쓰이니까 0
		one[1] = 1; //1일 땐 1이 1개 쓰이니까 1
		//피보나치 수열에서 0과 1이 몇 개 쓰이는지 확인
		for(int i = 2; i <=40; i++) { //i-1랑 i-2 활용할 거니까 i가 2부터 시작함
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
			System.out.println(zero[N] + " " + one[N]);
		}

	}//main

}
