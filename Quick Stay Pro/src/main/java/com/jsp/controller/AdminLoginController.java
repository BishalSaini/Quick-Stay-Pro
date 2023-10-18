package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/adminLog")
public class AdminLoginController extends HttpServlet{  
	
	AdminService adminService = new AdminService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		int i = Integer.parseInt(id);
		
				
		boolean admin = adminService.adminLogin(i, username, password);
		
		if(admin==true) { 
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminDashBoard.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminLogin.jsp");
			requestDispatcher.include(req, resp);
		}
	} 
}
	