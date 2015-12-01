package com.TicketReservation.pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Service.ListInterface;

@Controller
public class ListController {
	@Autowired
	ListInterface listimpl;

	@RequestMapping(value = "/List", method = RequestMethod.GET)
	public ModelAndView list() {
		List<TicketType> tickettype = listimpl.ticketlists();
		List<MovieList> movies = listimpl.movielists();
		List<TimingModel> time = listimpl.timelist();

		Map<String, Object> mymodel = new HashMap<String, Object>();
		List<Map> data = new ArrayList<Map>();
		Map test = new HashMap();
		test.put("tickettype", tickettype);
		test.put("movies", movies);
		test.put("time", time);
		data.add(test);
		mymodel.put("data", data);

		return new ModelAndView("Admin", "mymodel", mymodel);

	}

}