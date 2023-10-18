package com.jsp.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/homed")
public class ManagerDashboard extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rejectOwner=req.getParameter("rowner"); 
		String approveOwner=req.getParameter("aowner"); 
		
		String viewAllOwner=req.getParameter("viewAllOwner");
		String viewAllUser=req.getParameter("viewAllUser");
		String viewAllhotel=req.getParameter("viewAllGuest");
		String viewAllRoom=req.getParameter("viewAllRoom");  
		
		if(rejectOwner!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("rejectOwner.jsp"); 
			requestDispatcher.forward(req, resp);  
	
		}else 
			if(approveOwner!=null) { 
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("approveOwner.jsp"); 
				requestDispatcher.forward(req, resp);  
			}else 
					if(viewAllOwner!=null) {
						RequestDispatcher requestDispatcher=req.getRequestDispatcher("ManagerViewAllOwner.jsp"); 
						requestDispatcher.forward(req, resp);  
	
					}else 
						if(viewAllUser!=null) { 
							RequestDispatcher requestDispatcher=req.getRequestDispatcher("ManagerViewAllUser.jsp"); 
							requestDispatcher.forward(req, resp); 
				
						}else 
							if(viewAllRoom!=null) { 
								RequestDispatcher requestDispatcher=req.getRequestDispatcher("ManagerViewAllRoom.jsp"); 
								requestDispatcher.forward(req, resp);
							}else 
								if(viewAllhotel!=null) { 
									RequestDispatcher requestDispatcher=req.getRequestDispatcher("ViewAllGuest.jsp"); 
									requestDispatcher.forward(req, resp);
	} 
	} 
}
