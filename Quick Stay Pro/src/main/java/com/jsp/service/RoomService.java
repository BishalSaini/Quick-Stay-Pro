package com.jsp.service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.jsp.dao.GuestDao;
import com.jsp.dao.HistoryDao;
import com.jsp.dao.HotelDao;
import com.jsp.dao.ManagerDao;
import com.jsp.dao.RoomDao;
import com.jsp.dao.UserDao;
import com.jsp.dto.Guest;
import com.jsp.dto.History;
import com.jsp.dto.Hotel;
import com.jsp.dto.Manager;
import com.jsp.dto.Room;
import com.jsp.dto.User;

public class RoomService {
	
	ManagerDao managerDao=new ManagerDao();
	RoomDao roomDao =new RoomDao();  
	HotelDao hotelDao=new HotelDao(); 
	History history=new History(); 
	UserDao userDao=new UserDao(); 
	GuestDao guestDao=new GuestDao();
	
	 public Room saveRoom(Room room) {
		 room.setStatus("Available");
		 return roomDao.saveRoom(room);
	} 
		public Room updateRoomPriceById(int id, int price) {
			
			Room room= roomDao.getRoomByID(id);
			room.setPrice(price);
			return roomDao.updateRoomPriceById(room);
		} 
		
		public Room getRoomDetailsByid(int id) {  
			return roomDao.getRoomByID(id);
		}
		
		
		public List<Room> getAllRoom(){
			return roomDao.getAllRoom();
		}
		
		public boolean deleteRoomById(int id) {
			return roomDao.deleteRoomById(id);
		} 
		
		
		public Room updateRoom(Room room) { 
			return roomDao.updateRoom(room);
		} 
		

		public Room BookRoomForUser(int rid, int hid, int uid, int mid) {
		    Room room = roomDao.getRoomByID(rid);
		    Hotel hotel = hotelDao.getHotelById(hid);
		    User user = userDao.getUserById(uid);
		    Manager manager = managerDao.getManagerDetailsById(mid);
		    HistoryDao historyDao = new HistoryDao();

		    if (room.getStatus().equals("Available")) {
		        room.setStatus("Booked");
		        room.setHotel(hotel);
		        room.setUser(user);
		        room.setBooking_Date(LocalDate.now());
		        room.setBooking_Time(LocalTime.now());
		        
		        history.setBookingDate(LocalDate.now());
		        history.setBookingTime(LocalTime.now());
		        history.setRoom(room);
		        history.setManager(manager);
		        history.setUser(user); // Set the user
		        historyDao.saveHistory(history);

		        room = roomDao.updateRoom(room);
		    }

		    return room;
		}
		
		
		
		public Room cancelRoomBooking(int hId, int roomId, int uid) {
		Hotel hotel=hotelDao.getHotelById(uid);
		    Room room = roomDao.getRoomByID(roomId);
            User user=userDao.getUserById(uid);
		    if (user != null && room != null && hotel!=null) {
		        if (room.getStatus().equals("Booked")) {
		            room.setStatus("Available");
		            room.setBooking_Date(null); 
		            room.setBooking_Time(null); 
		            room.setUser(user);
		            roomDao.updateRoom(room);
		            return room;
		        }
		    }

		    return null;
		}  
		
		 public boolean checkIn(int roomId, int guestId) {
		        Room room = roomDao.getRoomByID(roomId);
		        Guest guest = guestDao.getGuestById(guestId);

		        if (room != null && guest != null && room.getStatus().equals("Booked")) {
		            room.setStatus("Occupied");
		            room.setCheckInDate(LocalDate.now());
		            room.setCheckInTime(LocalTime.now());
		            room.setUser(guest.getUser()); // Set the guest's user
		            roomDao.updateRoom(room);
		            return true;
		        }

		        return false;
		    }

		    public boolean checkOut(int roomId) {
		        Room room = roomDao.getRoomByID(roomId);

		        if (room != null && room.getStatus().equals("Occupied")) {
		            room.setStatus("Available");
		            room.setCheckOutDate(LocalDate.now());
		            room.setCheckOutTime(LocalTime.now());
		            room.setUser(null); // Clear the user (guest)
		            roomDao.updateRoom(room);
		            return true;
		        }

		        return false;
		    }
}