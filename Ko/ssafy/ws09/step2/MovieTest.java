package com.ssafy.ws09.step2;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie(20220105, "비전공자들의 반란", "고동훤", "호러", 365 * 24 * 60);
		SeriesMovie sM1 = new SeriesMovie(20220126, "전공자들의 수모", "고동훤", "코미디", 30 * 24 * 60, 1, "비전공자들의 추격");
		SeriesMovie sM2 = new SeriesMovie(20220127, "전공자들의 수모", "고동훤", "코미디", 24 * 60, 2, "비전공자들의 추월");

		IMovieManager mm = MovieManagerImpl.getInstance();

		mm.add(m1);
		mm.add(sM1);
		mm.add(sM2);

		for (Movie m : mm.getList())
			System.out.println(m.toString());
		System.out.println();

		for (Movie m : mm.getMovies())
			System.out.println(m.toString());
		System.out.println();

		for (Movie m : mm.getSeriesMovies())
			System.out.println(m.toString());
		System.out.println();

		for (Movie m : mm.searchByTitle("비전공자들의 반란"))
			System.out.println(m.toString());
		System.out.println();

		try {
			for (Movie m : mm.searchByTitle("전공자의 역습"))
				System.out.println(m.toString());
			System.out.println();
		} catch (TitleNotFoundException e) {
			System.out.println("그런일은 벌어지지 않습니다.");
			System.out.println();
		}

		System.out.println(mm.getRunningTimeAvg());

	}
}