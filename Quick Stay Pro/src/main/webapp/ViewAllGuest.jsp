
<%@page import="com.jsp.dto.Guest"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.GuestService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>QSP Guest List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h1 class="mt-4">Guest List</h1>
    <% 
        GuestService guestService = new GuestService();
        List<Guest> guest = guestService.getAllGuests();
    %>
    <table class="table table-bordered mt-3">
        <thead>
            <tr>
                <th>ID</th>
                <th>Guest Name</th>
                <th>Phone Number</th>  
                <th>Number of Guest</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <% for (Guest g : guest) { %>
                <tr>
                    <td><%= g.getId() %></td>
                    <td><%= g.getGuestName() %></td>
                    <td><%= g.getPhoneNumber() %></td>  
                    <td><%= g.getNumberOfGuests() %></td>  
                    <td><%= g.getEmail()%></td>  
                    
                    <td>
                        <a href="checkin.jsp?userId=<%= g.getId() %>" class="btn btn-primary">Check-In</a>
                        <a href="checkout.jsp?userId=<%= g.getId() %>" class="btn btn-danger">Check-Out</a>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
