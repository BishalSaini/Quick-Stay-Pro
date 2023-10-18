package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Hotel;

public class HotelDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hotel saveHotel(Hotel hotel) {
		entityTransaction.begin();
		entityManager.persist(hotel);
		entityTransaction.commit();
		return hotel;
	}

	public boolean deleteHotelById(int id) {
		Hotel hotel = entityManager.find(Hotel.class, id);
		entityTransaction.begin();
		entityManager.remove(hotel);
		entityTransaction.commit();
		return true;
	}

	public Hotel updateHotelEmailById(Hotel hotel) {

		entityTransaction.begin();
		entityManager.merge(hotel);
		entityTransaction.commit();
		return hotel;
	}

	public Hotel getHotelById(int id) {
		Hotel hotel = entityManager.find(Hotel.class, id);
		return hotel;
	}

	public List<Hotel> getAllHotels() {
		String sql = "SELECT e FROM Hotel e";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

}
