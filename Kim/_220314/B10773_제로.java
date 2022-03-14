package _220314;

import java.util.Scanner;
import java.util.Stack;

public class B10773_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // 입력받을 정수 수
		Stack<Integer> nums = new Stack<>(); // 스택 만들어 주기
		for (int i = 0; i < k; i++) {
			int n = sc.nextInt(); // 숫자들 입력받기
			if (n == 0)
				nums.pop(); // 입력받은 숫자 n이 0이면 top에 있는 숫자 꺼내서 버리고
			else
				nums.push(n); // 아니면 n을 스택에 쌓기
		} // 스택에 입력받기 끝
		int ans = 0; // 합계 담을 변수
		// 스택에 담겨 있는 숫자들 합 구하기
		while (!nums.isEmpty()) {
			ans += nums.pop();
		}
		System.out.println(ans);

	}

}
