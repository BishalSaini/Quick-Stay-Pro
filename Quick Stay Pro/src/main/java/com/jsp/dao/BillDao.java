package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Bill;

public class BillDao { 
	

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Bill saveBill(Bill bill) {
		entityTransaction.begin(); 
        entityManager.persist(bill);
        entityTransaction.commit();
        return bill;
    }

    public Bill getBillById(int id) {
    	Bill bill = entityManager.find(Bill.class, id);	
        return bill; 
    }

    public List<Bill> getAllBillsForUser(int userId) {
    	String sql = "SELECT b FROM GenerateBill b";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
    }

    public boolean deleteBill(int billId) {
        return false;
    }
    

}
