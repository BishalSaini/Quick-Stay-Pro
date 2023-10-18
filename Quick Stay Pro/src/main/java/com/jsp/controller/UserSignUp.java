package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.User;
import com.jsp.service.UserService;

@WebServlet("/usersave")
public class UserSignUp extends HttpServlet { 
	
	UserService userService=new UserService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name"); 
		String email=req.getParameter("email"); 
		String phone_no=req.getParameter("contact");
		String username=req.getParameter("username"); 
		String password=req.getParameter("pass");  
		long phone_no1= Long.parseLong(phone_no);
		
		User user=new User();   
		user.setName(name);  
		user.setEmail(email);
		user.setUsername(username); 
		user.setPassword(password); 
		user.setCno(phone_no1); 
		
		
		
	    User u=	userService.saveUser(user);
		if(u!=null) {   
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("userLogin.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("userSignUp.jsp"); 
			requestDispatcher.include(req, resp);

		}
		}
}