<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<%@ page import="com.jsp.dto.User" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quick Stay Pro - Guest Information</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="container">
    <h1 class="mt-4">Guest Information</h1>
    <form action="Guest" method="post"> 
        <input type="hidden" name="userId" value="<%= ((User) session.getAttribute("loggedInUser")).getId() %>">
      

        <div class="form-group">
            <label for="guestName">Guest Name</label>
            <input type="text" class="form-control" id="guestName" name="guestName" required>
        </div>
        <div class="form-group">
            <label for="numberOfGuests">Number of Guests</label>
            <input type="number" class="form-control" id="numberOfGuests" name="numberOfGuests" required>
        </div>
        <div class="form-group">
            <label for="phoneNumber">Phone Number</label>
            <input type="tel" class="form-control" id="phoneNumber" name="phoneNumber" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Submit</button>
    </form>
</div>
</body>
</html>
