package com.training.airlines.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.airlines.service.Booking;
import com.training.airlines.service.BookingRepository;


@RestController
	@RequestMapping("/booking")
	public class BookingController {
	 
	 @Autowired
	 BookingRepository bookingRepository;
	  private static int bookingId=100;
	
	  //object_id = object_id.toString();
	    //res = parseInt(object_id.substring(0, 8), 16).toString() + parseInt(object_id.substring(18, 24), 16).toString();
	  
	  
	  
	  
	 @PostMapping("/create")
	 public Map<String, Object> create(@RequestBody Booking booking) {
		 List<Booking> booking1=new ArrayList<Booking>();
		 booking1.add(booking);
		 for(Booking bk:booking1)
		 { bk.setTravelDate(new Date());
		 bk.setBookingId(++bookingId);
		   booking1.add(bk);
		 }
	  System.out.println("create.....before");
	  booking1 = bookingRepository.saveAll(booking1);
	  System.out.println("create.....after");
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking created successfully");
	  dataMap.put("status", "1");
	  for(Booking bk:booking1) {
	  dataMap.put("booking", bk);}
	     return dataMap;
	 }
	 @PostMapping("/createSingle")
	 public Map<String, Object> createSingle(@RequestBody Booking booking) {
		
		

		 booking.setTravelDate(new Date());
		 booking.setBookingId(++bookingId);
	  System.out.println("create.....before");
	  booking = bookingRepository.save(booking);
	  
	  
	  System.out.println("create.....after");
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking created successfully");
	  dataMap.put("status", "1");
  
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 @PostMapping("/createMulti")
	 public Map<String, Object> createMulti(@RequestBody List<Booking> booking) {
		
		
		
		 for(Booking bk:booking)
		 { bk.setTravelDate(new Date());
		 booking.add(bk);
		 }
	  
		 booking = bookingRepository.saveAll(booking);
	  System.out.println("create.....after");
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking created successfully");
	  dataMap.put("status", "1");
	  for(Booking bk:booking) {
	  dataMap.put("booking", bk);}
	     return dataMap;
	 }
	 
	 
	 
	 
	 @GetMapping("/read/{bookingId}")
	 public Map<String, Object> read(@PathVariable String bookingId) {
		 
		 		 
		 	  Booking booking = bookingRepository.findById(bookingId).get();
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking found successfully");
	  dataMap.put("status", "1");
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 
	 
	 @RequestMapping("/update")
	 public Map<String, Object> update(@PathVariable String bookingId) {
	  Booking booking = bookingRepository.findById(bookingId).get();
	 
	  booking = bookingRepository.save(booking);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking updated successfully");
	  dataMap.put("status", "1");
	  dataMap.put("booking", booking);
	     return dataMap;
	 }
	 
	
	 @GetMapping("/delete/{bookingId}")
	 public Map<String, Object> delete(@PathVariable String bookingId) {
	  bookingRepository.deleteById(bookingId);
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking deleted successfully");
	  dataMap.put("status", "1");
	     return dataMap;
	 }
	 
	 
	 @GetMapping("/read-all")
	 public Map<String, Object> readAll() {
	  List<Booking> bookings = bookingRepository.findAll();
	  Map<String, Object> dataMap = new HashMap<String, Object>();
	  dataMap.put("message", "Booking found successfully");
	  dataMap.put("totalBooking", bookings.size());
	  dataMap.put("status", "1");
	  dataMap.put("bookings", bookings);
	     return dataMap;
	 }
	}

