package com.TicketReservation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.TicketTypeDaoInterface;
import com.TicketReservation.Model.TicketType;
import com.TicketReservation.pack.TicketTypeCount;
//import com.TicketReservation.pack.TicketTypeInterface;

@Service
public class TicketTypeImpl implements TicketTypeInterface{
	@Autowired
	TicketTypeDaoInterface ticketdao;

	@Override
	public TicketType ticket(TicketType type) {
		// TODO Auto-generated method stub
	
		return 	ticketdao.ticketCount(type);
	}

	
}
