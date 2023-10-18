package com.jsp.dao;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	import com.jsp.dto.Admin;
	
	public class AdminDao {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//To save Details
			public Admin saveAdminDetails(Admin admin) {
				entityTransaction.begin(); 
	                entityManager.persist(admin);
				entityTransaction.commit();
				
				return admin;
			} 
			
			//To Delete The Details
			public Admin deleteAdminById(int id) {
				Admin admin = entityManager.find(Admin.class, id);
				entityTransaction.begin();
				entityManager.remove(admin);
				entityTransaction.commit();
				return admin;
			}

			public Admin updateAdminById(int id, String username,String password) {

				Admin admin = entityManager.find(Admin.class, id);

				admin.setUsername(username); 
				admin.setPassword(password);
				
				entityTransaction.begin();
				entityManager.merge(admin);
				entityTransaction.commit();
				
				return admin;

			}		
			//To View The Specific Detail
			public Admin getAdminDetailsById(int id) {
				Admin admin = entityManager.find(Admin.class, id);					
				return admin;
			}  
			
			
			//To View The All Detail 
			public List<Admin> getAllAdminDetails() {
				String sql = "SELECT a FROM Admin a";
				Query query = entityManager.createQuery(sql);
				return query.getResultList();
			} 
}
