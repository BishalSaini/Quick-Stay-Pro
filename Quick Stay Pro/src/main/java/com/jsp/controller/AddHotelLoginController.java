package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Owner;
import com.jsp.service.OwnerService;

@WebServlet("/loggedin")
public class AddHotelLoginController extends HttpServlet { 
	
	OwnerService ownerService = new OwnerService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("oid");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		int oid=Integer.parseInt(id);
		Owner owners = new Owner();
		owners.setId(oid);
		owners.setPassword(password);
		owners.setUsername(username);
		
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("username", username);
		httpSession.setAttribute("password", password);

		boolean owner = ownerService.addHotelLogin(oid, username, password);
		
		if (owner == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("savehotel.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AddHotelLogin.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
