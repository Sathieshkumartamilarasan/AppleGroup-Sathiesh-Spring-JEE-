package com.TicketReservation.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
		// System.out.println("inserted");
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

}
