package com.ssafy.ws10;

import java.util.Scanner;


public class MovieTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IMovieManager mm = MovieManagerImpl.getInstance();
		
		Movie m = new Movie(0, "스토커", "박찬욱", "스릴러", 120);
		Movie m2 = new Movie(1, "인셉션", "크리스토퍼 놀란", "SF", 131);
		SeriesMovie sm = new SeriesMovie(2, "매트릭스", "워쇼스키 형제", "SF", 153, 1, "원");
		SeriesMovie sm2 = new SeriesMovie(3, "매트릭스", "워쇼스키 형제", "SF", 142, 2, "투");
		
		mm.add(m);
		mm.add(m2);
		mm.add(sm);
		mm.add(sm2);
		
		
		//영화 제목으로 검색
		String title = sc.next();
		Movie[] searchMovieList;
		
		//제목으로 검색했을 때 나오지 않을 경우 예외 처리
		try {
			searchMovieList = mm.searchByTitle(title);
			//검색했을 때 나올 문구
			System.out.println("검색 결과");
			for (int i = 0; i <searchMovieList.length; i++) {
				if (searchMovieList[i] != null) {
					System.out.println(searchMovieList[i].toString());
				}
			}
		} catch (TitleNotFoundException e) {
			System.out.println("검색 결과가 없습니다.");
		}
		System.out.println();
	}

}
