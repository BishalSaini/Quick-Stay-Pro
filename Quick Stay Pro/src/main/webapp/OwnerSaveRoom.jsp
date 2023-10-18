<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room Update</title>
<style>
 body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 90px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
            width: 300px;
        }

        h2 {
            text-align: center;
        }

        label, input {
            display: block;
            margin-bottom: 15px;
        }

        input[type="text"] ,select{
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        #abc {
            background-color: #0074d9;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
        }

        #abc:hover {
            background-color: #0056b3;
        }
</style>

</head>
<body>
<div class="container">
        <h2>Room Details Update</h2>
        <form action="roomsave" method="post">
          Room Types: 
          
          <select name="roomtype" id="cars">
  		<option value="Executive Suite">Executive Suite</option>
  		<option value="Apartments">Apartments</option>
  		<option value="Executive Floor">Executive Floor</option>
  		<option value="Single Room">Single Room</option> 
  		<option value="Single Room">Premium Room</option>
		</select>
		<br> <br>
          
          Room Price <input type="text" name="roomprice" required> <br> <br>
          Status: <input type="text" name="roomstatus" required> <br> <br>
          
          <input id=abc type="submit">
          </form>
    </div>		

</body>
</html>