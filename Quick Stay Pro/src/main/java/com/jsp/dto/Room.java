package com.jsp.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Room { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String roomtype;
	private String status;
	private int price; 
	private LocalDate Booking_Date; 
	private LocalTime Booking_Time; 
	private LocalDate checkInDate;
    private LocalTime checkInTime;
    private LocalDate checkOutDate;
    private LocalTime checkOutTime;

	
	@ManyToOne
	private Hotel hotel; 
	
	@OneToOne
	private Manager manager; 
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<History> History;  
	
	@OneToOne
	private User user;
	
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public LocalDate getBooking_Date() {
		return Booking_Date;
	}
	public void setBooking_Date(LocalDate booking_Date) {
		Booking_Date = booking_Date;
	}
	public LocalTime getBooking_Time() {
		return Booking_Time;
	}
	public void setBooking_Time(LocalTime booking_Time) {
		Booking_Time = booking_Time;
	}
	public List<History> getHistory() {
		return History;
	}
	public void setHistory(List<History> history) {
		History = history;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}  
	
	
	
	
}
