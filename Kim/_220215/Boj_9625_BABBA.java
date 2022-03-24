package _220215;

import java.util.Scanner;

public class Boj_9625_BABBA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//버튼 누른 횟수 입력
		int K = sc.nextInt();
		//A를 0으로, B를 1로 두기
		int A = 0;
		int B = 1;
		//K번 누르는 동안
		for(int i = 1 ; i < K; i++) {
			//A와 B의 합을 저장
			int tmp = A + B;
			//A를 B로 스왑
			A = B;
			//B에는 A+B를 넣어줌
			B = tmp;
			
		}//for문
		System.out.println(A + " " + B);

	}//main

}
