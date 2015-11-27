package com.TicketReservation.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TimingModel;
import com.TicketReservation.Model.UserDetails;

@Repository
public class UserDao implements UserDaoInterface {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// User Registration ..................................
	@Override
	public UserDetails insert(UserDetails user) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO userdata "
				+ "(username,password,email,fname,lname,address,contact,createdby,updatedby,createddate,updateddate,role_RoleId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		((JdbcTemplate) jdbcTemplate).update(
				sql,
				new Object[] { user.getUsername(), user.getPassword(),
						user.getEmail(), user.getFname(), user.getLname(),
						user.getAddress(), user.getContact(),
						user.getUsername(), user.getUsername(), user.getDate(),
						user.getDate(), user.getRoleid() });
		//System.out.println("inserted");
		return user;

	}

	// User Login ...........................................
	@Override
	public UserDetails login(String name) {
		String sql = "SELECT * FROM userdata WHERE username = ?";

		UserDetails detail = (UserDetails) getJdbcTemplate().queryForObject(
				sql, new Object[] { name }, new Userlogin());
		// System.out.println(detail);
		String name1 = detail.getUsername();
		String pword = detail.getPassword();
		int role = detail.getRole();
		/*
		 * System.out.println("aserg "+name1);
		 * System.out.println("aserg "+pword);
		 * System.out.println("aserg "+role);
		 */
		UserDetails detail1 = new UserDetails();
		detail1.setUsername(name1);
		detail1.setPassword(pword);
		detail1.setRole(role);
		return detail1;

		// TODO Auto-generated method stub

	}

	// MovieList INSERT and UPDATE......................................
	@Override
	public MovieList movielist(MovieList list) {
		// TODO Auto-generated method stub
		int id = list.getMovie_id();
		if (id > 0) {
			String sql = "UPDATE movie SET movie_name=?, release_date=?,no_of_shows=?, "
					+ "created_date=?,updated_date=?,active=? WHERE movie_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);
			((JdbcTemplate) jdbcTemplate).update(
					sql,
					new Object[] { list.getMovie_name(),
							list.getRelease_date(), list.getNo_of_shows(),
							list.getDate(), list.getDate(), list.getActive(),
							list.getMovie_id() });
			//System.out.println("inserted");
		} 
		else
		{
			String sql = "INSERT INTO movie "
					+ "(movie_name,release_date,no_of_shows,created_date,updated_date,active) VALUES (?, ?, ?, ?, ?, ?)";
			jdbcTemplate = new JdbcTemplate(dataSource);
			((JdbcTemplate) jdbcTemplate).update(
					sql,
					new Object[] { list.getMovie_name(),
							list.getRelease_date(), list.getNo_of_shows(),
							list.getDate(), list.getDate(), list.getActive() });
			//System.out.println("inserted");
		}
		return list;

	}

	// List of the Movie..................................
	@Override
	public List<MovieList> movielists() {
		String query = "select*from movie";
		// TODO Auto-generated method stub
		List<MovieList> list = getJdbcTemplate().query(query,
				new BeanPropertyRowMapper<MovieList>(MovieList.class));
		return list;

	}

	// INSERT and UPDATE of Timings........................................
	@Override
	public TimingModel timing(TimingModel time) {
		int id = time.getTimings_id();
		if (id > 0) {
			String sql = "UPDATE timings SET timings=?, created_date=?,updated_date=? WHERE timings_id=?";
			jdbcTemplate = new JdbcTemplate(dataSource);
			((JdbcTemplate) jdbcTemplate).update(
					sql,
					new Object[] { time.getTimings(), time.getDate(),
							time.getDate(), time.getTimings_id() });
		} else {
			String sql = "INSERT INTO timings "
					+ "(timings,created_date,updated_date) VALUES (?, ?, ?)";
			jdbcTemplate = new JdbcTemplate(dataSource);
			((JdbcTemplate) jdbcTemplate).update(
					sql,
					new Object[] { time.getTimings(), time.getDate(),
							time.getDate() });
		}
		return time;
		// TODO Auto-generated method stub

	}

	// List of the Timings ...........................................
	@Override
	public List<TimingModel> timelist() {
		// TODO Auto-generated method stub
		String query = "select*from timings";
		List<TimingModel> time = getJdbcTemplate().query(query,
				new BeanPropertyRowMapper<TimingModel>(TimingModel.class));
		return time;

	}

}
