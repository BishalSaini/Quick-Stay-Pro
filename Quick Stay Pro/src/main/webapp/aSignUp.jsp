<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f2f2f2;
            font-family: 'Arial', sans-serif;
        }
        .container {
            margin-top: 50px;
            max-width: 400px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            padding: 20px;
        }
        .form-group label {
            font-weight: bold;
        }
        .form-control {
            border-radius: 5px;
        }
        .btn-primary {
            background-color: #007bff;
            border: none;
            width: 100%;
        }
        .btn-primary:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="save" class="form" method="post">
            <div class="form-group">
                <label for="name">Full Name:</label>
                <input id="name" class="form-control" type="text" name="name">
            </div>

            <div class="form-group">
                <label for="email">E-mail Address:</label>
                <input id="email" class="form-control" type="email" name="email">
            </div>

            <div class="form-group">
                <label for="cno">Mobile Number:</label>
                <input id="cno" class="form-control" type="tel"  name="cno">
            </div>

            <div class="form-group">
                <label for="username">Username:</label>
                <input id="username" class="form-control" type="text" name="username">
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input id="password" class="form-control" type="password" name="password">
            </div>

            <button type="submit" class="btn btn-primary">Create Account</button>
        </form>
    </div>
</body>
</html>
