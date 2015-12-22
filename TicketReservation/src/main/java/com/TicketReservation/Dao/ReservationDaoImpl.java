package com.TicketReservation.Dao;





import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieHasTime;
import com.TicketReservation.Model.TimingModel;

@Repository
public class ReservationDaoImpl implements ReservationDaoInterface{
     @Autowired
     private DataSource dataSource;
 	 private JdbcTemplate jdbcTemplate;

 	private JdbcTemplate getJdbcTemplate() {
 		// TODO Auto-generated method stub

 		return jdbcTemplate = new JdbcTemplate(dataSource);
 	}

	@Override
	public List<MovieHasTime> timingList(int movie_id) {
		// TODO Auto-generated method stub
		System.out.println(movie_id);
		String sql = "SELECT * FROM movies_list_has_timings WHERE movie_id = '"+movie_id+"'";
		 
		
		List<MovieHasTime> timings = getJdbcTemplate().query(sql, 
				new BeanPropertyRowMapper(MovieHasTime.class));
		System.out.println(timings.toString());
		return timings;
	}

	
	@Override
	public void timings(MovieHasTime time) {
		// TODO Auto-generated method stub
		//System.out.println(time);
		
		String sql="Select * from timings where timings_id= '"+time+"'";
		@SuppressWarnings("unchecked")
		List<TimingModel> timings = getJdbcTemplate().query(sql, 
				new BeanPropertyRowMapper(TimingModel.class));
		System.out.println(timings.toString());
		
		
	}
		
	}

	

	
	


