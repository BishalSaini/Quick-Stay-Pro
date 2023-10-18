package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");

	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
		
	}

	public boolean deleteUserById(int id) {
		
		User user = entityManager.find(User.class, id);
		
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		
		return true;
		
	}

	public User updatePasswordById(User user) {

		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
		
		return user;
	
	}
	

	public User getUserById(int id) {

		User user = entityManager.find(User.class, id);
		return user;
		
	}

	public List<User> getAllUsers() {
		String sql = "SELECT u FROM User u";
		Query query = entityManager.createQuery(sql);
		List<User> users = query.getResultList();
		return users;
	}
	
}