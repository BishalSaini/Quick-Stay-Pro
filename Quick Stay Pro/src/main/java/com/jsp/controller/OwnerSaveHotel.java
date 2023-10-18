package com.jsp.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Hotel;
import com.jsp.service.HotelService;


@WebServlet("/savehotel")
public class OwnerSaveHotel extends HttpServlet {
	
	HotelService hotelService=new HotelService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String hotelname = req.getParameter("hotelname");
		String hoteladdress = req.getParameter("hoteladdress");
		String email = req.getParameter("email");
		String hotelcno = req.getParameter("hotelcno");
		long hotelcnol= Long.parseLong(hotelcno);
		String No_of_room_available = req.getParameter("No_of_room_available");
		int roomavailable = Integer.parseInt(No_of_room_available);
		String rat= req.getParameter("ratings");
		int ratings=Integer.parseInt(rat);
		
			Hotel hotel=new Hotel();
			hotel.setHoTel_name(hotelname);
			hotel.setHotel_Address(hoteladdress);
			hotel.setEmail(email);
			hotel.setHotel_cno(hotelcnol);
			hotel.setNo_of_room_available(roomavailable);
			hotel.setRating(ratings);
			
			Hotel hotel2= hotelService.saveHotel(hotel);
			
			if (hotel2 != null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("SaveRoom.jsp");
				requestDispatcher.forward(req, resp);
			} else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("savehotel.jsp");
				requestDispatcher.include(req, resp);
			}
		
	}
	
	

}
