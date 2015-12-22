package com.TicketReservation.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketRate {
	private int ticket_rate_id;
	private int ticket_rate;
	private String created_date;
	private String updated_date;
	Date today=Calendar.getInstance().getTime();
	SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String Date=formatter.format(today);
	private int movie_id;
	private int ticket_type;
	public int getTicket_rate_id() {
		return ticket_rate_id;
	}
	public void setTicket_rate_id(int ticket_rate_id) {
		this.ticket_rate_id = ticket_rate_id;
	}
	public int getTicket_rate() {
		return ticket_rate;
	}
	public void setTicket_rate(int ticket_rate) {
		this.ticket_rate = ticket_rate;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(int ticket_type) {
		this.ticket_type = ticket_type;
	}
	@Override
	public String toString() {
		return "TicketRate [ticket_rate_id=" + ticket_rate_id
				+ ", ticket_rate=" + ticket_rate + ", created_date="
				+ created_date + ", updated_date=" + updated_date + ", Date=" + Date
				+ ", movie_id=" + movie_id + ", ticket_type=" + ticket_type
				+ "]";
	}
	

}
