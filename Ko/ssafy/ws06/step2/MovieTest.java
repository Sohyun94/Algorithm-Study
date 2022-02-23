package com.ssafy.ws06.step2;

import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 영화 정보 관리 객체 생성
		MovieManager mm = new MovieManager();

		// 서비스 종료 여부 저장
		// 0이면 서비스 사용, 1이면 서비스 종료
		int service = 0;

		// 영화 아이디 시작 번호
		int id = 0;

		// 기존 저장된 아이디 번호 불러오기
		for (int i = 0; i < mm.getList().length; i++) {
			if (mm.getList()[i] != null) {
				id = mm.getList()[i].getId();
			}
		}

		while (service == 0) {
			System.out.println("[  메뉴 선택  ]");
			System.out.println("1. 영화 추가");
			System.out.println("2. 영화 전체 조회");
			System.out.println("3. 일반 영화 조회");
			System.out.println("4. 시리즈 영화 조회");
			System.out.println("5. 영화 검색");
			System.out.println("6. 평균 영화 상영 시간 조회");
			System.out.println("7. 서비스 종료");
			System.out.print("메뉴 번호 입력 >> ");

			int menuNum = scan.nextInt(); // 입력 받은 메뉴 번호

			if (menuNum == 1) {

				System.out.println("영화 정보를 입력하세요.");
				System.out.println("시리즈물인가요?(맞으면 1, 아니면 2)");
				int s = scan.nextInt();
				while (true) {
					if (s == 1) {
						System.out.println("id, title, director, genre, runningtime(분), seriesNum, episode 순으로 입력하세요.");

						// 입력한 정보마다 별도의 객체 생성
						Movie movie = new SeriesMovie(scan.nextInt(), scan.next(), scan.next(), scan.next(),
								scan.nextInt(), scan.nextInt(), scan.next());
						mm.add(movie);
						break;
					} else if (s == 2) {
						System.out.println("id, title, director, genre, runningtime(분) 순으로 입력하세요.");

						// 입력한 정보마다 별도의 객체 생성
						Movie movie = new Movie(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextInt());
						mm.add(movie);
						break;
					} else {
						System.out.println("다시 입력하세요");
						continue;
					}

				}
				// 추가 메소드 실행

			} else if (menuNum == 2) {
				System.out.println("영화 전체 목록입니다.");

				// null이 아닌 영화 정보 전체 출력
				for (int i = 0; i < mm.getList().length; i++) {
					if (mm.getList()[i] != null) {
						System.out.println(mm.getList()[i].toString()); // 오버라이딩한 toString 실행
					}
				}

				System.out.println();

			} else if (menuNum == 3) {
				System.out.println("일반 영화 목록입니다.");

				// null이 아닌 일반 영화 정보 전체 출력
				for (int i = 0; i < mm.getMovies().length; i++) {
					if (mm.getMovies()[i] != null) {
						System.out.println(mm.getMovies()[i].toString()); // 오버라이딩한 toString 실행
					}
				}

				System.out.println();

			} else if (menuNum == 4) {
				System.out.println("시리즈 영화 목록입니다.");

				// null이 아닌 시리즈 영화 정보 전체 출력
				for (int i = 0; i < mm.getSeriesMovies().length; i++) {
					if (mm.getSeriesMovies()[i] != null) {
						System.out.println(mm.getSeriesMovies()[i].toString()); // 오버라이딩한 toString 실행
					}
				}

				System.out.println();

			} else if (menuNum == 5) {
				System.out.print("검색하려는 영화 제목을 입력하세요. >> ");

				String title = scan.next();

				// 검색 목록 배열 가져오기
				Movie[] searchMovieList = mm.searchByTitle(title);

				System.out.println("검색하신 영화 목록입니다.");

				// 검색 목록 배열 출력
				for (int i = 0; i < searchMovieList.length; i++) {
					System.out.println(searchMovieList[i].toString());
				}

				System.out.println();

			} else if (menuNum == 6) {

				System.out.println("영화의 평균 상영 시간입니다.");

				// 평균값 가져오기
				double avg = mm.getRunningTimeAvg();

				// 평균값 출력
				System.out.println(avg + "분");

				System.out.println();

			} else if (menuNum == 7) {
				// 서비스 종료
				service = 1;
			}
		}

		System.out.println("서비스가 종료되었습니다.");

		scan.close();

	}
}
