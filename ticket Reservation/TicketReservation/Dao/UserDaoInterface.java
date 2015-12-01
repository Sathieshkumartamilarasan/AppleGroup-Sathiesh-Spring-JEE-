package com.TicketReservation.Dao;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;

public interface UserDaoInterface {

	public UserDetails insert(UserDetails user);

	//public void login(UserDetails detail);

	public UserDetails login(String name);

	
	
}
