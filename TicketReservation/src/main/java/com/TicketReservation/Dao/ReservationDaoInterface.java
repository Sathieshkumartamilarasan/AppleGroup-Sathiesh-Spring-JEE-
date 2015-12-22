package com.TicketReservation.Dao;



import java.util.List;

import com.TicketReservation.Model.MovieHasTime;
import com.TicketReservation.Model.TimingModel;

public interface ReservationDaoInterface {

 List<MovieHasTime> timingList(int movie_id);

void timings(MovieHasTime time);

//void timings(List<MovieHasTime> list);

}
