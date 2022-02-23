package com.ssafy.ws09.step2;

import java.util.ArrayList;

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
		ArrayList<Integer> idx = new ArrayList<>();
		for (int i = 0; i < movieList.size(); i++)
			if (movieList.get(i) instanceof Movie)
				idx.add(i);

		Movie[] gM = new Movie[idx.size()];
		for (int i : idx)
			gM[idx.indexOf(i)] = movieList.get(i);
		return gM;
	}

	public SeriesMovie[] getSeriesMovies() {
		ArrayList<Integer> idx = new ArrayList<>();
		for (int i = 0; i < movieList.size(); i++)
			if (movieList.get(i) instanceof SeriesMovie)
				idx.add(i);

		SeriesMovie[] gM = new SeriesMovie[idx.size()];
		for (int i : idx)
			gM[idx.indexOf(i)] = (SeriesMovie) movieList.get(i);
		return gM;
	}

	public Movie[] searchByTitle(String title) throws TitleNotFoundException {
		ArrayList<Integer> idx = new ArrayList<>();
		for (int i = 0; i < movieList.size(); i++)
			if (movieList.get(i).getTitle().contains(title))
				idx.add(i);

		if (idx.size() == 0)
			throw new TitleNotFoundException(title);

		Movie[] searchM = new Movie[idx.size()];
		for (int i : idx)
			searchM[idx.indexOf(i)] = movieList.get(i);
		return searchM;
	}

	public double getRunningTimeAvg() {
		double total = 0;
		for (int i = 0; i < movieList.size(); i++) {
			total += movieList.get(i).getRunningTime();
		}
		return total / movieList.size();
	}
}
