<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Owner Dashboard - Quick Stay Pro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f2f2f2; 
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container {
            text-align: center;
        }
        .btn {
            font-size: 24px;
            margin: 20px;
            padding: 10px 30px;
            border-radius: 30px;
            color: #fff;
            border: none;
            text-transform: uppercase;
        }
        .btn-primary {
            background-color: #ff3f80;
        }
        .btn-primary:hover {
            background-color: #ff005e;
        }
        .btn-secondary {
            background-color: #d00000;
        }
        .btn-secondary:hover {
            background-color: #ad0f0f; 
        }
        .welcome-message {
            font-size: 28px;
            color: #333;
            margin-bottom: 20px;
        }
        .message {
            font-size: 18px;
            color: #555;
            margin-bottom: 20px;
        }
        .interesting-content {
            font-size: 20px;
            color: #007bff; /* Blue color */
            margin-bottom: 20px;
        }
        .owner-actions {
            font-size: 22px;
            color: #333;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <form action="owner" method="post">
        <div class="container">
            <p class="welcome-message">Welcome to Quick Stay Pro</p>
            <p class="owner-actions">As an owner, you can lend, revoke, or add your property with ease. Please select an option below:</p>
            <a href="lendHotel.jsp" class="btn btn-primary" name="lendproperty">Lend Property</a>
            <a href="RevokeHotel.jsp" class="btn btn-secondary" name="revokeproperty">Revoke Property</a>
            <a href="AddHotelLogin.jsp" class="btn btn-primary" name="addhotel">Add Hotel</a>
        </div>
    </form>
</body>
</html>
