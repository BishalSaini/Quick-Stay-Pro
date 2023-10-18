package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;



@WebServlet("/cancel")
public class UserCancelBooking extends HttpServlet {
	
	RoomService roomService=new RoomService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id= req.getParameter("rid");
		int rid= Integer.parseInt(id);
		
		String id2=req.getParameter("hid"); 
		int hid= Integer.parseInt(id); 
		
		String id3= req.getParameter("uid");
		int uid= Integer.parseInt(id);

		Room room= roomService.cancelRoomBooking(rid, hid,uid);
	
		if(room!=null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("UserDashBoard.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("UserClickBookRoom.jsp");
			requestDispatcher.include(req, resp);
		}
	}
		
		
		
	}
	