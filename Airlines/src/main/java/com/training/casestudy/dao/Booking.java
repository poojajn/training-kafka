package com.training.casestudy.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.JobOriginatingUserName;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="Demo")
public class Booking implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookingId")
	private int bookingId;
	
	 @Column(name="psngrName")
	 private String psngrName;
	 
	 @Column(name="departure")
	 private String departure;
	 
	 @Column(name="destination")
	 private String destination;
	 
	 @Column(name="travelDate")
	 private Date travelDate;
	 
	 @Column(name="journeyType")
	 private String journeyType;
	 
	 public Booking() {}
	 
	public Booking(int bookingId, String psngrName, String departure, String destination, Date travelDate,
			String journeyType) {
		super();
		this.bookingId = bookingId;
		this.psngrName = psngrName;
		this.departure = departure;
		this.destination = destination;
		this.travelDate = travelDate;
		this.journeyType = journeyType;
	}
	public String getJourneyType() {
		return journeyType;
	}
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
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
