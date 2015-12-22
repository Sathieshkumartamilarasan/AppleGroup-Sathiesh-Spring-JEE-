package com.TicketReservation.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MovieList {
	private Date date1;
	private int ticket_rate;
	private int ticket_rate2;
	private int ticket_type;
	private int movie_id=0;
	private String movie_name;
	private String release_date;
	private String no_of_shows;
	private String created_date;
	private String updated_date;
	private String active;
	private String created_by;
	private String updated_by;
	Date today = Calendar.getInstance().getTime();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String Date = formatter.format(today);
	
	
	
	
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public int getTicket_rate() {
		return ticket_rate;
	}
	public void setTicket_rate(int ticket_rate) {
		this.ticket_rate = ticket_rate;
	}
	public int getTicket_rate2() {
		return ticket_rate2;
	}
	public void setTicket_rate2(int ticket_rate2) {
		this.ticket_rate2 = ticket_rate2;
	}
	public int getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(int ticket_type) {
		this.ticket_type = ticket_type;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getNo_of_shows() {
		return no_of_shows;
	}
	public void setNo_of_shows(String no_of_shows) {
		this.no_of_shows = no_of_shows;
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
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public SimpleDateFormat getFormatter() {
		return formatter;
	}
	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
	}
	public String getDate() {
		return  Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "MovieList [ticket_rate=" + ticket_rate + ", ticket_rate2="
				+ ticket_rate2 + ", ticket_type=" + ticket_type + ", movie_id="
				+ movie_id + ", movie_name=" + movie_name + ", release_date="
				+ release_date + ", no_of_shows=" + no_of_shows
				+ ", created_date=" + created_date + ", updated_date="
				+ updated_date + ", active=" + active + ", created_by="
				+ created_by + ", updated_by=" + updated_by + ", today="
				+ today + ", formatter=" + formatter + ", Date=" + Date + "]";
	}

}
