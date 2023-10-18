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


	@WebServlet("/roomupdateprice")
	public class UpdateRoomPrice extends HttpServlet {
		
		RoomService roomService= new RoomService();
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id= req.getParameter("roomid");
			int ide= Integer.parseInt(id);
			String price= req.getParameter("roomprice");
			int pricee= Integer.parseInt(price);
			
			Room room= roomService.updateRoomPriceById(ide, pricee);
			
			if(room!=null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(req, resp);
			}
			else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveroom.jsp");
				requestDispatcher.include(req, resp);
			}
		}
}
