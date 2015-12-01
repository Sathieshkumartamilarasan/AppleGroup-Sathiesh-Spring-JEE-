package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.MovieListDao;
import com.TicketReservation.Model.MovieList;
@Service
public class MovieImplmentation implements MovieInterface {
	@Autowired
	MovieListDao moviedao;
   
	// insert and update movies............................
		@Override
		public MovieList movielist(MovieList list) {
			// TODO Auto-generated method stub
			int id = list.getMovie_id();
			System.out.println(id);
			return moviedao.movielist(list);

		}

		// list of movies...............................
		

}
