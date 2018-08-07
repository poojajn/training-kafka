package com.training.airlines.service;

import java.util.Date;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="booking")
	public class Booking{

	
	 Date bookingDate;
	 int bookingId;
	
	 String psngrName;
	 
	 String departure;
	 
	 String destination;
	 
	 Date travelDate;
	 
	 String journeyType;
	 private int ticketPrice;
	 public String getJourneyType() {
		return journeyType;
	}


	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	
	 
   public int getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


public Booking() {}
   
	 
	 public Booking(int bookingId, String psngrName, String departure, String destination, Date travelDate,Date bookingDate,int ticketPrice,String journeyType) {
	super();
	this.bookingId = bookingId;
	this.psngrName = psngrName;
	this.departure = departure;
	this.destination = destination;
	this.travelDate = travelDate;
	this.bookingDate=bookingDate;
	this.ticketPrice=ticketPrice;
	this.journeyType=journeyType;
	
}


	public int getBookingId() {
	  return bookingId;
	 }

	 public void setBookingId(int bookingId) {
	  this.bookingId = bookingId;
	 }

	 public String getPsngrName() {
	  return psngrName;
	 }

	 public void setPsngrName(String psngrName) {
	  this.psngrName = psngrName;
	 }

	 public String getDeparture() {
	  return departure;
	 }

	 public void setDeparture(String departure) {
	  this.departure = departure;
	 }

	 public String getDestination() {
	  return destination;
	 }

	 public void setDestination(String destination) {
	  this.destination = destination;
	 }

	 public Date getTravelDate() {
	  return travelDate;
	 }

	 public void setTravelDate(Date travelDate) {
	  this.travelDate = travelDate;
	 }
	 
	 
	}


