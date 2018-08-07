package com.training.casestudy.dao;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BookingRepository extends MongoRepository<Booking,Integer>{

	 public Booking findByDeparture(String departure);
	 
	
	
}
