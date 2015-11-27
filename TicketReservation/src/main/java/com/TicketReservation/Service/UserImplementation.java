package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Dao.UserDaoInterface;
import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;

@Service
public class UserImplementation implements UserInterface {
	@Autowired
	private UserDaoInterface userdao;

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
			return detail;
		} else {
			String msg = "Invalid Login";
			detail.setMsg(msg);
			return detail;
		}

	}

	// insert and update movies............................
	@Override
	public MovieList movielist(MovieList list) {
		// TODO Auto-generated method stub
		int id = list.getMovie_id();
		System.out.println(id);
		return userdao.movielist(list);

	}

	// list of movies...............................
	@Override
	public List<MovieList> movielists() {
		// TODO Auto-generated method stub
		return userdao.movielists();

	}

	// insert and update the time..................................
	@Override
	public TimingModel timing(TimingModel time) {
		// TODO Auto-generated method stub
		return userdao.timing(time);

	}

	// list of times......................................
	@Override
	public List<TimingModel> timelist() {
		// TODO Auto-generated method stub
		return userdao.timelist();

	}

}
