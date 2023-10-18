package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jsp.dto.Owner; 

public class OwnerDao { 
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Owner saveOwner(Owner owner) {
		entityTransaction.begin();
		entityManager.persist(owner);
		entityTransaction.commit();
		return owner;
	}

	public boolean deleteOwnerById(int id) {
		Owner owner = entityManager.find(Owner.class, id);
		entityTransaction.begin();
		entityManager.remove(owner);
		entityTransaction.commit();
		return true;
	}

	public Owner updateOwnerEmailById(Owner owner) {

		entityTransaction.begin();
		entityManager.merge(owner);
		entityTransaction.commit();
		return owner;
	}

	public Owner getOwnerById(int id) {
		Owner owner = entityManager.find(Owner.class, id);
		return owner;
	}

	public List<Owner> getAllOwners() {
		String sql = "SELECT e FROM Owner e";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	} 
	
	public boolean approveOwner(Owner owner) {
		entityTransaction.begin();
		entityManager.merge(owner);
		entityTransaction.commit();
		return true;
	}  
	
	public boolean sendReq(Owner owner) {  
		entityTransaction.begin();
		entityManager.merge(owner);
		entityTransaction.commit();
		return true;
		
	} 
	
	public boolean revokeHotel(Owner owner) { 
		entityTransaction.begin();
		entityManager.merge(owner);
		entityTransaction.commit();
		return true;

	}
	
	}  
