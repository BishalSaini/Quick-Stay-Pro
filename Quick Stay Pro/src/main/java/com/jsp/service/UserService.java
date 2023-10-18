package com.jsp.service;

import java.util.List;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class UserService {
	
	UserDao userDao = new UserDao();

	public User saveUser(User user) {
			return userDao.saveUser(user);

	}

	public boolean deleteUserById(int id, String username, String pass, String conpass) {
		User user = userDao.getUserById(id);		
		if(user.getUsername().equals(username) && user.getPassword().equals(pass) &&
				user.getPassword().equals(conpass)) {
			return userDao.deleteUserById(id);
		}
		return false;
	}

	public User updatePasswordById(int id, String old_pass, String new_pass) {
		User user = userDao.getUserById(id);
		if (user.getPassword().equals(old_pass)) {
			user.setPassword(new_pass);
			return userDao.updatePasswordById(user);
		}
		return null;
	}

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
	public boolean userLogin(int id, String username, String password) {		
		User user = userDao.getUserById(id);
		
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			userDao.saveUser(user);
			return true;
		}
		else {
			return false;
		}
	}

}