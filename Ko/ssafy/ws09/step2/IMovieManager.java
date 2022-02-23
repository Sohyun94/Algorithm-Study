package com.ssafy.ws09.step2;

import com.ssafy.ws09.step2.Movie;
import com.ssafy.ws09.step2.SeriesMovie;

public interface IMovieManager {

	void add(Movie movie);

	Movie[] getList();

	Movie[] getMovies();

	SeriesMovie[] getSeriesMovies();

	Movie[] searchByTitle(String title) throws TitleNotFoundException;

	double getRunningTimeAvg();
}
