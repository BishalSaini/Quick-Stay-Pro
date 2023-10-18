<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thank You | Quick Stay Pro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* OYO background color */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            text-align: center;
            background-color: #ffffff; /* OYO card background color */
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
            width: 300px;
        }

        h2 {
            color: #333; /* Dark text color */
        }

        p {
            color: #777; /* Gray text color */
        }

        .btn-primary {
            background-color: #ff3f80; /* OYO Pink color */
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-top: 20px;
        }

        .btn-primary:hover {
            background-color: #ff005e; /* Slightly darker pink on hover */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Thank You!</h2>
        <p>Request Successfull</p>
        <a href="ownerDashBoard.jsp" class="btn btn-primary">Back to Home</a>
    </div>
</body>
</html>
