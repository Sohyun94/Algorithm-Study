package _220215;

import java.util.Scanner;

public class Boj_1316_그룹단어체커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단어 개수
		int N = sc.nextInt();
		// 그룹 단어 담을 변수 초기화
		int count = 0;
		for (int i = 0; i < N; i++) {
			// 입력받을 문자열
			String s = sc.next();
			// 배열 길이 변수로 지정
			int wds = s.length();
			// 그룹 단어 확인용 boolean 배열 선언
			boolean group[] = new boolean[26];
			// 그룹 단어라면 true 반환
			boolean word = true;
			// 0부터 배열 길이-1까지 반복
			for (int j = 0; j < wds; j++) {
				// 문자열을 charAt 이용해 charAt으로 나눔
				// 아스키 코드 값 'a'를 빼줘야 group 배열이랑 비교 가능
				int idx = s.charAt(j) - 'a';
				// 해당 알파벳이 group 배열에서 사용되었고
				if (group[idx]) {
					// 앞에 있는 알파벳과 중복되지 않는다면
					if (s.charAt(j) != s.charAt(j - 1)) {
						// 그룹 단어가 아니다
						word = false;
						// for문 중단
						break;
					} // 두 번째 if문 괄호
				} else {
					group[idx] = true;
				} // else문 괄호
			} // 단어 1개 확인하는 for문 괄호
			if (word)
				count++; // true 반환되면 count 더하기
		} // 전체 단어 확인하는 for문 괄호
		System.out.println(count);

	}// main 함수

}
