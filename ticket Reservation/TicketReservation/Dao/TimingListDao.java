package com.TicketReservation.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.TicketReservation.Model.TimingModel;

@Repository
public class TimingListDao implements TimingInterfacedao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// INSERT and UPDATE of Timings........................................
	@Override
	public TimingModel timing(TimingModel time) {
		int id = time.getTimings_id();
		if (id == 0) {
			String sql = "INSERT INTO timings "
					+ "(timings,created_date,updated_date) VALUES (?, ?, ?)";
			jdbcTemplate = new JdbcTemplate(dataSource);
			((JdbcTemplate) jdbcTemplate).update(
					sql,
					new Object[] { time.getTimings(), time.getDate(),
							time.getDate() });
		
			} else {
				String sql = "UPDATE timings SET timings=?, created_date=?,updated_date=? WHERE timings_id=?";
				jdbcTemplate = new JdbcTemplate(dataSource);
				((JdbcTemplate) jdbcTemplate).update(
						sql,
						new Object[] { time.getTimings(), time.getDate(),
								time.getDate(), time.getTimings_id() });
			
				
			}
		return time;
		// TODO Auto-generated method stub

	}

	

}
