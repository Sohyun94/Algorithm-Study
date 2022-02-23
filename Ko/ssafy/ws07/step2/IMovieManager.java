package com.ssafy.ws07.step2;

import com.ssafy.ws06.step2.Movie;
import com.ssafy.ws06.step2.SeriesMovie;

public interface IMovieManager {

	void add(Movie movie);

	Movie[] getList();

	Movie[] getMovies();

	SeriesMovie[] getSeriesMovies();

	Movie[] searchByTitle(String title);

	double getRunningTimeAvg();
}
