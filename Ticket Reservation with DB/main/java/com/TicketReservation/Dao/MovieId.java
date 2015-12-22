package com.TicketReservation.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.TicketReservation.Model.MovieList;

public class MovieId implements RowMapper<Object> {
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
          MovieList list=new MovieList();
          list .setMovie_id(rs.getInt("movie_id"));
          
          return list;
	}
	

}
