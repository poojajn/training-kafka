package com.training.airlines.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
	public interface BookingRepository extends MongoRepository<Booking,String> {
	 
	 public Booking findByDeparture(String departure);
	  
	   
	}

