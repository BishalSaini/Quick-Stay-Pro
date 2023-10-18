package com.jsp.controller;

 
	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.jsp.service.RoomService;


	@WebServlet("/deleteroom")
	public class DeleteRoom extends HttpServlet {
		
		RoomService roomService=new RoomService();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String id=req.getParameter("id");
			int ide= Integer.parseInt(id);
			
			boolean room= roomService.deleteRoomById(ide);
			
			if(room==true) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("getallroom.jsp");
				requestDispatcher.forward(req, resp);
			}
			else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("deleteroom.jsp");
				requestDispatcher.include(req, resp);
			}
			
		}
		
}
