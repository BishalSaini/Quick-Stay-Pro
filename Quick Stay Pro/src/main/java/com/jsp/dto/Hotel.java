package com.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
    
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String HoTel_name; 
	private String Hotel_Address;  
	private String email;
	private long Hotel_cno; 
	private int no_of_room_available; 
	private String status;

	private int rating; 
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Room> rooms;
	
	
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoTel_name() {
		return HoTel_name;
	}
	public void setHoTel_name(String hoTel_name) {
		HoTel_name = hoTel_name;
	}
	public String getHotel_Address() {
		return Hotel_Address;
	}
	public void setHotel_Address(String hotel_Address) {
		Hotel_Address = hotel_Address;
	}
	public long getHotel_cno() {
		return Hotel_cno;
	}
	public void setHotel_cno(long hotel_cno) {
		Hotel_cno = hotel_cno;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNo_of_room_available() {
		return no_of_room_available;
	}
	public void setNo_of_room_available(int no_of_room_available) {
		this.no_of_room_available = no_of_room_available;
	} 
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
