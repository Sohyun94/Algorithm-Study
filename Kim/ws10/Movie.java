package com.ssafy.ws10;

import java.io.Serializable;

class Movie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// 필드 설정
	private int id; //임의의 고유 정수 값
	private String title; //영화 제목
	private String director; //영화 감독
	private String genre; //장르
	private int runningTime; //상영 시간

	// 기본 생성자
	public Movie() {

	}

	// 생성자
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	//Getter, Setter
	public int getId() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void getTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDiretor(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	@Override
	public String toString() {
		return "Movie [id = " + id + ", title = " + title + ", director = " + director + " genre =" + genre + ", runningTime = " + runningTime + "]";
	}
}
