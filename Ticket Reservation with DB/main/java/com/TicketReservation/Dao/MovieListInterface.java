package com.TicketReservation.Dao;

import java.util.List;

import com.TicketReservation.Model.MovieList;

public interface MovieListInterface {
	
	public MovieList movielist(MovieList list);

	//public MovieList movielists();

//public 	MovieList movielists(MovieList list);

MovieList movielists(String name);


}
