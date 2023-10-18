package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.AdminService;

@WebServlet("/authorised")
public class AuthorisedManager extends HttpServlet { 
	AdminService adminService=new AdminService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String managerid=req.getParameter("managerid"); 
		int i=Integer.parseInt(managerid);  
		
		String adminid=req.getParameter("adminid"); 
		int i2=Integer.parseInt(adminid);
		
		boolean res= adminService.approveManagerById(i, i2);
		if(res==true) {  
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AdminDashBoard.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("authorisedManager.jsp"); 
			requestDispatcher.include(req, resp);

		}
	} 
}