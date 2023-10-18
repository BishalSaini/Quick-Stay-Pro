<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Quick Stay Pro Admin</title>
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
            background-color: #FF3F80; 
            color: #fff;
            border: none;
            text-transform: uppercase;
            text-decoration: none;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .btn:hover {
            background-color: #FF005E; 
        }
        .welcome-message {
            font-size: 28px;
            color: #333;
            margin-bottom: 20px;
        }
        .additional-info {
            font-size: 16px;
            color: #555;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<form action="adminLogin" method="post">
    <div class="container">
        <p class="welcome-message">Welcome to Quick Stay Pro Admin</p>
        <p class="additional-info">Your Gateway to Admin Control</p>
        <p class="additional-info">Manage and monitor your hotel properties with Quick Stay Pro Admin.</p>
        <a href="adminLogin.jsp" class="btn btn-primary" name="login">Login</a>
        <a href="adminSignUp.jsp" class="btn btn-success" name="signUp">Sign Up</a>
    </div>
</form>
</body>
</html>
