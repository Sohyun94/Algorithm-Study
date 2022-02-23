```java
import java.util.ArrayList;
import java.util.List;

public class MovieManagerImpl implements IMovieManager {

	// singleton
	private static IMovieManager mm = new MovieManagerImpl();

	// 객체를 생성하지 못하도록 기본 생성자 접근 제한
	private MovieManagerImpl() {

	}

	// singleton 객체 반환
	static IMovieManager getInstance() {
		return mm;
	}

	// 영화 정보 저장 배열
	private List<Movie> movieList = new ArrayList<>();

	// 영화 추가
	public void add(Movie movie) {

		movieList.add(movie);

	}

	// 영화 전체 조회
	public Movie[] getList() {

		Movie[] allList = movieList.toArray(new Movie[movieList.size()]);

		return allList;
	}

	// 일반 영화 조회
	public Movie[] getMovies() {

		// 일반 영화 정보 저장 배열 생성
		List<Movie> generalMovieList = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {

			if (!(movieList.get(i) instanceof SeriesMovie)) {
				generalMovieList.add(movieList.get(i));
			}

		}

		Movie[] generalList = generalMovieList.toArray(new Movie[generalMovieList.size()]);

		return generalList;
	}

	// 시리즈 영화 조회
	public Movie[] getSeriesMovies() {

		// 시리즈 영화 정보 저장 배열 생성
		List<Movie> seriesMovieList = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {

			if (movieList.get(i) instanceof SeriesMovie) {
				seriesMovieList.add(movieList.get(i));
			}

		}

		Movie[] seriesList = seriesMovieList.toArray(new Movie[seriesMovieList.size()]);

		return seriesList;
	}

	// 검색 결과 조회
	public Movie[] searchByTitle(String title) {

		// 검색한 영화 목록을 저장할 배열 생성
		List<Movie> searchMovieList = new ArrayList<>();

		// 검색한 키워드가 포함된 영화 저장
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				searchMovieList.add(movieList.get(i));
			}
		}

		Movie[] searchList = searchMovieList.toArray(new Movie[searchMovieList.size()]);

		return searchList;
	}

	// 평균 상영 시간 조회
	public double getRunningTimeAvg() {

		// 평균 시간을 저장할 변수 생성
		double avg = 0;

		// 총 상영 시간 저장 변수
		double sum = 0;

		// 상영 시간 더하는 로직
		for (int i = 0; i < movieList.size(); i++) {
			sum += movieList.get(i).getRunningTime();
		}

		// 평균 계산
		avg = sum / movieList.size();

		return avg;
	}

}
```

