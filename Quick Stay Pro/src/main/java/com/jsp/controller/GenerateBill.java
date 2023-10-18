package com.jsp.controller;

import com.jsp.dto.Bill;
import com.jsp.dto.Room;
import com.jsp.dto.User;
import com.jsp.service.BillService;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/generateBill")
public class GenerateBill extends HttpServlet {
    private BillService billService = new BillService();
    Bill bill=new Bill();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String guestName = req.getParameter("guestName");
        String checkInDateStr = req.getParameter("checkInDate");
        String checkOutDateStr = req.getParameter("checkOutDate");
        String roomRateStr = req.getParameter("roomRate"); 
        
        HttpSession session = req.getSession();
        session.setAttribute("guestName", guestName);
        session.setAttribute("checkInDate", checkInDateStr);
        session.setAttribute("checkOutDate", checkOutDateStr);
        session.setAttribute("roomRate", roomRateStr);
        session.setAttribute("totalAmount", bill.getTotalAmount());

        if (guestName != null && checkInDateStr != null && checkOutDateStr != null && roomRateStr != null) {
            LocalDate checkInDate = LocalDate.parse(checkInDateStr);
            LocalDate checkOutDate = LocalDate.parse(checkOutDateStr);

                double roomRate = Double.parseDouble(roomRateStr);

                Bill bill = billService.generateBill(guestName, checkInDate, checkOutDate, roomRate);

                if (bill != null) { 
                	
                
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("billSuccess.jsp");
                    requestDispatcher.forward(req, resp);
                } else {
                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("generateBill.jsp");
                    requestDispatcher.include(req, resp);
                } 
            } 
    } 
}
