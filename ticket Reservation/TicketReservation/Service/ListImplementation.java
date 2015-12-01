package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.ListDaoInterface;
import com.TicketReservation.Model.MovieList;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.Model.TimingModel;
@Service
public class ListImplementation implements ListInterface{
     @Autowired
     ListDaoInterface listdao;
	@Override
	public List<MovieList> movielists() {
		// TODO Auto-generated method stub
		
		return listdao.movielists();
	}

	@Override
	public List<TicketType> ticketlists() {
		// TODO Auto-generated method stub
		return listdao.tickettype1();
	}

	@Override
	public List<TimingModel> timelist() {
		// TODO Auto-generated method stub
		return listdao.timelist();
	}

}
