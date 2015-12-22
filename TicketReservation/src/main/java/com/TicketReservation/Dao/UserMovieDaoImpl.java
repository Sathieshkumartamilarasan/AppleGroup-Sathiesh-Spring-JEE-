package com.TicketReservation.Dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;

@Repository
public class UserMovieDaoImpl implements UserMovieDaoInt {
	@Autowired
    private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<MovieList> movieList() {
		// TODO Auto-generated method stub
		//Date today=Calendar.getInstance().getTime();
		String sql="Select*From movie where release_date>=CURRENT_DATE()";
		List<MovieList> list = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper<MovieList>(MovieList.class));
		return list;
		
	}

}
