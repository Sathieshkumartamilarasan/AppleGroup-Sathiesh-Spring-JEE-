package com.TicketReservation.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TicketType {
	private int ticket_type_id;
	private String ticket_type;
	private int ticket_type_count;
	private String created_date;
	private String updated_date;
	Date today=Calendar.getInstance().getTime();
	SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String Date=formatter.format(today);
	public int getTicket_type_id() {
		return ticket_type_id;
	}
	public void setTicket_type_id(int ticket_type_id) {
		this.ticket_type_id = ticket_type_id;
	}
	public String getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}
	public int getTicket_type_count() {
		return ticket_type_count;
	}
	public void setTicket_type_count(int ticket_type_count) {
		this.ticket_type_count = ticket_type_count;
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
	@Override
	public String toString() {
		return "TicketType [ticket_type_id=" + ticket_type_id
				+ ", ticket_type=" + ticket_type + ", ticket_type_count="
				+ ticket_type_count + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + ", Date=" + Date + "]";
	}

}
