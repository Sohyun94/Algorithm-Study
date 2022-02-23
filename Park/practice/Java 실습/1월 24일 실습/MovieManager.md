```java
import java.util.Arrays;

public class MovieManager {

	// 최대 사이즈
	private static final int MAX_SIZE = 100;

	// 영화 정보 저장 배열
	private Movie[] movieList = new Movie[MAX_SIZE];

	// 영화 정보 저장 인덱스
	private int size = 0;

	// 영화 추가
	public void add(Movie movie) {

		if (size == MAX_SIZE) {
			System.out.println("더이상 영화를 추가할 수 없습니다.");
			return;
		}

		movieList[size] = movie;
		size++;
	}

	// 영화 전체 조회
	public Movie[] getList() {
		
		return Arrays.copyOfRange(movieList, 0, size);
	}

	// 일반 영화 조회
	public Movie[] getMovies() {

		// 일반 영화 정보 저장 배열 생성
		Movie[] generalMovieList = new Movie[size];

		for (int i = 0; i < size; i++) {

			int index = 0;

			if (!(movieList[i] instanceof SeriesMovie)) {
				generalMovieList[index] = movieList[i];
				index++;
			}

		}

		return generalMovieList;
	}

	public Movie[] getSeriesMovies() {

		// 시리즈 영화 정보 저장 배열 생성
		Movie[] seriesMovieList = new Movie[size];

		for (int i = 0; i < size; i++) {

			int index = 0;

			if (movieList[i] instanceof SeriesMovie) {
				seriesMovieList[index] = movieList[i];
				index++;
			}

		}

		return seriesMovieList;
	}

	public Movie[] searchByTitle(String title) {

		// 검색한 영화 목록을 저장할 배열 생성
		Movie[] searchMovieList = new Movie[size];

		// 검색한 키워드가 포함된 영화 저장
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				searchMovieList[i] = movieList[i];
			}
		}

		return searchMovieList;
	}

	public double getRunningTimeAvg() {

		// 평균 시간을 저장할 변수 생성
		double avg = 0;

		// 총 상영 시간 저장 변수
		double sum = 0;

		// 상영 시간 더하는 로직
		for (int i = 0; i < size; i++) {
			sum += movieList[i].getRunningTime();
		}

		// 평균 계산
		avg = sum / size;

		return avg;
	}

}
```

