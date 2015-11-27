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
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;
//import com.TicketReservation.Service.UserImplementation;
import com.TicketReservation.Service.UserInterface;

@Controller
public class HomeController {
	@Autowired
	private UserInterface userimplement;

	// Registeration..............
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView reg() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Insert");
		return mav;

	}

	// Register...........................
	@RequestMapping(value = "/sert", method = RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute UserDetails user) {
		userimplement.insert(user);
		String msg = "Inserted Sucessfully";

		return new ModelAndView("home", "msg", msg);

	}

	// Login........................
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(UserDetails detail) {
		userimplement.login(detail);
		String msg = detail.getMsg();
		ModelAndView view = new ModelAndView();
		// System.out.println("aserg "+msg);
		if (msg.equals("admin")) {
			view.setViewName("Admin");
			return view;
		}
		if (msg.equals("user")) {
			view.setViewName("User");
			return view;
		} else {

			return new ModelAndView("home", "msg1", msg);

		}
	}

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
		userimplement.movielist(list);
		String msg1 = "inserted";
		return new ModelAndView("Admin", "list1", msg1);

	}

	// List of Movies..........................

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		List<MovieList> list1 = userimplement.movielists();
		System.out.println(list1);

		return new ModelAndView("MovList", "list", list1);
	}

	// timings..............
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView time(@RequestParam("timings_id") int id) {
		//System.out.println(id);
		return new ModelAndView("Timing", "timings_id", id);
	}
	
	@RequestMapping(value="/times",method=RequestMethod.GET)
	public ModelAndView addTime(){
		ModelAndView mav3=new ModelAndView();
		mav3.setViewName("Timing");
		return mav3;
	}

	// insert and update for timings................................
	@RequestMapping(value = "/timing1", method = RequestMethod.POST)
	public ModelAndView timing(@ModelAttribute TimingModel time) {
		//int id = time.getTimings_id();
		//System.out.println(id);
		userimplement.timing(time);
		String insert = "inserted";
		return new ModelAndView("Admin", "insert", insert);

	}

	// List of Timings..........................
	@RequestMapping(value = "/timelist", method = RequestMethod.GET)
	public ModelAndView timelist() {
		List<TimingModel> time = userimplement.timelist();
		return new ModelAndView("TimingList", "time", time);

	}

}
