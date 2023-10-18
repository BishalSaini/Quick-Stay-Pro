<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quick Stay Pro User Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* Quick Stay Pro background color */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background-color: #ffffff; /* Quick Stay Pro card background color */
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
            width: 300px;
        }

        h2 {
            text-align: center;
            color: #333; /* Dark text color */
        }

        input[type="submit"] {
            background-color: #ff3f80; /* Quick Stay Pro Pink color */
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-bottom: 15px;
        }

        input[type="submit"]:hover {
            background-color: #ff005e; /* Slightly darker pink on hover */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Welcome to Quick Stay Pro User Dashboard</h2>
        <form action="user" method="post">
            <input type="submit" value="Book a Room" name="broom">
            <input type="submit" value="View Hotels" name="viewhotels">
        </form>
    </div>
</body>
</html>
