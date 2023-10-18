package com.jsp.service;

import java.util.List;

import com.jsp.dao.ManagerDao;
import com.jsp.dao.OwnerDao;
import com.jsp.dto.Manager;
import com.jsp.dto.Owner;


public class OwnerService { 
	
	OwnerDao ownerDao = new OwnerDao();
	Owner owner = new Owner(); 
	ManagerDao managerDao=new ManagerDao(); 
	Manager manager=new Manager();

	public Owner saveOwner(Owner owner) {
		if (owner.getName() != null && owner.getEmail() != null && owner.getPassword() != null
				&& owner.getUsername()!=null) {
			owner.setStatus("Unapproved");
			return ownerDao.saveOwner(owner);
		}
		return null;
	}

	public boolean deleteEmployeeById(int id) {
		if (owner.getId() > 0) {
			return ownerDao.deleteOwnerById(id);
		}
		return false;
	}

	public Owner updateOwnerEmailById(int id, String new_email, String old_email) {
		Owner owner = ownerDao.getOwnerById(id);
		if (owner.getEmail().equals(old_email)) {
			owner.setEmail(new_email);
			return ownerDao.updateOwnerEmailById(owner);
		}
		return null;
	}

	public Owner getOwnerById(int id) {
		return ownerDao.getOwnerById(id);
	}

	public List<Owner> getAllOwners() {
		return ownerDao.getAllOwners();
	}

	public boolean ownerLogin(int id, String username, String password) {
		Owner owner = ownerDao.getOwnerById(id);
		if (owner.getUsername().equals(username) && owner.getPassword().equals(password)) {
    		ownerDao.saveOwner(owner); 
			return true;
		} else {
			return false;
		}
	} 
	 public boolean sendReq(int oid, int mid) {
			Owner owner=ownerDao.getOwnerById(oid);
		    Manager manager=managerDao.getManagerDetailsById(mid);
			if (manager != null && owner != null) {
				if(!owner.getStatus().equalsIgnoreCase("Unapproved")) {
			}
				else {
				owner.setStatus("In Request");
				owner.setManager(manager);
				
				return ownerDao.sendReq(owner);
			} 
			}
			return false;
		}   
	 
	 public boolean revokeHotel(int oid, int mid) {
		    Owner owner = ownerDao.getOwnerById(oid);
		    Manager manager = managerDao.getManagerDetailsById(mid);

		    if (manager != null && owner != null && owner.getStatus().equalsIgnoreCase("Authorized")) {
		        owner.setStatus("Revoked");
		        owner.setManager(null);
		
		        return ownerDao.sendReq(owner);
		    }

		    return false;
		} 
	 
	 public boolean addHotelLogin(int id, String username, String password) {
		    Owner owner = ownerDao.getOwnerById(id);
		    if (owner != null && owner.getUsername().equals(username) && owner.getPassword().equals(password)
		            && owner.getStatus().equalsIgnoreCase("Authorized")) {
		        return true;
		    } else {
		        return false;
		    }
		}

 

}
