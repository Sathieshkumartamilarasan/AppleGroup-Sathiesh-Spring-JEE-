package com.TicketReservation.Service;

import java.util.List;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Model.TimingModel;

public interface ListInterface {

	List<MovieList> movielists();

	List<TicketType> ticketlists();

	List<TimingModel> timelist();

}
