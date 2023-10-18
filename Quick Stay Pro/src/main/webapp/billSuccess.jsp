<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bill Generated Successfully</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Include Google Fonts for custom fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&family=Sacramento&display=swap" rel="stylesheet">
    <style>
       
        body {
            font-family: 'Open Sans', sans-serif;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        /* Heading style */
        .bill-heading {
            font-family: 'Sacramento', cursive;
            font-size: 3rem;
            color: #ff69b4; 
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
        }

        /* Button style */
        .btn-primary {
            background-color: #ff69b4; 
            border: none;
            transition: background-color 0.3s ease-in-out;
        }

        .btn-primary:hover {
            background-color: #ff1493; 
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="text-center">
            <h1 class="bill-heading">Bill Generated Successfully</h1>
            <p class="lead">Your bill has been generated successfully.</p>
            <p>Thank you for choosing our services.</p>
            

            <p><a href="bill.jsp" class="btn btn-primary mt-3">Generate Another Bill</a></p>
        </div>
    </div>
</body>
</html>
