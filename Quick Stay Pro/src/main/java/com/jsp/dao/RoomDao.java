package com.jsp.dao;


	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

import com.jsp.dto.Room;

	public class RoomDao {
		
		  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
		   EntityManager entityManager= entityManagerFactory.createEntityManager();
		   EntityTransaction entityTransaction=entityManager.getTransaction();
		  
		   public Room saveRoom(Room room) {

				entityTransaction.begin();
				entityManager.persist(room);
				entityTransaction.commit();

				return room;
			}

			// get 
			public Room getRoomByID(int id) {

				Room room = entityManager.find(Room.class, id);
				return room;
			}

			// delete 
			public boolean deleteRoomById(int id) {
				Room room = entityManager.find(Room.class, id);
				if (room != null) {
					entityTransaction.begin();
					entityManager.remove(room);
					entityTransaction.commit();
					return true;
				}
				return false;
			}

			// update 
			public Room updateRoomPriceById(Room room) {
				if (room != null) {
					entityTransaction.begin();
					entityManager.merge(room);
					entityTransaction.commit();
				}
				return room;
			}

			// get all 
			public List<Room> getAllRoom(){
				
				String sql = "SELECT e FROM Room e";
				Query query = entityManager.createQuery(sql);
				return query.getResultList();
			}
			
		   public Room updateRoom(Room room) {
			   entityTransaction.begin();
				entityManager.merge(room);
				entityTransaction.commit();
				return room;
		   } 
		   
		   public boolean updateroom(Room room) {
			   entityTransaction.begin();
				entityManager.merge(room);
				entityTransaction.commit();
				return true;
		   }

}
