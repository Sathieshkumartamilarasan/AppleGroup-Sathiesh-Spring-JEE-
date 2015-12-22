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
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Service.TicketTypeInterface;

@Controller
public class TicketTypeCount {
	@Autowired
	TicketTypeInterface tickettype;

	@RequestMapping(value = "/ticket1", method = RequestMethod.GET)
	public ModelAndView type() {
		ModelAndView mav2 = new ModelAndView();
		mav2.setViewName("Tickettype");
		return mav2;
	}

	@RequestMapping(value = "/ticket2", method = RequestMethod.GET)
	public ModelAndView type1(@RequestParam("ticket_type_id") String id)
	{

		return new ModelAndView("Tickettype", "ticket_type_id", id);

	}

	@RequestMapping(value = "/ticket3", method = RequestMethod.POST)
	public ModelAndView ticketinsert(@ModelAttribute TicketType type) {
		int id=type.getTicket_type_id();
		System.out.println(id);
		tickettype.ticket(type);
         //String count="Ticket Count";
         ModelAndView mav=new ModelAndView();
         mav.setViewName("Admin1");
		return mav;
	}
	


}
