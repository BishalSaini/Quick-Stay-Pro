package com.jsp.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/admin")
public class AdminDashBoard extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String GetAllManager=req.getParameter("viewAllManager");
		String RejectManager=req.getParameter("rejectManager");
		String AuthorisedManager=req.getParameter("authorisedManager");
		
		HttpSession httpSession = req.getSession();
		String name = (String) httpSession.getAttribute("username");
		
		if(GetAllManager!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllManager.jsp"); 
			requestDispatcher.forward(req, resp);  
	
		}else 
			if(RejectManager!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("rejectManager.jsp"); 
				requestDispatcher.forward(req, resp); 
				
			}else 
				if(AuthorisedManager!=null) { 
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("authorisedManager.jsp"); 
					requestDispatcher.forward(req, resp);
				}
	}
	

}
