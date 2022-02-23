package com.ssafy.ws10;

public interface IMovieManager {

public void add(Movie movie);

public Movie[] getList();

public Movie[] getMovies();

public Movie[] getSeriesMovies();

public Movie[] searchByTitle(String title) throws TitleNotFoundException;

public double getRunningTimeAvg();

}

