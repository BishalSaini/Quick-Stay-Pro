package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/startPageO")
public class OwnerStartPageController extends HttpServlet { 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login=req.getParameter("login"); 
		String signup=req.getParameter("signUp"); 
		
		if(login!=null) { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("ownerLogin.jsp"); 
			requestDispatcher.forward(req, resp); 
		}else { 
			if(signup!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("ownerSignUp.jsp"); 
				requestDispatcher.forward(req, resp); 

			}
		}
	}

}