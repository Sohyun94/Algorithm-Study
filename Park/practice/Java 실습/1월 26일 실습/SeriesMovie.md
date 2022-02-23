```java
public class SeriesMovie extends Movie {

	// 필드
	private int seriesNum;
	private String episode;

	// 기본 생성자
	public SeriesMovie() {
		super();
	}

	// 생성자
	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum,
			String episode) {
		super(id, title, director, genre, runningTime); // 부모 클래스 생성자 가져오기
		this.seriesNum = seriesNum;
		this.episode = episode;
	}

	// Getter, Setter
	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	// toString Override
	@Override
	public String toString() {
		return "영화 정보 [아이디 : " + getId() + ", 제목 : " + getTitle() + ", 감독명 : " + getDirector() + ", 연령 : " + getGenre()
				+ ", 상영 시간 : " + getRunningTime() + ", 시리즈 번호 : " + seriesNum + ", 회차 : " + episode + "]";
	}

}
```

