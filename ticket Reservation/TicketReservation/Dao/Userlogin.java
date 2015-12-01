package com.TicketReservation.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.TicketReservation.Model.UserDetails;

public class Userlogin implements RowMapper {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDetails detail = new UserDetails();
		detail.setUsername(rs.getString("username"));
		detail.setPassword(rs.getString("password"));
		detail.setRole(rs.getInt("role_RoleId"));
		//System.out.println("dadsdbasbdsajbdjsa" + rs.getString("username"));
		//System.out.println("dadsdbasbdsajbdjsa" + rs.getString("password"));
		//System.out.println("dadsdbasbdsajbdjsa" + rs.getInt("Role_RoleId"));
		return detail;
	}

}
