package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.HasTimeInt;
import com.TicketReservation.Dao.MovieListDao;
import com.TicketReservation.Dao.TicketRateInterface;
import com.TicketReservation.Model.MovieList;
@Service
public class MovieImplmentation implements MovieInterface {
	@Autowired
	MovieListDao moviedao;
	@Autowired
	HasTimeInt hasTime;
	@Autowired
	TicketRateInterface rate;
   
	// insert and update movies............................
		//@Override
		/*public MovieList movielist(MovieList list) {
			// TODO Auto-generated method stub
			int id = list.getMovie_id();
			System.out.println(id);
			return moviedao.movielist(list);

		}*/

		@Override
	public MovieList movielist(MovieList list, String[] a) {
			// TODO Auto-generated method stub
			String name=list.getMovie_name();
			String date1=list.getDate();
			System.out.println("the date "+date1);
			moviedao.movielist(list);
			MovieList list1=moviedao.movielists( name);
			int movieid=list1.getMovie_id();
			//System.out.println(id);
			int ticket_rate=list.getTicket_rate();
			int ticket_rate2=list.getTicket_rate2();
			String date=list.getDate();
			for(int i=0;i<a.length;i++){
				int id1=Integer.parseInt(a[i]);
				hasTime.movieHasTime(movieid,id1);
			}
			list.setMovie_id(movieid);
			list.setTicket_rate(ticket_rate);
			list.setTicket_type(1);
			list.setDate(date);
			rate.ticketRate(list);
			list.setMovie_id(movieid);
			list.setTicket_rate(ticket_rate2);
			list.setTicket_type(2);
			
			rate.ticketRate(list);
		 	return list;
		}

			

}
