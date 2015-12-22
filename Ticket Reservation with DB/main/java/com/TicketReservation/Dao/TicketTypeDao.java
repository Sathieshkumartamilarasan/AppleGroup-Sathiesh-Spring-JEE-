package com.TicketReservation.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.pack.TicketTypeCount;

@Repository
public class TicketTypeDao implements TicketTypeDaoInterface {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub

		return jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public TicketType ticketCount(TicketType type) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					int id = type.getTicket_type_id();
					System.out.println(id);
					if (id == 0) {
						String sql = "INSERT INTO ticket_type"
								+ "(ticket_type,ticket_type_count,created_date,updated_date) VALUES (?, ?, ?, ?)";
						jdbcTemplate = new JdbcTemplate(dataSource);
						((JdbcTemplate) jdbcTemplate).update(
								sql,
								new Object[] { type.getTicket_type(),
										type.getTicket_type_count(),
										type.getDate(), type.getDate() });
						
						//System.out.println("inserted");
					} 
					else
					{
						String sql = "UPDATE ticket_type SET ticket_type=?, ticket_type_count=?, "
								+ "created_date=?,updated_date=? WHERE ticket_type_id=?";
						jdbcTemplate = new JdbcTemplate(dataSource);
						((JdbcTemplate) jdbcTemplate).update(
								sql,
								new Object[] { type.getTicket_type(),
										type.getTicket_type_count(),
										type.getDate(), type.getDate(), type.getTicket_type_id() });
						
						//System.out.println("inserted");
					}
					return type;

				}

				

}
