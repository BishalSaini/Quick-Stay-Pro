<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manager Dashboard - Quick Stay Pro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }

        .container {
            margin-top: 50px;
        }

        .welcome-msg {
            text-align: center;
            font-size: 24px;
            color: #333333; /* Dark text color */
            margin-bottom: 20px;
        }

        .btn-group {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-wrap: wrap;
            margin-top: 20px;
        }

        .btn-container {
            flex: 0 0 50%;
            max-width: 50%;
            padding: 10px;
        }

        .btn-primary {
            background-color: #ff3f80; 
            border-color: #ff3f80;
        }

        .btn-primary:hover {
            background-color: #ff005e; 
            border-color: #ff005e;
        }

        .btn-danger {
            background-color: #ff0000; 
            border-color: #ff0000;
        }

        .btn-danger:hover {
            background-color: #cc0000; 
            border-color: #cc0000;
        }

        .btn-warning {
            background-color: #ffbb00;
            border-color: #ffbb00;
        }

        .btn-warning:hover {
            background-color: #cc9900; 
            border-color: #cc9900;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Welcome to Quick Stay Pro Manager Dashboard</h1>
        <p class="welcome-msg">Manage your property listings and users with ease.</p>
        <div class="btn-group">
            <div class="btn-container">
                <form action="homed" method="post">
                    <button type="submit" class="btn btn-warning btn-lg btn-block" name="aowner">Approve Owner</button>
                </form>
            </div>
            <div class="btn-container">
                <form action="homed" method="post">
                    <button type="submit" class="btn btn-warning btn-lg btn-block" name="rowner">Reject Owner</button>
                </form>
            </div> 
            
            <div class="btn-container">
                <form action="homed" method="post">
                    <button type="submit" class="btn btn-primary btn-lg btn-block" name="viewAllOwner">View All Owners</button>
                </form>
            </div>
            <div class="btn-container">
                <form action="homed" method="post">
                    <button type="submit" class="btn btn-danger btn-lg btn-block" name="viewAllUser">View All Users</button>
                </form>
            </div>  
            
            <div class="btn-container">
                <form action="homed" method="post">
                    <button type="submit" class="btn btn-danger btn-lg btn-block" name="viewAllGuest">View All Guest</button>
                </form>
            </div> 
         	  
            <div class="btn-container">
                <form action="home" method="post">
                    <button type="submit" class="btn btn-warning btn-lg btn-block" name="viewAllRoom">View All Rooms</button>
                </form> 
            </div> 
        </div>
    </div>
</body>
</html>