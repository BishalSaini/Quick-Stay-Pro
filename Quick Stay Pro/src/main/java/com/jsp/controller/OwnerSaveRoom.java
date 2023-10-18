package com.jsp.controller;


import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dto.Room;
import com.jsp.service.RoomService;


@WebServlet("/roomsave")
public class OwnerSaveRoom  extends HttpServlet{
		
 RoomService roomService=new RoomService();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					String roomtype= req.getParameter("roomtype");
					String roomstatus= req.getParameter("roomstatus");
					String roomprice= req.getParameter("roomprice");
					int roomp = Integer.parseInt(roomprice);
							
					Room room=new Room();
					room.setRoomtype(roomtype);
					room.setStatus(roomstatus);
					room.setPrice(roomp);
					
					HttpSession session = req.getSession();
					session.setAttribute("room", room);

					
				 Room room1=roomService.saveRoom(room);
					
					if(room1!=null) {
						RequestDispatcher requestDispatcher = req.getRequestDispatcher("ownerDashBoard.jsp");
						requestDispatcher.forward(req, resp);
					}
					else {
						RequestDispatcher requestDispatcher = req.getRequestDispatcher("OwnerSaveRoom.jsp");
						requestDispatcher.include(req, resp);
					}

}
}