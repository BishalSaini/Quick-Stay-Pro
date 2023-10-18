<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check-Out</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-image: url("images/final.jpg");
	/* Replace with your image path */
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
	<div class="container">
		<h1>Check-Out</h1>
		<form action="checkOut" method="post">
			<div class="form-group">
				<label for="rid">Room ID</label> <input type="text"
					class="form-control" id="rid" name="rid" required>
			</div>


			<button type="submit" class="btn btn-primary">Check-Out</button>
		</form>
	</div>
</body>
</html>
