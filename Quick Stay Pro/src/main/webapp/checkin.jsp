<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Check-In</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url("images/final.jpg"); 
            background-size: cover;
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
        }

        .container {
            background-color: #fff;
            max-width: 500px;
            margin: 20px auto;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            border-radius: 5px;
            text-align: center;
        }

        h1 {
            color: #ff3f80;
        }

        .form-group {
            margin: 15px 0;
            text-align: center;
        }

        label {
            display: block;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        button {
            background-color: #ff3f80; 
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        button:hover {
            background-color: #ff005e; 
        }
    </style>
</head>
<body>
    <div class="overlay">
        <div class="container">
            <h1>Check-In</h1>
            <form action="checkIn" method="post"> 
                <div class="form-group">
                    <label for="rid">Room ID</label>
                    <input type="text" class="form-control" id="rid" name="rid" required>
                </div>
                <div class="form-group">
                    <label for="hid">Hotel ID</label>
                    <input type="text" class="form-control" id="hid" name="hid" required>
                </div>
         
                <button type="submit" class="btn btn-primary">Check-In</button>
            </form>
        </div>
    </div>
</body>
</html>
