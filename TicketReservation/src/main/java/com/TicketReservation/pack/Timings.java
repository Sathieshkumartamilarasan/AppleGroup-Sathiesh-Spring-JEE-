package com.TicketReservation.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Service.TimingInterface;
@Controller
public class Timings {
	@Autowired
	TimingInterface timingimplement;
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
			int id = time.getTimings_id();
			System.out.println(id);
			timingimplement.timing(time);
			String insert = "inserted";
			return new ModelAndView("Admin1", "insert", insert);

		}

		


}
