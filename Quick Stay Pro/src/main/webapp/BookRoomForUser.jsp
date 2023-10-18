<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
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
        padding: 30px;
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

    input[type="text"], input[type="number"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    #abc {
        background-color: #ff3f80; 
        color: #fff;
        border: none;
        padding: 10px 20px;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
    }

    #abc:hover {
        background-color: #ff005e; 
    }
</style>

</head>
<body>
<div class="container">
    <h2>Book a Room</h2>
    <form action="bookroom" method="post">
        <label for="rid">Enter Room ID:</label>
        <input type="number" id="rid" name="rid" required value="<%=request.getParameter("id") %>">

        <label for="mid">Enter User ID:</label>
        <input type="number" id="mid" name="mid" required>

        <label for="managerid">Enter Manager ID:</label>
        <input type="number" id="managerid" name="managerid" required>

        <input type="submit" id="abc" value="Book Now">
    </form>
</div>
</body>
</html>