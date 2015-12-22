package com.TicketReservation.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Model.TimingModel;
@Repository
public class ListDaoImplementation implements ListDaoInterface {
    @Autowired
    private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public List<MovieList> movielists() {
		// TODO Auto-generated method stub
		String query = "select*from movie";
		// TODO Auto-generated method stub
		List<MovieList> list = getJdbcTemplate().query(query,
				new BeanPropertyRowMapper<MovieList>(MovieList.class));
		return list;
		
	}

	@Override
	public List<TicketType> tickettype1() {
		// TODO Auto-generated method stub
		String query = "select*from ticket_type";
		// TODO Auto-generated method stub
		List<TicketType> list = getJdbcTemplate().query(query,
				new BeanPropertyRowMapper<TicketType>(TicketType.class));
		
		return list;
	}

	@Override
	public List<TimingModel> timelist() {
		// TODO Auto-generated method stub
		String query = "select*from timings";
		List<TimingModel> time = getJdbcTemplate().query(query,
				new BeanPropertyRowMapper<TimingModel>(TimingModel.class));
		return time;
	}

}
