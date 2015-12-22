package com.TicketReservation.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class MovieHasTiming implements HasTimeInt{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ModelAndView movieHasTime(int movieid, int id1) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO movies_list_has_timings "
				+ "(movie_id,timings_id) VALUES (?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		((JdbcTemplate) jdbcTemplate).update(
				sql,
				new Object[] { movieid,id1 });
		
		
		return null;
	}
	

}
