package com.ssafy.ws06.step2;

public class MovieManager {
	private int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;

	public void add(Movie movie) {
		if (size == MAX_SIZE)
			System.out.println("size를 초과합니다.");
		else
			movieList[size++] = movie;
	}

	public Movie[] getList() {
		return movieList;
	}

	public Movie[] getMovies() {
		Movie[] Movies = new Movie[100];
		int sizeOfM = 0;
		for (int i = 0; i < movieList.length; i++) {
			if (movieList[i] instanceof Movie)
				Movies[sizeOfM++] = movieList[i];
		}
		return Movies;
	}

	public SeriesMovie[] getSeriesMovies() {
		SeriesMovie[] seriesMovies = new SeriesMovie[100];
		int sizeOfSM = 0;
		for (int i = 0; i < movieList.length; i++) {
			if (movieList[i] instanceof SeriesMovie)
				seriesMovies[sizeOfSM++] = (SeriesMovie) movieList[i];
		}
		return seriesMovies;
	}

	public Movie[] searchByTitle(String title) {
		Movie[] searchMovies = new Movie[100];
		int sizeOfSearch = 0;
		for (int i = 0; i < movieList.length; i++) {
			if (movieList[i].getTitle().contains(title))
				searchMovies[sizeOfSearch++] = movieList[i];
		}
		return searchMovies;
	}

	public double getRunningTimeAvg() {
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += movieList[i].getRunningTime();
		}
		return total / size;
	}
}
