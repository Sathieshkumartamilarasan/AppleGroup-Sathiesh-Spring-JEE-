package com.TicketReservation.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;

@Repository
public class TicketRateImpl implements TicketRateInterface {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public MovieList ticketRate(MovieList list) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO ticket_rate "
				+ "(ticket_rate,movie_id,ticket_type) VALUES ( ?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		((JdbcTemplate) jdbcTemplate).update(
				sql,
				new Object[] { list.getTicket_rate(),list.getMovie_id(),list.getTicket_type() });
		
		return list;
	}


}
