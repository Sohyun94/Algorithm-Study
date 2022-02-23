package com.ssafy.ws10;

public class SeriesMovie extends Movie {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 필드 설정
	private int seriesNum; // 해당 영화가 시리즈 몇 탄
	private String episode; // 해당 영화 부제목

	// 기본 생성자
	public SeriesMovie() {
	}

	// 생성자 설정
	SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, director, genre, runningTime);
		// 부모 클래스 생성자 가져오기
		this.seriesNum = seriesNum;
		this.episode = episode;
	}

	// Getter, Setter
	public int getSeriesNum () {
		return seriesNum;
	}
	public void setSeriesNum (int seriesNum) {
		this.seriesNum = seriesNum;
	}
	public String getEpisode() {
		return episode;
	}
	public void setEpisode(String episode) {
		this.episode = episode;
	}
	
	@Override
	public String toString() {
		return "영화 기본 정보 [아이디 : " + getId() + ", 제목 : " + getTitle() + ", 감독 : " + getDirector() + ", 장르 : " + getGenre() + ", 상영 시간 : " + getRunningTime() + ", 회차 : " + seriesNum + ", 에피소드 : " + episode + "]"; 
	}
	
	

}
