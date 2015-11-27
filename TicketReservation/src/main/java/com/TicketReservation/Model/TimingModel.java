package com.TicketReservation.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimingModel {
	private int timings_id;
	private String timings;
	private String created_date;
	private String updated_date;
	Date today=Calendar.getInstance().getTime();
	SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	private String Date=formatter.format(today);
	public int getTimings_id() {
		return timings_id;
	}
	public void setTimings_id(int timings_id) {
		this.timings_id = timings_id;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
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
		return "TimingModel [timings_id=" + timings_id + ", timings=" + timings
				+ ", created_date=" + created_date + ", updated_date="
				+ updated_date + ", today=" + today + ", formatter="
				+ formatter + ", Date=" + Date + "]";
	}
	
	

}
