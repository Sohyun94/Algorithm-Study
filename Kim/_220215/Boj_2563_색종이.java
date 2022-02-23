package _220215;

import java.util.Scanner;

public class Boj_2563_색종이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 색종이 수 입력
		int N = sc.nextInt();
		// 도화지 역할 2차원 배열
		int[][] paper = new int[101][101];
		// 넓이 변수 초기화
		int width = 0;
		//색종이 수 증가하는 동안 도는 for문
		for (int i = 0; i < N; i++) {
			//x좌표, y좌표 입력받음
			int x = sc.nextInt();
			int y = sc.nextInt();
			//가로 10, 세로 10 정사각형이므로 0~10 전까지의 면적 차지
			for(int j = x ; j < x + 10; j++) {
				for(int k= y; k < y + 10; k++) {
					//겹쳐진 종이라면 = 이미 면적을 계산해 준 종이라면 더하지 않음
					if(paper[j][k] == 1) {
						continue;
					}//if문 괄호
					//면적을 차지한다면
					paper[j][k] = 1;
					width++;
				}//for문(k)
			}//for문(j)
		}//for문(i)
		System.out.println(width);
	}// main

}
