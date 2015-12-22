package com.TicketReservation.Service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;



public interface UserInterface {

	
	public UserDetails insert(UserDetails user);

	public UserDetails login(UserDetails detail);

	public List<MovieList> movieList();

	
	
	

}
