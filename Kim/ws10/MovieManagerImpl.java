package com.ssafy.ws10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.ws10.Movie;

public class MovieManagerImpl implements IMovieManager {

// 객체로 쓸 영화들 불러오기
	Movie m = new Movie(0, "스토커", "박찬욱", "스릴러", 120);
	Movie m2 = new Movie(1, "인셉션", "크리스토퍼 놀란", "SF", 131);
	{

//movie.dat 파일 객체 outputstream 작성 후 직렬화
		try (FileOutputStream fos = new FileOutputStream("movie.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(m);
			oos.writeObject(m2);
		} catch (Exception e) {
			System.out.println("직렬화를 할 수 없습니다.");

		}

//inputstream 이용하여 역직렬화
		Movie m = null;
		Movie m2 = null;

		try (FileInputStream fis = new FileInputStream("movie.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			m = (Movie) ois.readObject();
			m2 = (Movie) ois.readObject();
		} catch (Exception e) {
			System.out.println("역직렬화를 할 수 없습니다.");
		}
		System.out.println(m.toString());
		System.out.println(m2.toString());

	}

//싱글턴 패턴
	private static IMovieManager mm = new MovieManagerImpl();

//기본 생성자 접근 제한
	private MovieManagerImpl() {

	}

//싱글턴 객체 반환
	static IMovieManager getInstance() {
		return mm;
	}

// 영화 기본 정보 저장하는 배열
	private List<Movie> movieList = new ArrayList<>();

// 영화 추가하는 메서드
	public void add(Movie movie) {
		movieList.add(movie);
	}

//전체 영화 조회
	public Movie[] getList() {
		Movie[] fullList = movieList.toArray(new Movie[movieList.size()]);

		return fullList;
	}

//일반 영화(시리즈 영화가 아닌 영화) 조회
	public Movie[] getMovies() {
		// 일반 영화 기본 정보 저장하는 배열
		List<Movie> notSeriesMovieList = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {
			if (!(movieList.get(i) instanceof SeriesMovie)) {
				notSeriesMovieList.add(movieList.get(i));
			}
		}
		Movie[] notSeriesList = notSeriesMovieList.toArray(new Movie[notSeriesMovieList.size()]);

		return notSeriesList;
	}

//시리즈 영화 조회
	public Movie[] getSeriesMovies() {

		// 시리즈 영화 기본 정보 저장하는 배열
		List<Movie> seriesMovieList = new ArrayList<>();
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i) instanceof SeriesMovie) {
				seriesMovieList.add(movieList.get(i));
			}
		}
		Movie[] seriesList = seriesMovieList.toArray(new Movie[seriesMovieList.size()]);

		return seriesList;
	}

//영화 검색 결과 조회에 예외 처리
	public Movie[] searchByTitle(String title) throws TitleNotFoundException {
//영화 검색 목록 저장하는 배열
		List<Movie> searchMovieList = new ArrayList<>();

		// 검색어가 들어가 있는 영화 저장
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				searchMovieList.add(movieList.get(i));
			}
		}
		if (searchMovieList.size() == 0) {
			throw new TitleNotFoundException(title);
		}
		Movie[] searchList = searchMovieList.toArray(new Movie[searchMovieList.size()]);

		return searchList;
	}

	// 평균 상영 시간 구하기
	public double getRunningTimeAvg() {
		double avg = 0.0;
		double sum = 0.0;
		for (int i = 0; i < movieList.size(); i++) {
			sum += movieList.get(i).getRunningTime();
		}
		return avg = sum / movieList.size();

	}
}
