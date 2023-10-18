<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Generate Bill</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    
    <style>
       
        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f8f9fa;
            border: 1px solid #ced4da;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
 		text-align: center;
        color: #000;         }

       
        .form-group label {
            color: #000;
        }

     
     
        .btn-primary {
            background-color: #ff3f80;
            border-color: #ff3f80;
        }

        .btn-primary:hover {
            background-color: #ff005e; 
            border-color: #ff005e;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Quick Stay Pro Bill</h1>
        <form action="generateBill" method="post">
            <div class="form-group">
                <label for="guestName">Guest Name</label>
                <input type="text" class="form-control" id="guestName" name="guestName" required>
            </div>
            <div class="form-group">
                <label for="checkInDate">Check-In Date</label>
                <input type="date" class="form-control" id="checkInDate" name="checkInDate" required>
            </div>
            <div class="form-group">
                <label for="checkOutDate">Check-Out Date</label>
                <input type="date" class="form-control" id="checkOutDate" name="checkOutDate" required>
            </div>
            <div class="form-group">
                <label for="roomRate">Room Rate</label>
                <input type="text" class="form-control" id="roomRate" name="roomRate" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Generate Bill</button>
        </form>
    </div>
</body>
</html>
