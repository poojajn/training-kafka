package com.training.casestudy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.casestudy.dao.Booking;
import com.training.casestudy.dao.BookingRepository;
import com.training.casestudy.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	
	@RequestMapping(value = "/multiTicket", method = RequestMethod.GET)
	public List<Booking> getAllBookingDetails() {
		
		return bookingService.getAllBookingDetails();
		
	}
	
	
	@RequestMapping(value = "/singleTicket/{id}", method = RequestMethod.GET)
	public Booking getBookingDetailsByID(@PathVariable int id) {
		return bookingService.getBookingDetailsByID(id);
	}
	
	
	@RequestMapping(value = "/ticketBooking", method = RequestMethod.POST)
	public void bookingTicket(@RequestBody Booking booking) {
		bookingService.bookingTicket(booking);;
		
	}
	
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody Booking booking,@PathVariable int id) {
		bookingService.updateTicketDetails(id, booking);;
	}
	
	
	@RequestMapping(value = "/cancel/{id}", method = RequestMethod.DELETE)
	public void cancelledTicket(@PathVariable int id) {
		bookingService.cancelledTicket(id);;
	}
	
}
