package com.jsp.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class History { 
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private LocalDate BookingDate;
	 private LocalTime BookingTime;

	 @ManyToOne
	 private User user;

	 @ManyToOne 
	 @JoinColumn(name = "room_id")
	 private Room room; 
	 
	 @ManyToOne
	 private Manager manager;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getBookingDate() {
		return BookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		BookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return BookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		BookingTime = bookingTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	} 
}