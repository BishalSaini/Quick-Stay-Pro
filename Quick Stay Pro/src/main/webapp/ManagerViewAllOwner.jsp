<%@page import="com.jsp.dto.Owner"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.OwnerService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Owner List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body> 

<div class="container">
    <h1 class="mt-4">Owner List</h1>
    <% 
        OwnerService ownerService = new OwnerService();
        List<Owner> owners = ownerService.getAllOwners();
    %>
    <table class="table table-bordered mt-3">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone Number</th> 
                <th>Status</th>  
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <% for (Owner owner : owners) { %>
                <tr>
                    <td><%= owner.getId() %></td>
                    <td><%= owner.getName() %></td>
                    <td><%= owner.getEmail() %></td>
                    <td><%= owner.getPh_no() %></td> 
                    <td><%= owner.getStatus() %></td>  
                    <td>
                        <a href="approveOwner.jsp?id=<%= owner.getId() %>" class="btn btn-danger btn-sm">Approve</a>
                        <a href="rejectOwner.jsp?id=<%= owner.getId() %>" class="btn btn-primary btn-sm">Reject</a>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table> 
</div>

</body>
</html>