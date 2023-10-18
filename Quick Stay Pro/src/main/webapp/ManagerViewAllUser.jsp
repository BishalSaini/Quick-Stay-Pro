<%@page import="com.jsp.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.UserService"%>
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
    <h1 class="mt-4">User List</h1>
    <% 
        UserService userService = new UserService();
        List<User> users = userService.getAllUsers();
    %>
    <table class="table table-bordered mt-3">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Phone Number</th> 
                
            </tr>
        </thead>
        <tbody>
            <% for (User user : users) { %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getCno() %></td>  
                    <td> 
                </tr>
            <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
