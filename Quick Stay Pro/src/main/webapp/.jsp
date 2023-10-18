
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manager Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f2f2f2;
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
        .form-title {
            text-align: center;
            font-size: 24px;
            margin-bottom: 20px;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-title">Manager Registration</div>
        <form action="saveM" class="form" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input id="name" class="form-control" placeholder="Full Name" type="text" name="name"/>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input id="email" class="form-control" placeholder="Email Address" type="email" name="email"/>
            </div>

            <div class="form-group">
                <label for="phno">Phone Number:</label>
                <input id="phno" class="form-control" placeholder="Phone Number" type="text" name="phno"/>
            </div>

            <div class="form-group">
                <label for="status">Status:</label>
                <input id="status" class="form-control" placeholder="Status" type="text" name="status"/>
            </div>

            <div class="form-group">
                <label for="uname">Username:</label>
                <input id="uname" class="form-control" placeholder="Username" type="text" name="uname"/>
            </div>

            <div class="form-group">
                <label for="pass">Password:</label>
                <input id="pass" class="form-control" placeholder="Password" type="password" name="pass"/>
            </div>

            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>
</body>
</html>