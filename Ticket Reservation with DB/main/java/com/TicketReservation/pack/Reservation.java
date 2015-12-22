package com.TicketReservation.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Service.ReservationInterface;

@Controller
public class Reservation {
	@Autowired 
	ReservationInterface reserve;
	
	@RequestMapping(value="/book",method=RequestMethod.GET)
	public ModelAndView reservation(@RequestParam("id")int id,@RequestParam("movie_id") int movie_id ){
		System.out.println(id);
		System.out.println(movie_id);
		reserve.timingList(movie_id);
		return null;
		
	}

}
