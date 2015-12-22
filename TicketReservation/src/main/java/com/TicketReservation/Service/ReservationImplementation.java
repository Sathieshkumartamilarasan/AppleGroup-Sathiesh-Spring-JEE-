package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.ReservationDaoInterface;
import com.TicketReservation.Model.MovieHasTime;
//import com.TicketReservation.Model.MovieHasTime;

@Service
public class ReservationImplementation implements ReservationInterface {
    @Autowired
    ReservationDaoInterface reserve;
	@Override
	public List<MovieHasTime> timingList(int movie_id) {
		// TODO Auto-generated method stub
		List<MovieHasTime> timings=reserve.timingList(movie_id);
		for(MovieHasTime time : timings){
			System.out.println(time);
			
			reserve.timings(time);
		}
	  return timings;
		
		
	}

}
