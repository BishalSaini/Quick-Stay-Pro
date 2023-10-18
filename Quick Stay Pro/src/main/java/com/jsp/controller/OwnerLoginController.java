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


@WebServlet("/ownerLogin")
public class OwnerLoginController extends HttpServlet {

	OwnerService ownerService = new OwnerService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String username = req.getParameter("username");
		String password = req.getParameter("pass");

		Owner owners = new Owner();
		owners.setName(id);
		owners.setPassword(password);
		owners.setUsername(username);
		
		int oid=Integer.parseInt(id);

		boolean owner = ownerService.ownerLogin(oid, username, password);
		
		if (owner == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ownerDashBoard.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ownerLogin.jsp");
			requestDispatcher.include(req, resp);
		}

	}
}