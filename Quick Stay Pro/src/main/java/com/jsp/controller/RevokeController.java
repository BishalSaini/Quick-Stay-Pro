package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.OwnerService;

@WebServlet("/revoke")
public class RevokeController extends HttpServlet { 
	
OwnerService ownerService=new OwnerService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String oid=req.getParameter("oid"); 
		int id=Integer.parseInt(oid); 
		
		String mid=req.getParameter("mid"); 
		int id2=Integer.parseInt(mid); 
		
		boolean res=ownerService.revokeHotel(id, id2) ;
		
		if(res==true) { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("revokeNextPage.jsp"); 
			
			requestDispatcher.forward(req, resp);
		}
			
		else { 
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RevokeHotel.jsp"); 
			requestDispatcher.include(req, resp);

		} 
	}


}
