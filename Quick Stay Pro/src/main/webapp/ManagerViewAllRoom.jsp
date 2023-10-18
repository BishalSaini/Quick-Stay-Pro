<%@page import="com.jsp.dto.Room"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.RoomService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HMS Room List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body> 
<div class="container">
    <h1 class="mt-4">Room List</h1>
    <% 
        RoomService roomService = new RoomService();
        List<Room> rooms = roomService.getAllRoom();
    %>
    <table class="table table-bordered mt-3">
        <thead>
            <tr>
                <th>ID</th>
                <th>Price</th>
                <th>Room Type</th>
                <th>Status</th> 
            </tr>
        </thead>
        <tbody>
            <% for (Room room : rooms) { %>
                <tr>
                    <td><%= room.getId() %></td>
                    <td><%= room.getPrice() %></td>
                    <td><%= room.getRoomtype() %></td>
                    <td><%= room.getStatus() %></td>
                </tr>
            <% } %>
        </tbody>
    </table> 
</div>
</body>
</html>
