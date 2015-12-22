package com.TicketReservation.Dao;

import java.util.List;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Model.TimingModel;

public interface ListDaoInterface {

	List<MovieList> movielists();

	List<TicketType> tickettype1();

	List<TimingModel> timelist();

}
