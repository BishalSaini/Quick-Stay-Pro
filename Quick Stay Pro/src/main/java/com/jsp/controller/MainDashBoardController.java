package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QSP")
public class MainDashBoardController extends HttpServlet { 
	        
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	{
	String admin =req.getParameter("admin");
	String manager=req.getParameter("manager");
	String owner=req.getParameter("owner"); 
	String user=req.getParameter("user"); 

	
	if(admin!=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("adminStartPage.jsp"); 
		requestDispatcher.forward(req, resp);  

	}else 
		if(manager!=null) { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("managerStartPage.jsp"); 
			requestDispatcher.forward(req, resp); 
			
		}else 
			if(owner!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("ownerStartPage.jsp"); 
				requestDispatcher.forward(req, resp);
			}else 
				if(user!=null) { 
					RequestDispatcher requestDispatcher=req.getRequestDispatcher("userStartPage.jsp"); 
					requestDispatcher.forward(req, resp);
		
	}
	} 
	}
}