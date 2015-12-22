package com.TicketReservation.Dao;

//import java.util.List;

//import java.sql.Date;

import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;
//import com.TicketReservation.Model.UserDetails;
@Repository
public class MovieListDao implements MovieListInterface {
	
	
		@Autowired
		private DataSource dataSource;
		private JdbcTemplate jdbcTemplate;

		private JdbcTemplate getJdbcTemplate() {
			// TODO Auto-generated method stub

			return jdbcTemplate = new JdbcTemplate(dataSource);
		}

		
		DateFormat Formatter=null;
		Date convertDate=null;
		
		
		// MovieList INSERT and UPDATE......................................
		@Override
		public MovieList movielist(MovieList list) {
			// TODO Auto-generated method stub
			String ddMMyyyy=list.getRelease_date();
			System.out.println(ddMMyyyy);
			Formatter=new SimpleDateFormat("ddMMyyyy");
			try {
				convertDate=(Date) Formatter.parse(ddMMyyyy);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list.setDate1(convertDate);
			int id = list.getMovie_id();
			if (id == 0) {
				String sql = "INSERT INTO movie "
						+ "(movie_name,release_date,no_of_shows,created_date,updated_date,active) VALUES (?, ?, ?, ?, ?, ?)";
				jdbcTemplate = new JdbcTemplate(dataSource);
				((JdbcTemplate) jdbcTemplate).update(
						sql,
						new Object[] { list.getMovie_name(),
								list.getDate1(), list.getNo_of_shows(),
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
								list.getDate1(), list.getNo_of_shows(),
								list.getDate(), list.getDate(), list.getActive(),
								list.getMovie_id() });
				
				
				
				
				//System.out.println("inserted");
			}
			return list;

		}






		@Override
		public MovieList movielists(String name) {
			// TODO Auto-generated method stub
			String sql = "SELECT * FROM movie WHERE movie_name = ?";
           System.out.println("hai111111"+name);
			MovieList list = (MovieList) getJdbcTemplate().queryForObject(
					sql, new Object[] { name },  new MovieId());
			int id=list.getMovie_id();
			System.out.println("hai111111"+id);
			MovieList list1=new MovieList();
			list1.setMovie_id(id);
			return list1;
		}

		

	}



