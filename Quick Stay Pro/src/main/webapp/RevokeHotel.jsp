<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Revoke Property - Owner Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa; /* Light gray background color */
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            max-width: 500px;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-control {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 10px;
        }
        .btn {
            font-size: 18px;
            margin-top: 20px;
            padding: 10px 30px;
            border-radius: 30px;
            background-color: #d9534f; /* OYO Red color */
            color: #fff;
            border: none;
        }
        .btn-pink {
            background-color: #ff3f80; /* OYO Pink color */
        }
        .btn-pink:hover {
            background-color: #ff005e; /* Slightly darker pink on hover */
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Revoke Property</h2>
        <form action="revoke" method="post">
            <div class="form-group">
                <label for="ownerId">Owner ID:</label>
                <input type="text" class="form-control" id="ownerId" name="oid" placeholder="Enter Owner ID" required>
            </div>
            <div class="form-group">
                <label for="managerId">Manager ID:</label>
                <input type text="text" class="form-control" id="managerId" name="mid" placeholder="Enter Manager ID" required>
            </div>
            <div class="form-group">
                <label for="reason">Reason for Revoke:</label>
                <textarea class="form-control" id="reason" name="reason" placeholder="Enter your reason for revoking the property" required></textarea>
            </div>
            <button class="btn btn-lg btn-block btn-pink" type="submit" name="revokeProperty">Revoke Property</button>
        </form>
    </div>
</body>
</html>
