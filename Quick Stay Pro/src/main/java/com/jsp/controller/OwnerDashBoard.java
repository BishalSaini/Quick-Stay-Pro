package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OwnerDashBoard extends HttpServlet{ 
	
	@WebServlet("/owner")
	public class AdminDashBoard extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String lend=req.getParameter("lend");
			String revoke=req.getParameter("revoke"); 
			String addHotel=req.getParameter("addhotel");
			
			
			if(lend!=null) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("lendHotel.jsp"); 
				requestDispatcher.forward(req, resp);  
		
			}else 
				if(revoke!=null) { 
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("RevokeHotel.jsp"); 
					requestDispatcher.forward(req, resp); 
			
		}else {
			if(addHotel!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("savehotel.jsp"); 
				requestDispatcher.forward(req, resp); 
		
		}
	    } 
      } 
	} 
}
