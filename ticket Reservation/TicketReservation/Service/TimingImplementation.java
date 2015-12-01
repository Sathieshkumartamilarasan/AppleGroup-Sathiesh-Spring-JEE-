package com.TicketReservation.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TicketReservation.Dao.TimingInterfacedao;
import com.TicketReservation.Model.TimingModel;
@Service
public class TimingImplementation implements TimingInterface{
	@Autowired
	TimingInterfacedao timedao;
	// insert and update the time..................................
		@Override
		public TimingModel timing(TimingModel time) {
			// TODO Auto-generated method stub
			return timedao.timing(time);

		}

		

}
