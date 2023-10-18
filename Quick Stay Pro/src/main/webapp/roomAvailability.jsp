<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Check and Update Room Availability</title>
</head>
<body>
    <div>
        <h2>Check and Update Room Availability</h2>
        <form action="your_servlet_url" method="post">
            <label for="managerId">Manager ID:</label>
            <input id="managerId" type="number" name="managerId" required/><br><br>

            <label for="roomId">Room ID:</label>
            <input id="roomId" type="number" name="roomId" required/><br><br>

            <label for="isAvailable">Room Availability:</label>
            <select id="isAvailable" name="isAvailable" required>
                <option value="true">Available</option>
                <option value="false">Not Available</option>
            </select><br><br>

            <button type="submit">Check and Update</button>
        </form>
    </div>
</body>
</html>