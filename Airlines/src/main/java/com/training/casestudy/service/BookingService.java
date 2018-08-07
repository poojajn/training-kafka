package com.training.casestudy.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.training.casestudy.dao.Booking;
import com.training.casestudy.dao.BookingRepository;


@Service
public class BookingService {
	
	
	@Autowired
	private BookingRepository bookingRepository;
	
	private static List<Booking> booking=new ArrayList<>();
	static{
		booking.add(new Booking(101,"Rama","Bangalore","Delhi",new Date(),"oneWay"));  
		booking.add(new Booking(102,"Teja","delhi","bangalore",new Date(),"oneWay"));  
		booking.add(new Booking(103,"Kavita","hyderabad","Delhi",new Date(),"oneWay"));  
		booking.add(new Booking(104,"Pooja","delhi","hyderabad",new Date(),"twoWays"));  
		booking.add(new Booking(105,"Devi","Bangalore","Delhi",new Date(),"twoWays"));  
	  }
	
	
	// Retrieve all rows from table and populate list with objects
	public List<Booking> getAllBookingDetails() {
		
		//List<Booking> booking = new ArrayList<>();
		bookingRepository.findAll().forEach(booking::add);
		
		return booking;
	}
	
	// Retrieves one row from table based on given id
	public Booking getBookingDetailsByID(int id) {
		
		Booking bk = bookingRepository.findById(id).get();
		
				return bk;
	
	}
	
	// Inserts row into table 
	public void bookingTicket(Booking booking) {
		bookingRepository.save(booking);
	}
	
	// Updates row in table
	public void updateTicketDetails(int id, Booking booking) {
		bookingRepository.save(booking);
	}
	
	// Removes row from table
	public void cancelledTicket(int id) {
		bookingRepository.deleteById(id);
	}
}


