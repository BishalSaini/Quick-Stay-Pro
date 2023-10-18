package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence; 

import javax.persistence.Query;


import com.jsp.dto.Guest;

public class GuestDao { 
	

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	 public Guest saveGuest(Guest guest) {
	        entityTransaction.begin();
	        entityManager.persist(guest);
	        entityTransaction.commit();
	        return guest;
	    }

	    public Guest getGuestById(int id) {
	        Guest guest = entityManager.find(Guest.class, id);
	        return guest;
	    }

	    public boolean deleteGuestById(int id) {
	        Guest guest = entityManager.find(Guest.class, id);
	        if (guest != null) {
	            entityTransaction.begin();
	            entityManager.remove(guest);
	            entityTransaction.commit();
	            return true;
	        }
	        return false;
	    }

	    public Guest updateGuest(Guest guest) {
	        if (guest != null) {
	            entityTransaction.begin();
	            entityManager.merge(guest);
	            entityTransaction.commit();
	        }
	        return guest;
	    }

	    public List<Guest> getAllGuests() {
	        String sql = "SELECT g FROM Guest g";
	        Query query = entityManager.createQuery(sql);
	        return query.getResultList();
	    }
	}
