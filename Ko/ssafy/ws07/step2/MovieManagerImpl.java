package com.ssafy.ws07.step2;

import java.util.ArrayList;

import com.ssafy.ws06.step2.Movie;
import com.ssafy.ws06.step2.SeriesMovie;

public class MovieManagerImpl implements IMovieManager {
	private ArrayList<Movie> movieList = new ArrayList<>();

	private static IMovieManager instance = new MovieManagerImpl();

	private MovieManagerImpl() {

	}

	public static IMovieManager getInstance() {
		return instance;
	}

	public void add(Movie movie) {
		movieList.add(movie);
	}

	public Movie[] getList() {
		Movie[] mL = new Movie[movieList.size()];
		for (int i = 0; i < movieList.size(); i++)
			mL[i] = movieList.get(i);
		return mL;
	}

	public Movie[] getMovies() {
		Movie[] Movies = new Movie[movieList.size()];
		int sizeOfM = 0;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i) instanceof Movie)
				Movies[sizeOfM++] = movieList.get(i);
		}
		return Movies;
	}

	public SeriesMovie[] getSeriesMovies() {
		SeriesMovie[] seriesMovies = new SeriesMovie[movieList.size()];
		int sizeOfSm = 0;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i) instanceof SeriesMovie)
				seriesMovies[sizeOfSm++] = (SeriesMovie) movieList.get(i);
		}
		return seriesMovies;
	}

	public Movie[] searchByTitle(String title) {
		Movie[] searchMovies = new Movie[movieList.size()];
		int sizeOfSearch = 0;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(title))
				searchMovies[sizeOfSearch++] = movieList.get(i);
		}
		return searchMovies;
	}

	public double getRunningTimeAvg() {
		double total = 0;
		for (int i = 0; i < movieList.size(); i++) {
			total += movieList.get(i).getRunningTime();
		}
		return total / movieList.size();
	}
}
