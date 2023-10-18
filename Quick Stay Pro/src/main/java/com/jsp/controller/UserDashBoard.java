package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/user")
public class UserDashBoard extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String BookRoom=req.getParameter("broom");
		
		String ViewHotels=req.getParameter("viewhotels");
		
		if(BookRoom!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("GuestSave.jsp"); 
			requestDispatcher.forward(req, resp);  
	
		}else 
			if(ViewHotels!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("ViewAllHotel.jsp"); 
				requestDispatcher.forward(req, resp); 
				
	} 
	}
	

}
