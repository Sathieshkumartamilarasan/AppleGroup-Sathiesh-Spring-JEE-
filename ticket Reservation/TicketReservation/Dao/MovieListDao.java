package com.TicketReservation.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;
@Repository
public class MovieListDao implements MovieListInterface {
	
	
		@Autowired
		private DataSource dataSource;
		private JdbcTemplate jdbcTemplate;

		private JdbcTemplate getJdbcTemplate() {
			// TODO Auto-generated method stub

			return jdbcTemplate = new JdbcTemplate(dataSource);
		}

		
		
		
		
		
		// MovieList INSERT and UPDATE......................................
		@Override
		public MovieList movielist(MovieList list) {
			// TODO Auto-generated method stub
			int id = list.getMovie_id();
			if (id == 0) {
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
			else
			{
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
			return list;

		}

		

	}



