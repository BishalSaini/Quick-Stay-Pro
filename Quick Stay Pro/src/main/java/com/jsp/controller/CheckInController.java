package com.jsp.controller;



import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.OwnerService;
import com.jsp.service.RoomService;

@WebServlet("/checkIn")
public class CheckInController extends HttpServlet {
    RoomService roomService = new RoomService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String managerId = req.getParameter("mid");
        //int managerIdInt = Integer.parseInt(managerId);

        //String guestId = req.getParameter("gid");
        //int gid = Integer.parseInt(guestId);
        
        String roomid = req.getParameter("rid");
        int rid = Integer.parseInt(roomid);

        String hotelid = req.getParameter("hid");
        int hid = Integer.parseInt(hotelid); 

        boolean checkInResult = roomService.checkIn(rid, hid);

        if (checkInResult==true) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("checkInSuccess.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("checkin.jsp");
            requestDispatcher.include(req, resp);
        }
    }
}
