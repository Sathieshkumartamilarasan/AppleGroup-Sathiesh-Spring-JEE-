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
		int id = detail.getId();
		if (msg.equals("admin")) {
			// view.setViewName("Admin");
			return new ModelAndView("redirect:/List");
		}
		if (msg.equals("user")) {

			List<MovieList> list = userimplement.movieList();
			System.out.println(list);
			System.out.println(id);
			ModelAndView model = new ModelAndView();
			model.addObject("list1", list);
			model.addObject("id", id);
			model.setViewName("UserMovie");
			return model;
		} else {

			return new ModelAndView("home", "msg1", msg);

		}
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView logout() {
		String log = "Logged Out Successfully";
		return new ModelAndView("home", "log", log);

	}

}
