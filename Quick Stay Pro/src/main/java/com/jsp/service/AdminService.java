package com.jsp.service;


	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.util.ArrayList;
	import java.util.List;

	import com.jsp.dao.AdminDao;
	import com.jsp.dao.ManagerDao;
	import com.jsp.dto.Admin;
	import com.jsp.dto.Manager;
import com.jsp.dto.User;


	public class AdminService {
		
		
		    AdminDao adminDao=new AdminDao();   
		    Admin admin=new Admin();
		    ManagerDao managerDao=new ManagerDao();
			
			public Admin saveAdminDetails(Admin Admins) { 
				return adminDao.saveAdminDetails(Admins);
			} 

			public Admin deleteAdminById(int id) {
				if (admin != null) {
					return adminDao.deleteAdminById(id)	;	
				}
				else {
					return null;
				}
			}
			
			public Admin updateAdminEmailById(int id, String username,String password) {
				if (admin != null) {
					return adminDao.updateAdminById(id, username, password);
				}
				else {
					return null;
				}
			}
			public Admin getAdminDetailsById(int id) { 
				return adminDao.getAdminDetailsById(id);
			}
			
			public List<Admin> getAllAdminDetails() {  
				List<Admin> admin = adminDao.getAllAdminDetails();
				return adminDao.getAllAdminDetails();
				
			}
		
			public boolean adminLogin(int id, String username, String password) {		
				Admin admin = adminDao.getAdminDetailsById(id);
				
				if(admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
					adminDao.saveAdminDetails(admin);
					return true;
				}
				else {
					return false;
				}
			}
			
			
			
			//To authorised 
			public boolean approveManagerById(int mid, int adminid) {
				Manager manager	=managerDao.getManagerDetailsById(mid);
				Admin admin=adminDao.getAdminDetailsById(adminid);
				if(manager!=null && admin!=null) {
					manager.setStatus("Authorized");
					manager.setAdmin(admin);  
					manager.setHiredate(LocalDate.now());
					  return managerDao.approveManager(manager);
					  
				}
				
					return false;
				}  
			
			public boolean rejectManagerById(int mid, int adminid) {
				Manager manager	=managerDao.getManagerDetailsById(mid);
				Admin admin=adminDao.getAdminDetailsById(adminid);
				if(manager!=null && admin!=null) {
					manager.setStatus("Rejected");
					manager.setAdmin(admin);  
					  return managerDao.approveManager(manager);
					 
				}
				
					return false;
				}  
}
