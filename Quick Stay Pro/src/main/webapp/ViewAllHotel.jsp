<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.Hotel"%>
<%@page import="com.jsp.service.HotelService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Hotel</title>
    <link rel="stylesheet" href="your_stylesheet.css"> <!-- Add your custom stylesheet here -->
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Custom styles for the page */
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* Oyo background color */
            margin: 0;
            padding: 0;
        }

        .container {
            padding: 30px;
        }

        h1 {
            font-size: 36px;
            color: #ff3f80; /* Oyo Pink color */
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #ff3f80; /* Oyo Pink color */
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2; /* Alternate row color */
        }

        .btn {
            background-color: #ff3f80; /* Oyo Pink color */
            color: #fff;
            border: none;
            padding: 5px 10px;
            border-radius: 4px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #ff005e; /* Slightly darker pink on hover */
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Hotel List</h1>
        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Contact No</th>
                    <th>Rating</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    HotelService hotelService = new HotelService();
                    List<Hotel> hotels = hotelService.getAllHotels();

                    for (Hotel hotel : hotels) {
                %>
                <tr>
                    <td><%= hotel.getId() %></td>
                    <td><%= hotel.getHoTel_name() %></td>
                    <td><%= hotel.getHotel_Address() %></td>
                    <td><%= hotel.getEmail() %></td>
                    <td><%= hotel.getHotel_cno() %></td>
                    <td><%= hotel.getRating() %></td>
                    <td><%= hotel.getStatus() %></td>
                    <td>
                        <a href="GuestSave.jsp?id=<%= hotel.getId() %>" class="btn">Book Room</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
