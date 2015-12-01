package com.TicketReservation.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Service.MovieInterface;
@Controller
public class Movie {
	@Autowired
	MovieInterface movieimplement;
	// MovieLists..............
		@RequestMapping(value = "/movie", method = RequestMethod.GET)
		public ModelAndView movieList(@RequestParam("movie_id") int id) {
			//System.out.println(id);
			return new ModelAndView("MovieList", "movie_id", id);
		}
		
		@RequestMapping(value="/movies",method=RequestMethod.GET)
		public ModelAndView addMovie(){
			ModelAndView mav2=new ModelAndView();
			mav2.setViewName("MovieList");
			return mav2;
		}

		// insert and update for MovieList................................

		@RequestMapping(value = "/movielist", method = RequestMethod.POST)
		public ModelAndView movielist(@ModelAttribute MovieList list) {
			// int id = list.getMovie_id();
			 //System.out.println(id);
			movieimplement.movielist(list);
			String msg1 = "inserted";
			return new ModelAndView("Admin1", "list1", msg1);

		}
		

}
