package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/save")
public class AdminSaveController extends HttpServlet { 
	
	AdminService adminService=new AdminService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name"); 
		String email=req.getParameter("email"); 
	
		String username=req.getParameter("username"); 
		String password=req.getParameter("pass");  
		
		String cno = req.getParameter("contact");
		
		long phno = Long.parseLong(cno);
		
		Admin admin=new Admin();   
		admin.setName(name);
		admin.setEmail(email); 
		admin.setPh_no(phno);
		admin.setUsername(username); 
		admin.setPassword(password);
		
		Admin a=adminService.saveAdminDetails(admin);
		if(a!=null) {   
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminLogin.jsp"); 
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveAdmin.jsp"); 
			requestDispatcher.include(req, resp); 
		} 
	} 
}