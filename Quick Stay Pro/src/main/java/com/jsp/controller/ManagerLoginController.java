package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.ManagerService;

@WebServlet("/managerLogin")
public class ManagerLoginController extends HttpServlet{  
	
	ManagerService managerService = new ManagerService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String username = req.getParameter("username");
		String password = req.getParameter("pass");
		
		int i = Integer.parseInt(id);
		
		boolean manager = managerService.managerLogin(i, username, password); 
		if(manager==true) { 
			 	   
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ManagerDashBoard.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("managerLogin.jsp");
			requestDispatcher.include(req, resp);
		}
	} 
}
	