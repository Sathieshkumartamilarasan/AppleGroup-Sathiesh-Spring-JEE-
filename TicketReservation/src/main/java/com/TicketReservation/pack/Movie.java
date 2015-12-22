package com.TicketReservation.pack;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			//ModelAndView mav2=new ModelAndView();
			//mav2.setViewName("MovieList");
			int id=0;
			return new ModelAndView ("MovieList","movie_id",id);
		}

		// insert and update for MovieList................................

		@RequestMapping(value = "/movielist", method = RequestMethod.POST)
		public ModelAndView movielist(HttpServletRequest request,HttpServletResponse response) {
			// int id = list.getMovie_id();
			//System.out.println(id);
			int movie_id=Integer.parseInt(request.getParameter("movie_id"));
			String moviename=request.getParameter("movie_name");
			String release_date=request.getParameter("release_date");
			String no_of_shows=request.getParameter("no_of_shows");
			String active=request.getParameter("active");
			String a[]=request.getParameterValues("count");
			//String date=request.getParameter("date");
			int ticket_rate=Integer.parseInt(request.getParameter("ticket_rate1"));
			int ticket_rate2=Integer.parseInt(request.getParameter("ticket_rate2"));
			System.out.println(release_date);
			//System.out.println(date);
			MovieList list=new MovieList();
			//list.setDate(date);
			list.setTicket_rate(ticket_rate);
			list.setTicket_rate2(ticket_rate2);
			list.setMovie_id(movie_id);
			list.setMovie_name(moviename);
			list.setRelease_date(release_date);
			list.setNo_of_shows(no_of_shows);
			list.setActive(active);
			movieimplement.movielist(list,a);
			String msg1 = "inserted";
			return new ModelAndView("Admin1", "list1", msg1);

		}
		

}
