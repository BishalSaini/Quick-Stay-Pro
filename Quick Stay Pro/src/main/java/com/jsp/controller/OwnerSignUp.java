package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Owner;
import com.jsp.service.OwnerService;

@WebServlet("/signup")
public class OwnerSignUp extends HttpServlet {

	OwnerService ownerService = new OwnerService();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phno = req.getParameter("contact"); 
		long ph_no=Long.parseLong(phno); 
		String username=req.getParameter("username"); 
		String password = req.getParameter("pass");
  
       
		Owner owner = new Owner();
		owner.setName(name);
		owner.setEmail(email);
		owner.setPh_no(ph_no); 
		owner.setUsername(username);
		owner.setPassword(password); 
		

		Owner o = ownerService.saveOwner(owner);

		if (o != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ownerLogin.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ownerSignUp.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}