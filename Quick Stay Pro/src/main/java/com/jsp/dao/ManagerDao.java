package com.jsp.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Manager;

 public class ManagerDao { 
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
		
	//To save Details
	public Manager saveManagerDetails(Manager manager) {
		entityTransaction.begin(); 
	    entityManager.persist(manager);
		entityTransaction.commit();
				
		return manager;
		} 
			
	//To Delete The Details
		public Manager deleteManagerById(int id) {
		Manager manager = entityManager.find(Manager.class, id);
		entityTransaction.begin();
		entityManager.remove(manager);
    	entityTransaction.commit();
		return manager;
		}

		public Manager updateManagerById(int id, String username,String password) {
			
		Manager manager = entityManager.find(Manager.class, id);

		manager.setUsername(username); 
		manager.setPassword(password);
				
		entityTransaction.begin();
		entityManager.merge(manager);
		entityTransaction.commit();
				
    	return manager;

		}		 
			
		public Manager updateManager(Manager manager) { 
		entityTransaction.begin();
		entityManager.merge(manager);
		entityTransaction.commit();
				
		return manager;

		}
			
		//To View The Specific Detail
		public Manager getManagerDetailsById(int id) {
		Manager manager = entityManager.find(Manager.class, id);					
		return manager;
		}
			
		//To View The All Detail 
		public List<Manager> getAllManagerDetails() {
		String sql = "SELECT m FROM Manager m";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
		}  
			
		public boolean approveManager(Manager manager) {
		entityTransaction.begin();
		entityManager.merge(manager);
		entityTransaction.commit();
		return true;
		} 

}
