package com.jsp.service;

import java.util.List;

import com.jsp.dao.GuestDao;
import com.jsp.dto.Guest;
import com.jsp.dto.User;

public class GuestService { 
	 User user=new  User();
	 GuestDao guestDao = new GuestDao();
        
	    public Guest saveGuest(Guest guest) { 
	    	
	        return guestDao.saveGuest(guest);
	    }

	    public Guest getGuestById(int id) {
	        return guestDao.getGuestById(id);
	    }

	    public boolean deleteGuestById(int id) {
	        return guestDao.deleteGuestById(id);
	    }

	    public Guest updateGuest(Guest guest) {
	        return guestDao.updateGuest(guest);
	    }

	    public List<Guest> getAllGuests() {
	        return guestDao.getAllGuests();
	    }
	}
