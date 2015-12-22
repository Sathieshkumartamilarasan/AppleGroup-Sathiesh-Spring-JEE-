package com.TicketReservation.Service;

import java.util.List;

import com.TicketReservation.Model.MovieHasTime;

public interface ReservationInterface {

	List<MovieHasTime> timingList(int movie_id);
	

}
