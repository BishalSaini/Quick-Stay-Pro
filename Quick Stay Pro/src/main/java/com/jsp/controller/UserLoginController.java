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



@WebServlet("/userLogin")
public class UserLoginController extends HttpServlet {
	
	UserService userService = new UserService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		String id = req.getParameter("id");
		int userid = Integer.parseInt(id);

		

		boolean u = userService.userLogin(userid, username, password);
		
		if(u==true) { 
			 User user = userService.getUserById(userid); 
	            HttpSession session = req.getSession();
	            session.setAttribute("loggedInUser", user);
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("UserDashBoard.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("userLogin.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}