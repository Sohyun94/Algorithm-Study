```java
public interface IMovieManager {

	// 영화 추가 메소드
	public void add(Movie movie);

	// 영화 목록 조회 메소드
	public Movie[] getList();

	// 일반 영화 조회 메소드
	public Movie[] getMovies();

	// 시리즈 영화 조회 메소드
	public Movie[] getSeriesMovies();

	// 영화 제목 검색 메소드
	public Movie[] searchByTitle(String title) throws TitleNotFoundException;

	// 평균 상영 시간 출력 메소드
	public double getRunningTimeAvg();

}

```

