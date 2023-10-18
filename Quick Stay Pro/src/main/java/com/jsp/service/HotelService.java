package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.HotelDao;
import com.jsp.dto.Hotel;

public class HotelService {

	HotelDao hotelDao = new HotelDao();
	Hotel hotel = new Hotel();

	public Hotel saveHotel(Hotel hotel) {
		if (hotel.getHoTel_name() != null && hotel.getHotel_Address() != null
	       && hotel.getEmail()!= null && hotel.getHotel_cno()>0 && 
		   hotel.getNo_of_room_available()>0 && 
		   (hotel.getRating() > 0 || hotel.getRating() <= 5)) {
			hotel.setStatus("Authorized");
			return hotelDao.saveHotel(hotel);
		}
		return null;
	}

	public Hotel updateHotelNameById(int id, String new_name) {
		Hotel hotel = hotelDao.getHotelById(id);
		hotel.setHoTel_name(new_name);
		return hotelDao.updateHotelEmailById(hotel);
	}

	public boolean deleteHotelById(int id) {
		if (hotel.getId() > 0) {
			return hotelDao.deleteHotelById(id);
		}
		return false;
	}

	public Hotel getHotelById(int id) {
		return hotelDao.getHotelById(id);
	}

	public List<Hotel> getAllHotels() {
		
			return hotelDao.getAllHotels();
		}
		

}
