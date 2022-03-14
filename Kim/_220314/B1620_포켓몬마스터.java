package _220314;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1620_포켓몬마스터 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 포켓몬 저장해서 검색할 맵과 해쉬맵 생성
		// 이름, 번호로 둘 다 찾을 수 있어야 돼서 String이랑 Integer
		Map<String, Integer> pkm = new HashMap<>();
		int N = sc.nextInt(); // 도감에 수록된 포켓몬 수
		int M = sc.nextInt(); // 맞혀야 하는 문제 수
		String[] name = new String[N]; // 포켓몬 이름 담을 문자열 배열
		for (int i = 0; i < N; i++) {
			// key에 이름 담고, value에 순서 담기
			pkm.put(name[i] = sc.next(), i + 1);
		}
		for (int i = 0; i < M; i++) { // 문제가 M개 나오니까
			String input = sc.next(); // 포켓몬 입력
			if ('0' <= input.charAt(0) && input.charAt(0) <= '9') { // 문자(포켓몬 이름) 입력하면
				System.out.println(name[Integer.parseInt(input) - 1]); // 숫자 나옴
			} else { // 숫자 입력하면
				System.out.println(pkm.get(input)); // 그 순서에 있는 포켓몬 이름 나옴
			}
		}

	}

}
