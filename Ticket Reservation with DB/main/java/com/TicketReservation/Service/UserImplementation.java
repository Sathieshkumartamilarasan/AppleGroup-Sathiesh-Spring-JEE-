package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Dao.UserDaoInterface;
import com.TicketReservation.Dao.UserMovieDaoInt;
import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;

@Service
public class UserImplementation implements UserInterface {
	@Autowired
	private UserDaoInterface userdao;
	@Autowired
	UserMovieDaoInt userdao1;
	

	// Register..................................
	@Override
	public UserDetails insert(UserDetails user) {
		return userdao.insert(user);
	}

	// Login......................................
	@Override
	public UserDetails login(UserDetails detail) {
		// TODO Auto-generated method stub
		String name = detail.getUsername();
		String pword = detail.getPassword();
		UserDetails detail1 = userdao.login(name);
		// System.out.println("login");
		String username = detail1.getUsername();
		String password = detail1.getPassword();
		int role = detail1.getRole();
		int id=detail1.getId();
		/*
		 * System.out.println("aserg1 "+username);
		 * System.out.println("aserg1 "+password);
		 * System.out.println("aserg111 "+role);
		 */
		if (name.equals(username) && pword.equals(password) && role == 2) {
			String msg = "admin";
			detail.setMsg(msg);
			return detail;
		}
		if (name.equals(username) && pword.equals(password) && role == 1) {

			String msg = "user";
			detail.setMsg(msg);
			detail.setId(id);
			return detail;
		} else {
			String msg = "Invalid Login";
			detail.setMsg(msg);
			return detail;
		}

	}

	@Override
	public List<MovieList> movieList() {
		// TODO Auto-generated method stub
		return userdao1.movieList();
		
	}

	
	

}
