<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Hotel</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 48px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h2>Add Hotel</h2>
    <form action="savehotel" method="post">
        <label for="hotelname">Hotel Name:</label>
        <input type="text" id="hotelname" name="hotelname" required><br>

        <label for="hoteladdress">Hotel Address:</label>
        <input type="text" id="hoteladdress" name="hoteladdress" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="hotelcno">Contact Number:</label>
        <input type="text" id="hotelcno" name="hotelcno" required><br>

        <label for="No_of_room_available">Number of Rooms Available:</label>
        <input type="text" id="No_of_room_available" name="No_of_room_available" required><br>

        <label for="ratings">Ratings:</label>
        <input type="text" id="ratings" name="ratings" required><br>

        <input type="submit" value="Save">
    </form>
</body>
</html>
