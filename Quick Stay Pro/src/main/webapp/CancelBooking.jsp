<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }

    .container {
        background-color: #fff;
        padding: 90px;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
        width: 300px;
    }

    h2 {
        text-align: center;
    }

    label, input {
        display: block;
        margin-bottom: 15px;
    }

    input[type="text"], input[type="number"], input[type="date"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    #abc {
        background-color: #0074d9;
        color: #fff;
        border: none;
        padding: 10px 20px;
        border-radius: 4px;
        cursor: pointer;
    }

    #abc:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="container">
    <h2>Room Booking Details</h2>
    <form action="cancel" method="post"> 
        
        User ID: <input type="number" name="uid" required> <br><br>
        Hotel ID: <input type="number" name="hid" required> <br><br>
        Room ID: <input type="number" name="rid" value="<%= request.getParameter("id") %>" required> <br><br>
        Are you sure you want to book the room? <br><br>

        <input id="abc" type="submit" value="Click here to cancel">
    </form>
</div>
</body>
</html>
