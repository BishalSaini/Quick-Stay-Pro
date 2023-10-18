package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.History;



public class HistoryDao { 
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public History saveHistory(History history) {
		entityTransaction.begin();
		entityManager.persist(history);
		entityTransaction.commit();
		return history;
	}



}