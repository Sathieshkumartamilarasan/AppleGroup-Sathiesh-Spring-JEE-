package com.TicketReservation.Model;

public class MovieHasTime {
	private int movie_id;
	private int timings_id;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public int getTimings_id() {
		return timings_id;
	}
	public void setTimings_id(int timings_id) {
		this.timings_id = timings_id;
	}
	@Override
	public String toString() {
		return "MovieHasTime [timings_id=" + timings_id + "]";
	}
	

}
